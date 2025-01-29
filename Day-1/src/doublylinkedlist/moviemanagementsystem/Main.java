package doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();

        mms.addAtEnd("Inception", "Christopher Nolan", 2010, 9.0);
        mms.addAtBeginning("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        mms.addAtPosition("Interstellar", "Christopher Nolan", 2014, 8.6, 1);


        System.out.println("Movies in Forward Order:");
        mms.displayForward();

        System.out.println("\nMovies in Reverse Order:");
        mms.displayReverse();

        System.out.println("\nSearching for movies by Christopher Nolan:");
        mms.searchByDirectorOrRating("Christopher Nolan", null);

        System.out.println("\nUpdating Rating for Inception:");
        mms.updateRatingByTitle("Inception", 9.5);
        mms.displayForward();

        System.out.println("\nDeleting Movie: The Godfather");
        mms.removeByTitle("The Godfather");
        mms.displayForward();

        System.out.println("\nTotal Movies: " + mms.getSize());
    }
}
