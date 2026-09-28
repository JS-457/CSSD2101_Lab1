package edu.cssd2101.lab01;

/**
 * Debug class for testing different classes of Book, BookArrayUtils, etc.
 */
public class Main2 {
    private Main2(){}
    /**
     * Debug method for testing different classes
     *
     * @param args ignored command-line arguments
     */
    public static void main(String[] args) {
        try {
            //Book b1 = new Book("123456789012332", "Programming with Java", "Sayed Shah", 1250, 2023); // incorrect ISBN
            //Book b2 = new Book("7894539331", "", "Sayed Shah", 1250, 2024); // Empty title
            //Book b3 = new Book("1234567890123", "Programming with C++", null, 1250, 2023);
            Book b4 = new Book("7894539331", "Programming with C", "Sayed Shah", 1250, 2024);
            Book b5 = new Book("789-453-933-1", "Programming with C++", "Sayed Shah", 1250, 2024);

            System.out.println(b5.toString());
            System.out.println(b4.equals(b5));
            System.out.println("All conditions met. Program has passed.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error detected: " + e.getMessage());
        } catch (NullPointerException n) {
            System.out.println("Error detected: " + n.getMessage());
        }


    }
}
