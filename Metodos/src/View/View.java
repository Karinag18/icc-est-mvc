package View;

import java.util.Scanner;
import Model.Person;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("\n--------Menú------------\n");
        System.out.println("1. Ingrese personas");
        System.out.println("2. Agregar personas");
        System.out.println("3. Ordenar personas");
        System.out.println("4. Buscar Personas");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt();
    }

    public Person inputPerson() {
        String nombre = inputName();
        int edad = inputAge();
        return new Person(nombre, edad);
    }

    public int selectSortingMethod() {
        System.out.println("\n--------Menú------------\n");
        System.out.println("1. Ordenar por Nombre (Burbuja)");
        System.out.println("2. Ordenar por Nombre (Selección Descendente)");
        System.out.println("3. Ordenar por Edad (Inserción)");
        System.out.println("4. Ordenar por Nombre (Inserción)");
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt();
    }

    public int selectSearchCriterion() {
        System.out.println("\n--------Menú------------\n");
        System.out.println("1. Buscar por Edad");
        System.out.println("2. Buscar por Nombre");
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt();
    }

    public void displayPersons(Person[] personas) {
        System.out.println("\nLista de personas:");
        for (Person person : personas) {
            System.out.println(person);
        }
    }

    public void displaySearchResult(Person person) {
        if (person != null) {
            System.out.println("\nPersona encontrada: " + person);
        } else {
            System.out.println("\nNo se encontró ninguna persona con el criterio de búsqueda especificado.");
        }
    }

    public int inputAge() {
        System.out.print("Ingrese la edad: ");
        return scanner.nextInt();
    }

    public String inputName() {
        System.out.print("Ingrese el nombre: ");
        return scanner.next();
    }

    public int inputInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
