import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Matcher {
    public static List<String> filterColumn;

    public static String match(String field, List<String> allFields) {


        allFields = allFields.stream()
                .map(str -> str.toLowerCase())
                .collect(Collectors.toList());

        if (allFields.contains(field)) {
            return field;
        }

        filterColumn = allFields.stream()
                .filter(str -> str.contains(field))
                .collect(Collectors.toList());
        if (!filterColumn.isEmpty()) {
            return filterColumn.get(0);

        }

        filterColumn = allFields.stream()
                .filter(str -> field.contains(str))
                .collect(Collectors.toList());
        if (!filterColumn.isEmpty()) {
            return filterColumn.get(0);
        }
        return null;
    }


    public static List<String> stringMatcher(List<String> fieldsToBeMatched, List<String> allFields){

        List<String> matchedFields = new ArrayList<String>();
        for (String field : fieldsToBeMatched) {
            String matchedField = Matcher.match(field.toLowerCase(), allFields);
            if(matchedField != null) {
                matchedFields.add(matchedField);
            }
        }
        return  matchedFields;
    }

}

