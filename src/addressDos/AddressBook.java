package addressDos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que representa la libreta de direcciones.
 */
public class AddressBook {

    private List<AddressEntry> addressEntryList;
    private AddressEntry addressEntry;
    Scanner in = new Scanner(System.in);

    /**
     * Constructor de la clase AddressBook.
     */
    public AddressBook() {
        addressEntryList = new ArrayList<>();
    }

    /**
     * Muestra las entradas de la libreta de direcciones.
     */
    public void show() {

        if (this.addressEntryList.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {

            System.out.println("Elementos de la lista: ");
            for (AddressEntry elemento : this.addressEntryList) {
                System.out.println(elemento.toString());
            }

        }
    }

    /**
     * Elimina las entradas que coincidan con un apellido dado.
     *
     * @param lastName el apellido para eliminar las entradas
     */
    public void remove(String lastName) {
        List<AddressEntry> entriesFound = new ArrayList<AddressEntry>();
        for (int i = 0; i < addressEntryList.size(); i++) {
            AddressEntry entry = addressEntryList.get(i);
            if (entry.getLastName().startsWith(lastName)) {
                entriesFound.add(entry);
            }
        }

        if (entriesFound.isEmpty()) {
            System.out.println("No matching entries found.");
        } else {
            System.out.println("/   /   /   /   /   /   /   /   /   /");
            for (int i = 0; i < entriesFound.size(); i++) {
                AddressEntry entry = entriesFound.get(i);
                System.out.println(entry);
            }

            System.out.println("Index: ");
            int index = Integer.parseInt(in.nextLine()) - 1;

            System.out.println("enter 'y' to delete or 'n' to return to the menu");
            System.out.println(entriesFound.get(index));
            String confirmation = in.nextLine();

            if (confirmation.equals("y")) {
                String lastNameTemporal = entriesFound.get(index).getLastName();
                for (int i = 0; i < addressEntryList.size(); i++) {
                    AddressEntry entry = addressEntryList.get(i);
                    if (entry.getLastName().startsWith(lastNameTemporal)) {
                        addressEntryList.remove(i);
                    }
                }

            }

        }

    }

    /**
     * Agrega una nueva entrada a la libreta de direcciones.
     *
     * @param addressEntry la entrada de la dirección a agregar
     */
    public void add(AddressEntry addressEntry) {

        this.addressEntry = new AddressEntry(addressEntry.getFisrtName(), addressEntry.getLastName(),
                addressEntry.getStreet(),
                addressEntry.getCity(), addressEntry.getState(), addressEntry.getZipCode(), addressEntry.getPhone(),
                addressEntry.getEmail());

        this.addressEntryList.add(this.addressEntry);

    }

    /**
     * Lee los datos de un archivo y carga las entradas en la libreta de
     * direcciones.
     *
     * @param file el archivo que contiene los datos
     */

    public void readFromFile(File file) {
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (!line.isEmpty()) {
                    String[] data = line.split(";");

                    if (data.length == 8) {
                        String firstName = data[0];
                        String lastName = data[1];
                        String street = data[2];
                        String city = data[3];
                        String state = data[4];
                        int zipCode = Integer.parseInt(data[5]);
                        String phone = data[6];
                        String email = data[7];

                        AddressEntry entry = new AddressEntry(firstName, lastName, street, city, state, zipCode, phone,
                                email);
                        addressEntryList.add(entry);
                    }
                }
            }

            System.out.println("File uploaded successfully ");
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found ");
        }
    }

    /**
     * Busca las entradas que coincidan con un apellido dado.
     *
     * @param startOfLastName el inicio del apellido para buscar las entradas
     */
    public void find(String startOfLastName) {
        List<AddressEntry> entriesFound = new ArrayList<>();

        for (int i = 0; i < addressEntryList.size(); i++) {
            AddressEntry entry = addressEntryList.get(i);
            if (entry.getLastName().startsWith(startOfLastName)) {
                entriesFound.add(entry);
            }
        }

        if (entriesFound.isEmpty()) {
            System.out.println("No matching entries found.");
        } else {
            System.out.println("/   /   /   /   /   /   /   /   /   /");
            for (int i = 0; i < entriesFound.size(); i++) {
                AddressEntry entry = entriesFound.get(i);
                System.out.println(entry);
            }
        }
    }

}
