package org.howard.edu.lsp.midterm.problem2;

public class Person {
    private String name;
    private int age;
    private String socialSecurityNumber;

    public Person(String name,  String socialSecurityNumber, int age) {
        this.name = name;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String toString() {
        return "Name: '" + this.name +
                "', Age: '" + this.age +
                "', SSN: '" + this.socialSecurityNumber + "'";
    }

    public boolean equals(Person person2) {
        if (this.socialSecurityNumber == person2.socialSecurityNumber) {
            System.out.println("These are the same people!");
            return true;
        }
        System.out.println("These are not the same people");
        return false;
    }

    public static void main(String args[]) {
        Person Tyson = new Person("Tyson","123-45-6789",21);
        Person TysonTwin = new Person("Tyson Twin", "123-45-6789", 34);
        System.out.println(Tyson.equals(TysonTwin));
        System.out.println(Tyson.toString());
        System.out.println(TysonTwin.toString());
        }
    }

