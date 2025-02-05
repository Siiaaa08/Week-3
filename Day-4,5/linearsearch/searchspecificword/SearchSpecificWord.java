package linearsearch.searchspecificword;

public class SearchSpecificWord {
        public static boolean search(String[] arr,String word){
            boolean result=false;
            for (String element : arr) {
                if (element.equalsIgnoreCase(word)) {
                    result=true;
                }
            }
            return result;
        }
    }


