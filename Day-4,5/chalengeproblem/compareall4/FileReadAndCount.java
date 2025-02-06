package chalengeproblem.compareall4;

import java.io.*;

public class FileReadAndCount {
        public static long startTime1,startTime2,endTime1,endTime2;
        public static void fileWordCountByFileReader(String filePath) throws FileNotFoundException {
            String file=filePath;
            int count=0;

            startTime1=System.nanoTime();
            try(FileReader fr=new FileReader(file)){
                int data;
                while ( (data = fr.read())!=-1){
                    count++;
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            endTime1=System.nanoTime();

            System.out.println("Number of words :-"+count+"\nThe time taken by file reader to read file is "+(endTime1-startTime1));

        }
        public static void fileWordCountByInputStream (String filepath){
            int count=0;
            startTime2=System.nanoTime();

            try(FileInputStream fp= new FileInputStream(filepath);
                InputStreamReader ip=new InputStreamReader(fp)){
                int data;
                while((data=ip.read())!=-1){
                    count++;
                }

                endTime2=System.nanoTime();

                System.out.println("Number of words :-"+count+"\nThe time taken by file reader to read file is "+(endTime2-startTime2));

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        public static String display(){
            System.out.println();
            String res=(((endTime2-startTime2)>(endTime1-startTime1))?"File Reader is faster then InputStreamReader":"InputStreamReader is faster then File reader");
            System.out.println(res);
            return res;
        }
    }


