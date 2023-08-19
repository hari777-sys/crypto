import java.util.*;
public class hextostring {
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Hexadecimal value: ");
        String str = sc.next();
        String result = new String();
        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i=i+2) {
        String st = ""+charArray[i]+""+charArray[i+1];
        char ch = (char)Integer.parseInt(st, 16);
        result = result + ch;
        }
        System.out.println(result);
        }
}
