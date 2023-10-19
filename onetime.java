import java.util.*;
public class onetime{
    public static void main(String[] ss) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter plaintext:");
        String pt=sc.nextLine();
        System.out.println("Enter key:");
        String key=sc.nextLine();
        pt=pt.toLowerCase();
        key=key.toLowerCase();
        if(pt.length()==key.length()) {
            for(int i=0;i<pt.length();i++) {
                int r=pt.charAt(i);
                int r1=key.charAt(i);
                int res=(r+r1)-97;
                if(res>122) {
                    res=res-26;
                }
                char ch=(char)(res);
                System.out.println("Result:"+ch);
            }
        }
    }
}