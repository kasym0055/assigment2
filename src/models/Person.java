package models;

public class Person {
    private static int id_gen;
    public String name;
    public String surname;
    public String position;

    public Person() {}

    public void generateId(){
        id_gen++;
    }

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
        generateId();
    }

    public static int getId_gen() {
        return id_gen;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public static String getPosition(String part){
        return part;
    }
    public void setPosition(String position){
        this.position = position;
    }

    @Override
    public String toString(){
        return id_gen + ". " + name + " " + surname;
    }
}
