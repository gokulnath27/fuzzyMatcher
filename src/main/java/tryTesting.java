import me.xdrop.fuzzywuzzy.FuzzySearch;
import java.util.*;

public class tryTesting {
    public List<String> fuzzyMatch(List<String> columnName,List<String> fieldName ) {
        List<String> matchedFields = new ArrayList<String>();
        LevensteinDistanceFinder fuzz = new LevensteinDistanceFinder();
        int count = 0;
        FuzzySearch matchFinder = new FuzzySearch();
        int totalRatio = 0;
        String fieldLocalTemp = null;
        for(String allFieldName : fieldName) {
            for (String fieldsToBeMatchedName:columnName) {
                int simpleRatio = matchFinder.ratio(fieldsToBeMatchedName,allFieldName);
                int partialRatio = matchFinder.partialRatio(fieldsToBeMatchedName,allFieldName);
                int ratio = fuzz.getValue(fieldsToBeMatchedName,allFieldName);

                if(ratio>totalRatio){
                    totalRatio = ratio;
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
