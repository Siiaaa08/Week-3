package linearsearchtest.searchspecificwordtest;

import linearsearch.searchspecificword.SearchSpecificWord;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

    public class SearchSpecificWordTest {

        @Test
        public void tester(){
            SearchSpecificWord obj=new SearchSpecificWord();

            String inputsen="My name is Saloni Baruaa";
            String[] arr=inputsen.split("\\s+");

            String input="name";
            boolean result =obj.search (arr,input);


            Assert.assertEquals(true,result);

        }
    }




