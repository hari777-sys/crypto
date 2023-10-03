import java.util.Scanner;

public class LinearEqn {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value for x:");
        int x = sc.nextInt();
        System.out.print("enter the value for m:");
        int m = sc.nextInt();
        System.out.print("enter the value for a:");
        int a = sc.nextInt();
        System.out.print("enter the value for c:");
        int c = sc.nextInt();
        if(m>0&& a<m && c<m){
        for(int i=0; i<10;i++){
            System.out.print(x+" ");
            int n=((a*x)+c)%m;
            x=n;
        }}
        else{
            System.out.println("incorrect value");
        }
    }
}
