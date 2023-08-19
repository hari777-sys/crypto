import java.util.Scanner;

public class blumshub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for x:");
        double x = sc.nextInt();
        System.out.println("enter the value for p:");
        int p = sc.nextInt();
        System.out.println("enter the value for q:");
        int q = sc.nextInt();
        if ((p % 4 == 3) && (q % 4 == 3)) {
            int m = p * q;
            double arr[]=new double[15];
            for (int i = 0; i <= 7; i++) {
                System.out.println(x);
                arr[i]= (Math.pow(x, 2)) % m;
                x=arr[i];
            }
        }
    }
}
