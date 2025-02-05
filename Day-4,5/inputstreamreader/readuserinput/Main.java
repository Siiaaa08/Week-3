package inputstreamreader.readuserinput;

public class Main {
        public static void main(String[] args) {
            String filePath = "output.txt";
            UserInputWriter writer = new UserInputWriter(filePath);
            writer.writeUserInput();
        }
    }


