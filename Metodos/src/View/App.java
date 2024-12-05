package View;

import Controller.Controller;
import Controller.SearchMetods;
import Controller.SortingMethods;

public class App {

    public static void main(String[] args) {
        View vista = new View();
        SortingMethods sortingMethods = new SortingMethods();
        SearchMetods searchMethods = new SearchMetods();
        Controller controller = new Controller(vista, sortingMethods, searchMethods);
        controller.start();
    }
}
