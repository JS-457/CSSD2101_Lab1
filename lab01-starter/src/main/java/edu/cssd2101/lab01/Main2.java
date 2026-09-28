package edu.cssd2101.lab01;

import java.util.List;

/**
 * Debug class for testing different classes of Book, BookArrayUtils, etc.
 */
public class Main2 {
    private Main2() {
    }

    /**
     * Debug method for testing different classes
     *
     * @param args ignored command-line arguments
     */
    public static void main(String[] args) {
        try {
            //Book b1 = new Book("123456789012332", "Programming with Java", "Sayed Shah", 1250, 2023); // incorrect ISBN
            //Book b2 = new Book("7894539331", "", "Sayed Shah", 1250, 2024); // Empty title
            //Book b3 = new Book("1234567890123", "Programming with C++", null, 1250, 2023); // Null title
            // Book b4 = new Book("7894539332", "Programming with C", "Sayed Shah", 1250, 20024); // incorrect dates
            Book b4 = new Book("7894539332", "Programming with C", "Sayed Shah", 1250, 2024);
            Book b5 = new Book("789-453-933-1", "Programming with C", "Sayed Shah", 1250, 2024);

            System.out.println(b5.toString());
            System.out.println(b4.equals(b5));


            demonstrate("ArrayList", new ArrayListBookstore(), b4, b5);
            demonstrate("FixedArray", new FixedArrayBookstore(5), b4, b5);

            System.out.println("All conditions met. Program has passed.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error detected: " + e.getMessage());
        } catch (NullPointerException n) {
            System.out.println("Error detected: " + n.getMessage());
        }


    }

    private static void demonstrate(String label, BookstoreAPI store, Book b4, Book b5) {
        store.add(new Book("9780134685991", "Effective Java", "Joshua Bloch", 4599, 2018));
        store.add(new Book("0132350882", "Clean Code", "Robert Martin", 3299, 2008));
        store.add(b4);
        store.add(b5);

        System.out.println(label + " size=" + store.size());
        System.out.println("found=" + store.findByIsbn("978-0134685991").orElseThrow().title());
        System.out.println("snapshot=" + store.allBooks());
        System.out.println("Books equal: " + store.findByIsbn("9780134685991").equals(store.findByIsbn("0132350882")) + "\n");

        System.out.println(store.findByTitle("Effective Java"));
        System.out.println(store.inventoryValueCents());
        System.out.println(store.mostRecent());
    }
}
