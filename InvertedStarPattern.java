public class InvertedStarPattern 
{
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        
        // Outer loop for each row
        for (int i = rows; i >= 1; i--) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing all stars in a row
            System.out.println();
        }
    }
}