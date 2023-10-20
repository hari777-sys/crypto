public class rail{
    public static void main(String[] args) {
        String pt="hari";
        int k=2;
        fenc(pt,k);
    }
    public static void fenc(String s,int k)
    {
        int pos=0,rpos=0;
        String[][] a =new String [k][s.length()];
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<k;j++)
            {
                if(i%2==0) {
                    a[rpos][pos] = String.valueOf(s.charAt(pos));
                    pos++;
                    rpos++;
                    if (rpos == k) {
                        rpos--;
                        break;
                    }
                    if(pos==s.length())
                    {
                        break;
                    }
                }
                else{
                    rpos--;
                    a[rpos][pos] = String.valueOf(s.charAt(pos));
                    pos++;
                    if(rpos==0)
                    {
                        rpos=1;
                        break;
                    }
                    if(pos==s.length())
                    {
                        break;
                    }

                }
            }
            if(pos==s.length())
            {
                break;
            }
        }
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(a[i][j]!=null) {
                    System.out.print(a[i][j] + " ");
                }
            }

        }
    }
}