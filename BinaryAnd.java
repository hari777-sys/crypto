import java.util.Scanner;

    public class BinaryAnd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first binary number: ");
            String binary1 = scanner.nextLine();
            System.out.print("Enter the second binary number: ");
            String binary2 = scanner.nextLine();
            String result = binaryAnd(binary1, binary2);
            System.out.println("Result: " + result);
        }

        public static String binaryAnd(String binary1, String binary2) {
            int len1 = binary1.length();
            int len2 = binary2.length();
            int maxLen = Math.max(len1, len2);
            String result = "";
            for (int i = 0; i < maxLen; i++) {
                char c1 = i < len1? binary1.charAt(len1 - i - 1) : '0';
                char c2 = i < len2? binary2.charAt(len2 - i - 1) : '0';
                if (c1 == '1' && c2 == '1') {
                    result = "1" + result;
                } else {
                    result = "0" + result;
                }
            }
            return result;
        }
    }


