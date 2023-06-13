package addressDos;

import java.io.File;
import java.util.List;


public class AddressBook {

    private List<AddressEntry> addressEntryList;
    private AddressEntry uno;
    private int indice;


    // Metodo que sirve para mostrar en orden alfabetico
    public void lis(){

    }

    public void remove(String lastNames){
        
    }

    public void add(AddressEntry addressEntry){

        this.uno = new AddressEntry(addressEntry.getFisrtName(), addressEntry.getLastName(), addressEntry.getStreet(),
        addressEntry.getCity(), addressEntry.getState(), addressEntry.getZipCode(), addressEntry.getPhone(), 
        addressEntry.getEmail());

    }

    public void readFromFile(File fileName){

    }

    public void find(String starOf_lastName){

    }
}
