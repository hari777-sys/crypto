import java.util.*;
public class stringtohex {

        public static void main(String ar[])
        {
            String input = "gg";
            StringBuilder hexstring = new StringBuilder();
            for (char c:input.toCharArray()) {
                hexstring.append(Integer.toHexString((int)c));
            }
            System.out.println("res"+hexstring.toString());
            }

        }



