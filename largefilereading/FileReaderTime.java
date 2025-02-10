package largefilereading;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTime {
        public long readtime(String filepath){
            long starttime,endtime;
            starttime=System.nanoTime();
            try(FileReader reader=new FileReader(filepath)){
                while (reader.read()!=-1){

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            endtime=System.nanoTime();
            return (endtime-starttime);
        }

    }


