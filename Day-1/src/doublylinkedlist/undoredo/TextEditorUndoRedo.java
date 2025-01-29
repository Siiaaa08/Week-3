package doublylinkedlist.undoredo;

public class TextEditorUndoRedo {
        private Node currentState;
        private int size;
        private final int MAX_HISTORY_SIZE;

        static class Node {
            String text;
            Node prev;
            Node next;

            public Node(String text) {
                this.text = text;
                this.prev = null;
                this.next = null;
            }
        }

        public TextEditorUndoRedo(int maxHistorySize) {
            this.MAX_HISTORY_SIZE = maxHistorySize;
            this.size = 0;
            this.currentState = null;
        }

        public void addTextState(String text) {
            Node newNode = new Node(text);
            if (currentState == null) {
                currentState = newNode;
            } else {
                currentState.next = newNode;
                newNode.prev = currentState;
                currentState = newNode;
            }

            if (size == MAX_HISTORY_SIZE) {
                removeOldestState();
            } else {
                size++;
            }
        }

        public void undo() {
            if (currentState != null && currentState.prev != null) {
                currentState = currentState.prev;
                System.out.println("Undo: Current State - " + currentState.text);
            } else {
                System.out.println("No previous state to undo.");
            }
        }

        public void redo() {
            if (currentState != null && currentState.next != null) {
                currentState = currentState.next; // Move to the next state
                System.out.println("Redo: Current State - " + currentState.text);
            } else {
                System.out.println("No next state to redo.");
            }
        }

        public void displayCurrentState() {
            if (currentState != null) {
                System.out.println("Current State: " + currentState.text);
            } else {
                System.out.println("No text state available.");
            }
        }

        private void removeOldestState() {
            if (currentState != null && currentState.prev != null) {
                currentState.prev.next = null;
                currentState = currentState.prev;
                size--;
            }
        }


    }


