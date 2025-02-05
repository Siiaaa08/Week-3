package inputstreamreader.readuserinput;
import java.io.*;

public class UserInputWriter {
    private String filePath;

    public UserInputWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeUserInput() {
        try (
                InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader consoleReader = new BufferedReader(inputStreamReader);
                FileWriter fileWriter = new FileWriter(filePath, true); // Append mode
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            System.out.println("Enter text (type 'exit' to stop):");

            String userInput;
            while (true) {
                userInput = consoleReader.readLine();
                if ("exit".equalsIgnoreCase(userInput)) {
                    System.out.println("Exiting... Data saved to " + filePath);
                    break;
                }
                bufferedWriter.write(userInput);
                bufferedWriter.newLine(); // Write each input as a new line
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

