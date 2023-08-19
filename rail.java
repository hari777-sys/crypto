import java.util.Arrays;
public class rail {
        public static String encryptRailFence(String text,int key)
        {

            char[][] rail = new char[key][text.length()];
            for (int i = 0; i < key; i++)
                Arrays.fill(rail[i], '\n');

            boolean dirDown = false;
            int row = 0, col = 0;

            for (int i = 0; i < text.length(); i++) {
                if (row == 0 || row == key - 1)
                    dirDown = !dirDown;
                rail[row][col++] = text.charAt(i);
                if (dirDown)
                    row++;
                else
                    row--;
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < key; i++)
                for (int j = 0; j < text.length(); j++)
                    if (rail[i][j] != '\n')
                        result.append(rail[i][j]);

            return result.toString();
        }
        public static String decryptRailFence(String cipher, int key)
        {

            char[][] rail = new char[key][cipher.length()];
            for (int i = 0; i < key; i++)
                Arrays.fill(rail[i], '\n');
            boolean dirDown = true;
            int row = 0, col = 0;
            for (int i = 0; i < cipher.length(); i++) {
                if (row == 0)
                    dirDown = true;
                if (row == key - 1)
                    dirDown = false;
                rail[row][col++] = '*';
                if (dirDown)
                    row++;
                else
                    row--;
            }

            int index = 0;
            for (int i = 0; i < key; i++)
                for (int j = 0; j < cipher.length(); j++)
                    if (rail[i][j] == '*'
                            && index < cipher.length())
                        rail[i][j] = cipher.charAt(index++);

            StringBuilder result = new StringBuilder();

            row = 0;
            col = 0;
            for (int i = 0; i < cipher.length(); i++) {
                if (row == 0)
                    dirDown = true;
                if (row == key - 1)
                    dirDown = false;

                if (rail[row][col] != '*')
                    result.append(rail[row][col++]);

                if (dirDown)
                    row++;
                else
                    row--;
            }
            return result.toString();
        }

        public static void main(String[] args)
        {

            System.out.print("Encrypted Message: ");
            System.out.print(encryptRailFence("attack at once", 2));
            System.out.print("\nDecrypted Message: ");
            System.out.print(decryptRailFence("atc toctaka ne", 2));
        }
    }


