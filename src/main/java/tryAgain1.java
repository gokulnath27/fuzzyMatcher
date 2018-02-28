import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class tryAgain1 {
    public List<String> findMatchedFields(List<String> fieldsToBeMatched, List<String> fields){



        List<String> matchedFields = new ArrayList<String>();
        String fieldLocalName;
        String fieldsToBeMatchedName;
        Iterator<String> fieldsToBeMatchedIterator = fieldsToBeMatched.iterator();
        Iterator<String> allFieldsIterator = fields.iterator();
        int flag = 0;

        //fieldsToBeMatched.iterator();

        //Case1: exact match

        while(allFieldsIterator.hasNext()) {
            fieldLocalName = allFieldsIterator.next();
            flag = 0;
            if(flag == 0) {
                while (fieldsToBeMatchedIterator.hasNext()) {
                    fieldsToBeMatchedName = fieldsToBeMatchedIterator.next();
                    if (fieldLocalName.toLowerCase().equals(fieldsToBeMatchedName.toLowerCase()) && (flag == 0)) {
                        matchedFields.add(fieldsToBeMatchedName);
                        allFieldsIterator.remove();
                        flag = 1;
                    }
                }

            }
            fieldsToBeMatchedIterator = fieldsToBeMatched.iterator();

            //Case2 field matches with substring of column


            if (flag == 0) {
                while (fieldsToBeMatchedIterator.hasNext()) {
                    fieldsToBeMatchedName = fieldsToBeMatchedIterator.next();
                    if (fieldLocalName.toLowerCase().contains(fieldsToBeMatchedName.toLowerCase()) && (flag == 0)) {
                        matchedFields.add(fieldsToBeMatchedName);
                        allFieldsIterator.remove();
                        flag = 1;
                    }
                }
            }
            fieldsToBeMatchedIterator = fieldsToBeMatched.iterator();


            //Case3 substring of field matches with column

            if(flag == 0){
                while(fieldsToBeMatchedIterator.hasNext()){
                    fieldsToBeMatchedName = fieldsToBeMatchedIterator.next();
                    if(fieldsToBeMatchedName.toLowerCase().contains(fieldLocalName.toLowerCase()) && (flag == 0)){
                        matchedFields.add(fieldsToBeMatchedName);
                        allFieldsIterator.remove();
                        flag = 1;
                    }
                }
            }
            fieldsToBeMatchedIterator = fieldsToBeMatched.iterator();


            // if no cases get matched
            if(flag == 0){
                matchedFields.add(null);
                allFieldsIterator.remove();
            }
        }
        return matchedFields;
    }
}
