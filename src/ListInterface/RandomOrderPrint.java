package ListInterface;

import java.util.*;

public class RandomOrderPrint {

    public static void main(String[] args) {
        String[] words = {"I","Am","Praveen","Abraham","Trying","To","Ace","Java"};

        List<String> strList = new ArrayList<String>();

//        for(String s : words){
//            strList.add(s);
//            Collections.shuffle(strList,new Random());
//            System.out.println(strList);
//        }

        List<String> strList1 = Arrays.asList(words);
        Collections.shuffle(strList1);
        System.out.println(strList1);

    }

}
