import javax.sound.midi.Soundbank;
import java.util.Scanner;

//added comment at 1:33 pm
public class Reverse_word {
    public static void main(String[] args) {

        System.out.println("Enter a name");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        for (int i = name.length() - 1; i >= 0; i--) {

            System.out.println(name.charAt(i));

        }


    }
}
