package org.example;

/* Purpose: to encapsulate the logic to match a given licence plate using
          the description given by the tollbooth operator

A tollbooth operator saw a suspicious car passing through the toll booth moments after a crime in the area. Strangely, they remember:

The county code contained an “L”.
The year digits (YYY) summed to 10.
The serial contained at least two 6’s in any position.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicencePlateMatcher {

    private static boolean isYearDigitsSumAMatch(LicencePlate plate) {
        int sum = 0;
        String yearDigits = plate.getYearIdentifier();
        if (yearDigits == null) return false;

        for (char ch : yearDigits.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        return (sum == 10);     // return true or false
    }

    private static boolean isCountyCodeAMatch(LicencePlate plate) {
        String countyId = plate.getCountyIdentifier();
        if (countyId != null)
            return countyId.contains("L");
        else
            return false;
    }

    private static boolean isCheckSequenceAMatch(LicencePlate plate) {
        String sequence = plate.getSequenceNumber();
        if (sequence == null) return false;

        int count = 0;  // count occurrences of digit '6'
        for (char ch : sequence.toCharArray()) {
            if (ch == '6')
                count++;
        }
        return count>=2;    // return true or false
    }

    public static boolean isLicencePlateAMatch(LicencePlate plate) {
        return isYearDigitsSumAMatch(plate)
                && isCheckSequenceAMatch(plate)
                && isCountyCodeAMatch(plate);  // true if all are true
    }


// Code for Regular Expression
//        Pattern pattern = Pattern.compile("L"); // Regular expression to match "L"
//        Matcher matcher = pattern.matcher(plate);
//        return (matcher.find()) ;
//


}
