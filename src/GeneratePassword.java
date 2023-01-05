import java.util.Random;
import java.util.Scanner;

public class GeneratePassword {

        public static void main(String[] args) {
            int length;
            Scanner scan=new Scanner(System.in);
            System.out.println("Password length:");
            length=scan.nextInt();
            System.out.println("Generated Password is = "+generatePassword(length));
        }

        public static String generatePassword(int length) {
            String password = "";
            Random random = new Random();
            for (int i = 0; i < length; i++) {
                int index = random.nextInt(characters.length());
                password += characters.charAt(index); //charAt-return the caracter of index pozition
            }
            return password;
        }

        private static final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*?";
    }


