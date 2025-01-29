package doublylinkedlist.undoredo;

public class Main {
        public static void main(String[] args) {
            TextEditorUndoRedo editor = new TextEditorUndoRedo(5);
            editor.addTextState("Hello");
            editor.addTextState("Hello, World");
            editor.addTextState("Hello, World!");
            editor.addTextState("Hello, World!!");
            editor.addTextState("Hello, World!!!");
            editor.displayCurrentState();

            editor.undo();
            editor.undo();
            editor.redo();
            editor.undo();
            editor.redo();

            editor.addTextState("New state added after undo/redo");
            editor.displayCurrentState();
        }
    }


