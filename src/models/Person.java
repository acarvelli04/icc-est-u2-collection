package models;

public class Person implements Comparable<Person> {
    private String name;
    private int edad;
    
    public Person(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", edad=" + edad + "]";
    }
    
    @Override
    public int compareTo(Person o) {
        int comN = this.name.compareTo(o.getName());
        if (comN !=0) {
            return comN;
        }
        int comEnumerador = Integer.compare(this.edad, o.getEdad());
        return comEnumerador;
        }
    }

    
    



