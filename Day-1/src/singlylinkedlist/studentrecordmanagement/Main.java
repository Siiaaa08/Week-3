package singlylinkedlist.studentrecordmanagement;

public class Main {

        public static void main(String[] args) {
            StudentRecordManagement srm = new StudentRecordManagement();


            srm.addAtEnd(101, "Alice", 20, "A");
            srm.addAtEnd(102, "Bob", 21, "B");
            srm.addAtBeginning(100, "John", 22, "C");
            srm.addAtPosition(103, "Eve", 19, "B+", 2);


            System.out.println("All Student Records:");
            srm.displayAllRecords();


            System.out.println("\nSearching for Roll Number 102:");
            srm.searchByRollNumber(102);


            System.out.println("\nUpdating Grade for Roll Number 103:");
            srm.updateGradeByRollNumber(103, "A+");
            srm.displayAllRecords();


            System.out.println("\nDeleting Record with Roll Number 100:");
            srm.deleteByRollNumber(100);
            srm.displayAllRecords();


            System.out.println("\nTotal Records: " + srm.getSize());
        }
    }


