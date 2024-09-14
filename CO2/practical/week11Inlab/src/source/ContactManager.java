package source;
import java.util.HashMap;
import java.util.Map;
public class ContactManager {
	private Map<String, String> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }
    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println(name + " has been added with phone number: " + phoneNumber);
    }
    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println(name + " has been removed.");
        } 
        else {
            System.out.println("Contact not found: " + name);
        }
    }
    public String getPhoneNumber(String name) {
        return contacts.getOrDefault(name, "Contact not found: " + name);
    }
    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contacts:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
            }
        }
    }
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        manager.addContact("Alice", "123-456-7890");
        manager.addContact("Bob", "987-654-3210");
        manager.addContact("Charlie", "555-666-7777");
        System.out.println("Bob's Phone Number: " + manager.getPhoneNumber("Bob"));
        manager.removeContact("Alice");
        manager.listContacts();
    }
}
