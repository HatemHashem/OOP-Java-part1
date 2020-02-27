import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> personPhoneBook = new ArrayList<Person>();

    public void add(String name, String number) {
        personPhoneBook.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person : personPhoneBook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : personPhoneBook) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
