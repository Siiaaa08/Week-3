package stringbuffer.concatstings;

public class ConcatStrings {
    public static String concatsString(String[] str){
        StringBuffer sb = new StringBuffer();
        for(String st : str){
            sb.append(st);
        }
        return sb.toString();
    }
}
