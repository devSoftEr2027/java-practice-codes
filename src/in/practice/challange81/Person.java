package in.practice.challange81;

import java.util.Objects;

class Person {
    private String name;
    private int age;


    public Person(int age , String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass () != o.getClass ()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals ( name , person.name );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( name , age );
    }
}


