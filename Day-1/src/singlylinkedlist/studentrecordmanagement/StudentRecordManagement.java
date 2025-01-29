package singlylinkedlist.studentrecordmanagement;

public class StudentRecordManagement {


        static class Node {
            int rollNumber;
            String name;
            int age;
            String grade;
            Node next;


            public Node(int rollNumber, String name, int age, String grade) {
                this.rollNumber = rollNumber;
                this.name = name;
                this.age = age;
                this.grade = grade;
                this.next = null;
            }
        }

        private Node head;
        private int size;

        public void addAtBeginning(int rollNumber, String name, int age, String grade) {
            Node newNode = new Node(rollNumber, name, age, grade);
            newNode.next = head;
            head = newNode;
            size++;
        }


        public void addAtEnd(int rollNumber, String name, int age, String grade) {
            Node newNode = new Node(rollNumber, name, age, grade);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            size++;
        }


        public void addAtPosition(int rollNumber, String name, int age, String grade, int position) {
            if (position < 0 || position > size) {
                throw new IndexOutOfBoundsException("Invalid position");
            }
            if (position == 0) {
                addAtBeginning(rollNumber, name, age, grade);
                return;
            }
            Node newNode = new Node(rollNumber, name, age, grade);
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }


        public void deleteByRollNumber(int rollNumber) {
            if (head == null) {
                System.out.println("The list is empty. No record to delete.");
                return;
            }
            if (head.rollNumber == rollNumber) {
                head = head.next;
                size--;
                System.out.println("Record deleted successfully.");
                return;
            }
            Node temp = head;
            while (temp.next != null && temp.next.rollNumber != rollNumber) {
                temp = temp.next;
            }
            if (temp.next == null) {
                System.out.println("Record with Roll Number " + rollNumber + " not found.");
            } else {
                temp.next = temp.next.next;
                size--;
                System.out.println("Record deleted successfully.");
            }
        }


        public void searchByRollNumber(int rollNumber) {
            Node temp = head;
            while (temp != null) {
                if (temp.rollNumber == rollNumber) {
                    System.out.println("Student Found: Roll Number = " + temp.rollNumber +
                            ", Name = " + temp.name + ", Age = " + temp.age +
                            ", Grade = " + temp.grade);
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        }


        public void displayAllRecords() {
            if (head == null) {
                System.out.println("No records found.");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.println("Roll Number: " + temp.rollNumber +
                        ", Name: " + temp.name +
                        ", Age: " + temp.age +
                        ", Grade: " + temp.grade);
                temp = temp.next;
            }
        }


        public void updateGradeByRollNumber(int rollNumber, String newGrade) {
            Node temp = head;
            while (temp != null) {
                if (temp.rollNumber == rollNumber) {
                    temp.grade = newGrade;
                    System.out.println("Grade updated successfully for Roll Number " + rollNumber);
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        }


        public int getSize() {
            return size;
        }
    }

