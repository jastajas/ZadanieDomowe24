public class Person {
    private String  firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException, IncorrectPeselException {

        if (firstName == null || lastName == null || firstName.length() < 2 || lastName.length() < 2){
            throw new NameUndefinedException();
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        if (age < 1){
            throw new IncorrectAgeException();
        } else {
            this.age = age;
        }

        String s = String.valueOf(pesel);
        if (pesel < 1 || s.length() != 8){
            throw new IncorrectPeselException();
        } else {
        this.pesel = pesel;
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}
