import java.util.Scanner;

public class testing {

    public static void main(String[] args) {
        System.out.println("Enter password: ");
        Scanner sc = new Scanner(System.in);
        String pwd = sc.nextLine();
        if (checkLength(pwd) != true)
            System.out.println("Run this programme again!");
    }

    public static boolean checkLength(String password) {
        if (password.length() >= 8) {
            return true;
        } else
            return false;
    }

    public static boolean checkSpecial(String password) {

        boolean isSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                isSpecial = true;
            } else
                isSpecial = false;

        }
        return isSpecial;
    }

    public static boolean checkUpper(String password){
        boolean isUpper = false;

        for (int i=0; i<password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))) {
                isUpper = true;
            } else
                isUpper = false;

        }
        return isUpper;
    }
}