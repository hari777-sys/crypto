import java.util.*;
public class LinearEqn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x:");
        int x=sc.nextInt();
        System.out.println("Enter m:");
        int m=sc.nextInt();
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter c:");
        int c=sc.nextInt();
        if(0<m && a<=m && c<=m){
            for(int i=0;i<10;i++){
                int k=((a*x)+c)%m;
                System.out.println(k);
                x=k;
            }
        }
    }
}