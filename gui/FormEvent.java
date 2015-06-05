package gui;

import java.util.EventObject;

public class FormEvent extends EventObject {

    private String name;
    private String lastName;
    private String phone;
    private String password;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String name, String lastName,
                     String phone, String password) {
        super(source);
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }
}
