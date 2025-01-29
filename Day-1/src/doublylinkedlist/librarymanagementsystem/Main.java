package doublylinkedlist.librarymanagementsystem;

public class Main {
        public static void main(String[] args) {
            LibraryManagementSystem library = new LibraryManagementSystem();
            library.addAtEnd("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 101, true);
            library.addAtBeginning("1984", "George Orwell", "Dystopian", 102, true);
            library.addAtPosition("To Kill a Mockingbird", "Harper Lee", "Classic", 103, true, 1);

            System.out.println("Library (Forward):");
            library.displayForward();

            System.out.println("\nLibrary (Reverse):");
            library.displayReverse();

            System.out.println("\nSearching for '1984':");
            library.searchBook("1984");

            System.out.println("\nUpdating availability for Book ID 102:");
            library.updateAvailability(102, false);
            library.displayForward();

            System.out.println("\nCounting books:");
            library.countBooks();

            System.out.println("\nRemoving Book with ID 101:");
            library.removeByBookId(101);
            library.displayForward();
        }
    }


