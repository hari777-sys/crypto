import java.util.*;
public class stringtohex {

        public static void main(String ar[])
        {
            String input = "gg";
            String hex = "";
            for (int i=0;i<input.length();i++) {
                hex=hex+(Integer.toHexString(input.charAt(i)));
            }
            System.out.println(hex);
        }
    }


