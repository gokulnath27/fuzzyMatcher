import me.xdrop.fuzzywuzzy.FuzzySearch;
import java.util.*;

public class FieldMatchFinder {
    public List<String> fuzzyMatch(List<String> columnName,List<String> fieldName ) {
        List<String> matchedFields = new ArrayList<String>();
        LevensteinDistanceFinder fuzz = new LevensteinDistanceFinder();
        int totalFieldMatchedCount = 0;
        FuzzySearch matchFinder = new FuzzySearch();
        int totalRatio = 0;
        String fieldLocalTemp = null;
        for(String allFieldName : fieldName) {
            for (String fieldsToBeMatchedName:columnName) {
                int ratio = fuzz.getValue(fieldsToBeMatchedName,allFieldName);
                if(ratio>totalRatio){
                    totalRatio = ratio;
                    fieldLocalTemp = fieldsToBeMatchedName;
                }
            }
            if(totalFieldMatchedCount < fieldName.size()) {
                matchedFields.add(fieldLocalTemp);
                totalRatio = 0;
                totalFieldMatchedCount++;
            }
        }
        return matchedFields;
    }
}
