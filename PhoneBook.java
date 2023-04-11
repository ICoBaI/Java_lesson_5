import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void addPhone(String name, String phone) {
        ArrayList<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    public ArrayList<String> getPhones(String name) {
        return phoneBook.get(name);
    }

    public static void main(String[] args) throws IOException{

    PhoneBook phoneBook = new PhoneBook();

    phoneBook.addPhone("Вова", "111-222-3333");
    phoneBook.addPhone("Вова", "444-555-6666");
    phoneBook.addPhone("НеВова", "777-888-9999");

    ArrayList<String> phones = phoneBook.getPhones("Вова");
    System.out.println(phones);
    phones = phoneBook.getPhones("НеВова");
    System.out.println(phones);

    }
}

