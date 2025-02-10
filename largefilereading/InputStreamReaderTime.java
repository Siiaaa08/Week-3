package largefilereading;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



    public class InputStreamReaderTime {
        public long readtime(String filepath){
            long starttime,endtime;
            starttime=System.nanoTime();
            try (InputStreamReader reader=new InputStreamReader(new FileInputStream(filepath))){
                while (reader.read()!=-1){

                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
            endtime=System.nanoTime();
            return (endtime-starttime);
        }
    }



