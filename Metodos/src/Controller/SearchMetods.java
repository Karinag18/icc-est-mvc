package Controller;

import Model.Person;

public class SearchMetods {

    public Person binarySearchByAge(Person[] personas, int age) {
        if (personas == null || personas.length == 0) {
            return null;
        }

        int left = 0;
        int right = personas.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (personas[mid].getAge() == age) {
                return personas[mid];
            } else if (personas[mid].getAge() < age) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public Person binarySearchByName(Person[] personas, String name) {
        if (personas == null || personas.length == 0) {
            return null;
        }

        int left = 0;
        int right = personas.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = personas[mid].getName().compareToIgnoreCase(name);
            if (comparison == 0) {
                return personas[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public boolean isSortedByAge(Person[] personas) {
        if (personas == null || personas.length <= 1) {
            return true;
        }

        for (int i = 0; i < personas.length - 1; i++) {
            if (personas[i].getAge() > personas[i + 1].getAge()) {
                return false;
            }
        }
        return true;
    }

    public boolean isSortedByName(Person[] personas) {
        if (personas == null || personas.length <= 1) {
            return true;
        }

        for (int i = 0; i < personas.length - 1; i++) {
            if (personas[i].getName().compareToIgnoreCase(personas[i + 1].getName()) > 0) {
                return false;
            }
        }
        return true;
    }
}
