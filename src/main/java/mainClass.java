import java.util.ArrayList;
import java.util.List;

public class mainClass {
    public static void main(String[] args) {
        List<String> columnName = new ArrayList<String>();
        List<String> fieldName = new ArrayList<String>();
        columnName.add("Full Name");
        columnName.add("First name");
        columnName.add("Auto");
        columnName.add("phone");
        columnName.add("annual revenue");

        fieldName.add("auto");
        fieldName.add("full name");
        fieldName.add("phne");
        fieldName.add("ph");
        fieldName.add("name");
        fieldName.add("full");

        fieldName.add("phone no.");
        fieldName.add("phone number");
        fieldName.add("auto number");
        fieldName.add("revenue");
        fieldName.add("annual");
        fieldName.add("annual revenue");
        fieldName.add("reven");




//
        tryTesting fuzzy = new tryTesting();
        List<String> strings = fuzzy.fuzzyMatch(columnName, fieldName);
        for(String s: strings){
            System.out.println(s);
        }
//
//       logicMatcher match = new logicMatcher();
//        match.logicMatch(columnName,fieldName);
       /* tryAgain1 try1 = new tryAgain1();
        List<String> matchedFields = try1.findMatchedFields(columnName, fieldName);
        for(String s: matchedFields){
            System.out.println(s);
        }*/


    }
}
