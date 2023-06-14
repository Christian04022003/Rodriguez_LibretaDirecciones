package address;

import java.util.Scanner;

import addressDos.AddressBook;

/**
 * Clase principal que ejecuta la aplicación de la libreta de direcciones.
 */
public class AddressBookAplication {

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args los argumentos de la línea de comandos (no se utilizan en esta
     *             aplicación)
     */
    public static void main(String[] argsd) {

        AddressBook book = new AddressBook();
        Menu menu = new Menu(book);
        Scanner in = new Scanner(System.in);

        String opcion;

        do {
            menu.displayMenu();
            opcion = in.nextLine();
            menu.userInput(opcion);
        } while (!opcion.equals("f"));
    }

}
