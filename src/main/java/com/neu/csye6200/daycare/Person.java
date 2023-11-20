package com.neu.csye6200.daycare;

public class Person {
    private String ID;
    private String Name;
    private String Email;
    private int Age;

    public Person() {
    }

    public Person(String ID, String Name, String Email, int Age) {
        this.ID = ID;
        this.Name = Name;
        this.Email = Email;
        this.Age = Age;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public int getAge() {
        return Age;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Person Details: " +
                "\nID=" + ID +
                "\n, Name=" + Name +
                "\n, Email=" + Email +
                "\n, Age=" + Age + '}';
    }

}
