package addressbook.model;

public class ContactData {
    private final String name;
    private final String family;
    private final String address;
    private final String number;
    private final String email;
    private static String group;

    public ContactData(String name, String family, String address, String number, String email, String group) {
        this.name = name;
        this.family = family;
        this.address = address;
        this.number = number;
        this.email = email;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public static String getGroup() {
        return group;
    }
}
