package address;

import java.util.Scanner;

public class AddressBookAplication {

    public static void main(String[] args) {
        Menu uno = new Menu();
        Scanner in = new Scanner(System.in);
        String opcion;

        uno.displayMenu();
        opcion = in.nextLine();
    }
    
}
