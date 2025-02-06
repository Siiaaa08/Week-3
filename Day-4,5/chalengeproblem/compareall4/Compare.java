package chalengeproblem.compareall4;

public class Compare {
        public static String comparing(String[] str){
            StringBuilder s1=new StringBuilder();
            StringBuffer s2=new StringBuffer();
            String res="";
            int size=str.length;
            long startTime1=System.nanoTime();
            for(int i=0;i<1000000;i++){
                s1.append(str[i%size]);
            }
            long endTime1=System.nanoTime();

            long startTime2=System.nanoTime();
            for(int i=0;i<1000000;i++){
                s2.append(str[i%size]);
            }
            long endTime2=System.nanoTime();
            res=(((endTime2-startTime2)<(endTime1-startTime1))?"String Buffer is faster then StringBuilder":"StringBuilder is faster then StringBuffer");

            System.out.println(res);
            return res;
        }

    }


