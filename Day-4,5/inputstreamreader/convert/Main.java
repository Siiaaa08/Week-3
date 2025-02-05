package inputstreamreader.convert;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        ConvertByToCh converter = new ConvertByToCh();
        String filePath = Paths.get("D:", "Sample", "Day4W3", "Searching", "src", "main", "java", "inputstreamreader", "convert", "Text.txt").toString();
        converter.helper(filePath);
    }
}
