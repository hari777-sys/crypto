import java.util.Scanner;
public class caesar {
    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encryptdata(String input, int shiftkey) {
        String encryptstr = "";
        for (int i = 0; i < input.length(); i++) {
            int pos = alphabet.indexOf(input.charAt(i));
            int encryptpos = (shiftkey + pos) % 26;
            char encryptchar = alphabet.charAt(encryptpos);
            encryptstr+=encryptchar;
        }
        return encryptstr;
    }

    public static String decryptdata(String input, int shiftkey) {
        String decryptstr = "";
        for (int i = 0; i < input.length(); i++) {
            int pos = alphabet.indexOf(input.charAt(i));
            int decryptpos = (pos-shiftkey) % 26;
            if (decryptpos < 0) {
                decryptpos = alphabet.length() + decryptpos;
            }
            char decryptchar = alphabet.charAt(decryptpos);
            decryptstr+=decryptchar;
        }
        return decryptstr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TEXT:");
        String input = sc.nextLine();
        System.out.println("ENTER THE VALUE OF SHIFT KEY");
        int shiftkey = sc.nextInt();
        System.out.println("ENCRYPTED DATA:"+encryptdata(input,shiftkey));
        System.out.println("DECRYPTED DATA:"+decryptdata(encryptdata(input,shiftkey),shiftkey));
    }
}