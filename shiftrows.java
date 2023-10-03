public class shiftrows {
        static int N = 4;
        public static void shiftMatrixByK(int [][]mat,int k)
        {
            if (k > N) {
                System.out.print("Shifting is not possible");
                return;
            }
            int j = 0;
            while (j < N) {
                for (int i = k; i < N; i++)
                    System.out.print(mat[j][i] + " ");
                for (int i = 0; i < k; i++)
                    System.out.print(mat[j][i] + " ");
                System.out.println();
                j++;
            }
        }
        public static void main(String args[])
        {
            int [][]mat = new int [][]
                    { {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16} };
            int k = 2;
            shiftMatrixByK(mat, k);
        }
    }


