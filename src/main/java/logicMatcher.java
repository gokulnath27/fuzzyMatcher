import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class logicMatcher {
    public void logicMatch(List columnName,List fieldName) {


        System.out.println("logic");

//        List<String> columnName = columnname;
//        List<String> fieldName = fieldname;

//        List<String> samples1 = new ArrayList<String>();
//        List<String> queries1 = new ArrayList<String>();


        //case1:

        Iterator<String> iter1 = columnName.iterator();
        Iterator<String> iter2 = fieldName.iterator();
        while(iter2.hasNext()) {

            String temp = iter1.next();
            while(iter1.hasNext()) {
                String temp1 = iter2.next();

                System.out.println("CASE 1 RUN: " + temp + temp1);

                if (temp.toLowerCase().equals(temp1.toLowerCase())) {
                    System.out.println("CASE1: " +temp+"          "+temp1);
                    //iter2.remove();

                }
            }

        }


        iter1 = columnName.iterator();
        iter2 = fieldName.iterator();



        //case2:
        while(iter2.hasNext()) {

            String temp = iter1.next();
            while(iter1.hasNext()) {
                String temp1 = iter2.next();

                System.out.println("CASE 2 RUN: " + temp + temp1);

                if (temp.toLowerCase().contains(temp1.toLowerCase())) {
                    System.out.println("CASE2: " +temp+"          "+temp1);
                    //iter2.remove();

                }
            }

        }


        iter1 = columnName.iterator();
        iter2 = fieldName.iterator();


        //case3:
        while(iter2.hasNext()) {

            String temp = iter1.next();
            while(iter1.hasNext()) {
                String temp1 = iter2.next();

                System.out.println("CASE 3 RUN: " + temp + temp1);

                if (temp1.toLowerCase().contains(temp.toLowerCase())) {
                    System.out.println("CASE3: " +temp+"          "+temp1);


                  // iter2.remove();
                }
            }


        }


        //case4:

//        for (String queryTest : fieldName) {
//            queries1 = Arrays.asList(queryTest.split(" "));
//            for (String sampleTest : columnName) {
//                samples1 = Arrays.asList(sampleTest.split(" "));
//                for (String tester : samples1) {
//                    if (queries1.contains(tester)) {
//                        System.out.println(queryTest+"          "+sampleTest);
//                        //fieldName.remove(queryTest);
//
//                    }
//                }
//
//            }
//        }




    }


}