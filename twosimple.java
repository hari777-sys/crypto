public class twosimple {
        public static void main(String[] args) {
            int a[] = new int[]{1, 1, 1, 1, 1, 1, 0, 1};
            int b[] = new int[]{1, 1, 1, 1, 1, 1, 0, 0};
            int c[] = new int[]{1, 1, 1, 1, 1, 0, 0, 1};
            int d[] = new int[]{1, 1, 1, 1, 0, 1, 0, 1};
            int e[] = new int[]{1, 1, 1, 0, 1, 1, 0, 1};
            int f[] = new int[]{1, 1, 1, 1, 0, 1, 0, 1};
            int g[] = new int[]{1, 1, 1, 1, 1, 0, 0, 1};
            int h[] = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
            int k[] = new int[8];
//xor
            for (int i = 0; i < 8; i++) {
                k[i] = a[i] ^ b[i] ^ c[i] ^ d[i] ^ e[i] ^ f[i] ^ g[i] ^ h[i];
                System.out.print(k[i]+" ");
            }
            System.out.println();
            {
//circular right
                for (int q = k.length - 1; q > 0; q--) {
                    k[q] = k[q - 1];
                }
                k[0] = k[7];
                for (int i = 0; i < k.length; i++) {
                    System.out.print(k[i] + " ");
                }
            }
        }
    }

