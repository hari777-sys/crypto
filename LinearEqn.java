import java.util.Scanner;

public class LinearEqn {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for x:");
        int x = sc.nextInt();
        System.out.println("enter the value for m:");
        int m = sc.nextInt();
        System.out.println("enter the value for a:");
        int a = sc.nextInt();
        System.out.println("enter the value for c:");
        int c = sc.nextInt();

        for(int i=0; i<=7;i++){
            System.out.println(x);
            int n=((a*x)+c)%m;
            x=n;
        }
    }
}
