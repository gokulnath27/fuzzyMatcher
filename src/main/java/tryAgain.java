import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class tryAgain {
    public List<String> findMatchedFields(List<String> fieldsToBeMatched, List<String> fields){



        List<String> matchedFields = new ArrayList<String>();
        String columnNameLocal;
        String fieldNameLocal;
        Iterator<String> fieldsToBeMatchedIterator = fieldsToBeMatched.iterator();
        Iterator<String> allFieldsIterator = fields.iterator();



        //Case1: exact match

        while(fieldsToBeMatchedIterator.hasNext()) {
            columnNameLocal = fieldsToBeMatchedIterator.next();
            while(allFieldsIterator.hasNext()) {
                 fieldNameLocal = allFieldsIterator.next();
                 if (columnNameLocal.toLowerCase().equals(fieldNameLocal.toLowerCase())) {
                    matchedFields.add(columnNameLocal);
                    allFieldsIterator.remove();
                 }
            }
            allFieldsIterator = fields.iterator();
        }


        //Case2: field matches with substring of column


        fieldsToBeMatchedIterator = fieldsToBeMatched.iterator();
        allFieldsIterator = fields.iterator();

        while(fieldsToBeMatchedIterator.hasNext()) {
            columnNameLocal = fieldsToBeMatchedIterator.next();
            while(allFieldsIterator.hasNext()) {
                fieldNameLocal = allFieldsIterator.next();
                if (columnNameLocal.toLowerCase().contains(fieldNameLocal.toLowerCase())) {
                    matchedFields.add(columnNameLocal);
                    allFieldsIterator.remove();
                }
            }
            allFieldsIterator = fields.iterator();
        }


        //case3: substring of field matches with column

        fieldsToBeMatchedIterator = fieldsToBeMatched.iterator();
        allFieldsIterator = fields.iterator();

        while(fieldsToBeMatchedIterator.hasNext()) {
            columnNameLocal = fieldsToBeMatchedIterator.next();
            while(allFieldsIterator.hasNext()) {
                fieldNameLocal = allFieldsIterator.next();
                if (fieldNameLocal.toLowerCase().contains(columnNameLocal.toLowerCase())) {
                    matchedFields.add(columnNameLocal);
                    allFieldsIterator.remove();
                }
            }
            allFieldsIterator = fields.iterator();

        }
       return matchedFields;
    }
}
