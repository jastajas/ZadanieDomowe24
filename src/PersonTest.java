import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String firstName = sc.nextLine();

        System.out.println("Podaj nazwisko: ");
        String lastName = sc.nextLine();

        int age = 0;
        int pesel = 0;
        try {
            System.out.println("Podaj wiek: ");
            age = sc.nextInt();
            System.out.println("Podaj pesel: ");
            pesel = sc.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("Newłaściwy typ danych");
        }


        try {
            Person person = new Person(firstName, lastName, age, pesel);
            System.out.println(person.toString());
        } catch (NameUndefinedException c) {
            System.out.println("Podałeś niewłaściwe imię");
        } catch (IncorrectAgeException d) {
            System.out.println("Podałeś niewłaściwy wiek");
        } catch (IncorrectPeselException e) {
            System.out.println("Podałeś niewłaściwy pesel");
        }


    }
}
