package stringbuffer.comparision;

public class ConcatCompare {
    private static final int iterations = 1000000;
    private static final String text = "Saloni";

    public long StringBuffer(){
        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<iterations;i++){
            stringBuffer.append(text);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long StringBuilder(){
        long startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<iterations;i++){
            stringBuilder.append(text);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
