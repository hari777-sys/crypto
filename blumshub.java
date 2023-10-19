import java.util.*;
public class  blumshub{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        int pc=0,qc=0;
        for(int i=2;i<=p||i<=q;i++){
            if((p%i)==0) {
                pc++;
            }
            if((q%i)==0){
                qc++;
            }
        }
        if(pc<=1&&qc<=1){
            if((p%4)==3 && (q%4)==3){
                for(int i=0;i<10;i++){
                    int m=p*q;
                    int k=(x*x)%m;
                    System.out.println(k);
                    x=k;
                }
            }
        }
    }
}
