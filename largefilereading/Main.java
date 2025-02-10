package largefilereading;

public class Main {
        public static void main(String[] args) {
            String filepath="Sample.txt";
            FileReaderTime fr=new FileReaderTime();
            System.out.println("Reading file using FileReader");
            System.out.println(fr.readtime(filepath));

            InputStreamReaderTime ir= new InputStreamReaderTime();
            System.out.println("Reading file using InputStreamReader");
            System.out.println(ir.readtime(filepath));
        }
    }


