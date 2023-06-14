package address;

import java.io.File;
import java.util.Scanner;

import addressDos.*;

/**
 * Clase que representa el menú de la aplicación de la libreta de direcciones.
 */
public class Menu {
    Scanner in = new Scanner(System.in);
    AddressBook book;

    AddressEntry entry;

    /**
     * Constructor de la clase Menu.
     *
     * @param book la libreta de direcciones
     */
    public Menu(AddressBook book) {
        this.book = book;
    }

    /**
     * Muestra el menú en la consola.
     */
    public void displayMenu() {
        System.out.println("=   =   =   =   =   =   =   =   =   =   =   =");
        System.out.println("\na) file upload\nb) add\nc) remove\nd) find\ne) show \nf) go out\n");
        System.out.println("=   =   =   =   =   =   =   =   =   =   =   =");
    }

    /**
     * Agrega una nueva entrada a la libreta de direcciones.
     */
    public void add() {
        String fisrtName;
        String lastName;
        String street;
        String city;
        String state;
        int zipCode;
        String phone;
        String email;

        System.out.println("First Name: ");
        fisrtName = in.nextLine();

        System.out.println("Last Name: ");
        lastName = in.nextLine();

        System.out.println("Street: ");
        street = in.nextLine();

        System.out.println("City: ");
        city = in.nextLine();

        System.out.println("State: ");
        state = in.nextLine();

        System.out.println("Zip Code: ");
        zipCode = Integer.parseInt(in.nextLine());

        System.out.println("Phone: ");
        phone = in.nextLine();

        System.out.println("Email: ");
        email = in.nextLine();

        entry = new AddressEntry(fisrtName, lastName, street, city, state, zipCode, phone, email);
        book.add(entry);

    }

    /**
     * Busca las entradas que coincidan con un apellido dado.
     */
    public void find() {
        System.out.println("Enter full last name or first: ");
        String startOfLastName = in.nextLine();
        book.find(startOfLastName);
    }

    /**
     * Elimina las entradas que coincidan con un apellido dado.
     */
    public void remove() {
        System.out.println("Enter the last name to remove: ");
        String startOfLastName = in.nextLine();
        book.remove(startOfLastName);

    }

    /**
     * Procesa la opción seleccionada por el usuario.
     *
     * @param opcion la opción seleccionada
     */
    public void userInput(String opcion) {

        switch (opcion) {
            case "a":
                System.out.println("Enter the file name: ");
                String fileName = in.nextLine();
                File file = new File(fileName);
                book.readFromFile(file);
                break;

            case "b":
                add();

                break;

            case "c":
                remove();
                break;

            case "d":
                find();
                break;

            case "e":
                book.show();
                break;

            default:
                break;
        }
    }


}
