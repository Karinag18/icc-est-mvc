package Model;

public class Person {
    private String nombre;
    private int edad;
    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getName() {
        return nombre;
    }
    public int getAge() {
        return edad;
    }
    public void setName(String nombre) {
        this.nombre = nombre;
    }
    public void setAge(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
}
