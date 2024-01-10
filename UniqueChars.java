/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = String.join(" ", args);
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        int i = 0;
        String out = "";

        for (i=0; i<s.length(); i++) {
            char n = s.charAt(i);
            if (out.indexOf(n) == -1 || n == ' '){
                out += n;
            }
        }

        return out;
    }
}