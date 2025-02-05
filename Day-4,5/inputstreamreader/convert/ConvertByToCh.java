package inputstreamreader.convert;

import java.io.*;

public class ConvertByToCh {

    public void helper(String filePath){
        try(FileInputStream fileInputStream = new FileInputStream(filePath);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader))
    {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }catch(FileNotFoundException e){
        System.err.println("File Not Found" +filePath);
    }
    catch(IOException e){
        System.err.println("IO Exception" +e.getMessage());
        e.printStackTrace();
    }
  }
}
