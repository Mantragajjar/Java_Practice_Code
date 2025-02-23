import javax.imageio.ImageIO;  
import java.awt.image.BufferedImage;  
import java.io.File;  
import java.io.IOException;  

public class Steganography {  

    // Method to encrypt and embed text in an image  
    public static void encrypt(String message, String imagePath, String outputPath) throws IOException {  
        BufferedImage image = ImageIO.read(new File(imagePath));  
        int messageIndex = 0;  
        int messageLength = message.length();  
        
        // Convert message to binary  
        StringBuilder binaryMessage = new StringBuilder();  
        for (char character : message.toCharArray()) {  
            String binaryChar = String.format("%08d", Integer.parseInt(Integer.toBinaryString(character)));  
            binaryMessage.append(binaryChar);  
        }  
        
        // Ensure to account for the message ending  
        binaryMessage.append("00000000"); // End of message delimiter  
        
        // Embed the binary message into the image pixels  
        for (int i = 0; i < image.getHeight(); i++) {  
            for (int j = 0; j < image.getWidth(); j++) {  
                int pixel = image.getRGB(j, i);  
                
                if (messageIndex < binaryMessage.length()) {  
                    // Get the RGB components  
                    int r = (pixel >> 16) & 0xff;  
                    int g = (pixel >> 8) & 0xff;  
                    int b = pixel & 0xff;  
                    
                    // Replace the LSB of the red component with the next bit of the message  
                    if (binaryMessage.charAt(messageIndex) == '1') {  
                        r = (r | 1); // Set LSB to 1  
                    } else {  
                        r = (r & 0xFE); // Set LSB to 0  
                    }  
                    messageIndex++;  
                    
                    // Set the modified pixel back to the image  
                    pixel = (r << 16) | (g << 8) | b;  
                    image.setRGB(j, i, pixel);  
                } else {  
                    break; // Stop when the message is embedded  
                }  
            }  
            if (messageIndex >= binaryMessage.length()) {  
                break; // Stop if the message is fully embedded  
            }  
        }  
        
        // Save the new image  
        ImageIO.write(image, "png", new File(outputPath));  
    }  
    
    // Method to extract the hidden message from an image  
    public static String decrypt(String imagePath) throws IOException {  
        BufferedImage image = ImageIO.read(new File(imagePath));  
        StringBuilder binaryMessage = new StringBuilder();  
        
        // Read the LSB of each pixel to decode the message  
        for (int i = 0; i < image.getHeight(); i++) {  
            for (int j = 0; j < image.getWidth(); j++) {  
                int pixel = image.getRGB(j, i);  
                int r = (pixel >> 16) & 0xff;  
                binaryMessage.append(r & 1); // Get the LSB  
            }  
        }  
        
        // Convert binary string to characters  
        StringBuilder message = new StringBuilder();  
        for (int i = 0; i < binaryMessage.length(); i += 8) {  
            String byteString = binaryMessage.substring(i, Math.min(i + 8, binaryMessage.length()));  
            if (byteString.equals("00000000")) {  
                break; // End of message delimiter  
            }  
            int charCode = Integer.parseInt(byteString, 2);  
            message.append((char)charCode);  
        }  
        
        return message.toString();  
    }  
    
    public static void main(String[] args) {  
        try {  
            String message = "Hello, this is a secret message!";  
            String imagePath = ""C:\Users\vishw\Downloads\Screenshot 2025-02-06 205714.png""; // Input image path  
            String outputPath = "output.png"; // Output image path  
            
            encrypt(message, imagePath, outputPath);  
            System.out.println("Message embedded successfully!");  
            
            String extractedMessage = decrypt(outputPath);  
            System.out.println("Extracted Message: " + extractedMessage);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}