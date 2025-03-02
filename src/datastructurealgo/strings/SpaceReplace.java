package datastructurealgo.strings;

public class SpaceReplace {
    /**
     * Replaces spaces in a character array with "%20" in place.
     *
     * @param str    The character array representing the string.
     * @param trueLength The true length of the string (excluding trailing spaces).
     */
    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, newLength, i;

        // Count spaces
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        // Calculate new length
        newLength = trueLength + spaceCount * 2;

        // Replace spaces from the end
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
    }

    public static void main(String[] args) {
        String testString = "Mr Sunil Singh Rana  "; // Note the trailing spaces
        char[] charArray = testString.toCharArray();
        int trueLength = 13; // "Mr John Smith"

        replaceSpaces(charArray, trueLength);

        System.out.println(new String(charArray).trim()); // Output: Mr%20John%20Smith
    }
}
