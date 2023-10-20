public class hillcp{
    public static void main(String[] args)
    {
        String plain_text="act";
        String key="gybnqkurp";
        System.out.println( hill_enc(plain_text.toLowerCase(),key.toLowerCase()));
    }
    static String alp="abcdefghijklmnopqrstuvwxyz";
    public static String  hill_enc(String plain_text,String key)
    {
        int p=0;
        int[][] k =new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                k[i][j]=alp.indexOf(key.charAt(p));
                p++;
            }
        }
        int[][] pt =new int[3][1];
        for(int i=0;i<3;i++)
        {
            pt[i][0]=alp.indexOf(plain_text.charAt(i));
//            System.out.println(pt[i][0]);

        }
        int[][] c =new int [3][1];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 1; j++)
            {
                c[i][j] = 0;

                for (int x = 0; x < 3; x++)
                {
                    c[i][j] +=k[i][x] * pt[x][j];
                }

                c[i][j] = c[i][j] % 26;
//          System.out.print(c[i][j]+" ");
            }
        }
        StringBuilder C= new StringBuilder();

        for (int i = 0; i < 3; i++)
            C.append((char) (c[i][0] + 65));

        return C.toString();

    }
}