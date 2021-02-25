package addressbook.model;

import java.util.Objects;

public class ContactData {
    private int id;
    private final String name;
    private final String family;
    private final String address;
    private final String number;
    private final String email;
    private static String group;

    public ContactData(int id, String name, String family, String address, String number, String email, String group) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.address = address;
        this.number = number;
        this.email = email;
        this.group = group;
    }

    public ContactData(String name, String family, String address, String number, String email, String group) {
        this.id = Integer.MAX_VALUE;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return Objects.equals(name, that.name) && Objects.equals(family, that.family) && Objects.equals(address, that.address) && Objects.equals(number, that.number) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family, address, number, email);
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
