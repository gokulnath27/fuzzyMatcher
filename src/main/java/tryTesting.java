import me.xdrop.fuzzywuzzy.FuzzySearch;
import java.util.*;

public class tryTesting {
    public List<String> fuzzyMatch(List<String> columnName,List<String> fieldName ) {
        List<String> matchedFields = new ArrayList<String>();
        int count = 0;
        FuzzySearch matchFinder = new FuzzySearch();
        int totalRatio = 0;
        String fieldLocalTemp = null;
        for(String allFieldName : fieldName) {
            for (String fieldsToBeMatchedName:columnName) {
                int simpleRatio = matchFinder.ratio(fieldsToBeMatchedName,allFieldName);
                int partialRatio = matchFinder.partialRatio(fieldsToBeMatchedName,allFieldName);
                if((simpleRatio+partialRatio)>totalRatio){
                    totalRatio = simpleRatio + partialRatio;
                    fieldLocalTemp = fieldsToBeMatchedName;
                }
            }
            if(count < fieldName.size()) {
                matchedFields.add(fieldLocalTemp);
                totalRatio = 0;
                count++;
            }
        }
        return matchedFields;
    }
}
