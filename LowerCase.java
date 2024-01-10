/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = String.join(" ", args);
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        int i =0; //will run from the first char ti the last
        String out = "";
        for(i=0; i<s.length(); i++)  
        {
            char n = s.charAt(i);
            if((n <= 'Z') && n >= 'A'){ // Uppercase
            n = (char) (n+32);
            } 
        out += n;
        }

        return out;
    }
}