import java.util.Arrays;
import java.util.Scanner;

public class feistel {

    public static void main(String[] args) {
        Scanner bn=new Scanner(System.in);
        char c;
        System.out.println("enter th character:");
        c=bn.next().charAt(0);
        int[] bin = bin(c);
        System.out.println("cipher text:"+ Arrays.toString(feis(bin)));
        bn.close();
    }
    public static int[]  bin(char st) {
        int j = 7;
        int[] a = new int[8];
        int q, r;
        int asc = st;
        while (asc > 0) {
            r = asc % 2;
            q = asc / 2;
            asc = q;

            a[j] = r;
            j--;
        }
        return a;
    }
    public static int [] feis(int[] a) {
        int m = 0;
        Scanner io=new Scanner(System.in);
        int[] k = {0, 0, 1, 0};
        int[] temp = new int[4];
        int[] left = new int[4];
        int[] right = new int[4];
        int []res=new int[8];
        System.arraycopy(a, 0, left, 0, 3);
        for (int i = 4; i < a.length; i++) {
            right[m] = a[i];
            m++;
        }
        int n;
        System.out.println("enter number of rounds:");
        n=io.nextInt();
        for (int l = 0; l<n; l++) {
            for (int i = 0; i < temp.length; i++) {
                temp[i] = (k[i] ^ right[i]);
                temp[i] = temp[i] ^ left[i];
            }
            for (int i = 0; i < 4; i++) {
                left[i] = right[i];
            }
            for (int i = 0; i < 4; i++) {
                right[i] = temp[i];
            }
        }
        System.arraycopy(left, 0, res, 0, 4);
        System.arraycopy(right, 0, res,4 , 4);

        return res;
    }
}

