package stringbuffer.comparision;

import stringbuffer.concatstings.ConcatStrings;

public class Main {
    public static void main(String[] args) {
        ConcatCompare tester = new ConcatCompare();
        long timeBuffer = tester.StringBuffer();
        long timeBuilder = tester.StringBuilder();
        System.out.println("Time taken by StringBuilder class: "+timeBuilder);
        System.out.println("Time taken by StringBuffer class: "+timeBuffer);

    }
}
