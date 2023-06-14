package addressDos;

public class AddressEntry {

    private String fisrtName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    private String phone;
    private String email;

    /**
     * Constructor sin argumentos de la clase AddressEntry.
     */
    public AddressEntry() {
        this.fisrtName = " ";
        this.lastName = " ";
        this.street = " ";
        this.city = " ";
        this.state = " ";
        this.zipCode = 0;
        this.phone = " ";
        this.email = " ";
    }

    /**
     * Constructor de la clase AddressEntry.
     *
     * @param fisrtName el nombre
     * @param lastName  el apellido
     * @param street    la calle
     * @param city      la ciudad
     * @param state     el estado
     * @param zipCode   el código postal
     * @param phone     el número de teléfono
     * @param email     el correo electrónico
     */
    public AddressEntry(String fisrtName, String lastName, String street, String city, String state, int zipCode,
            String phone, String email) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Devuelve una representación en cadena de la entrada de la dirección.
     *
     * @return una representación en cadena de la entrada de la dirección
     */
    @Override
    public String toString() {
        return "\nFisrt Name: " + fisrtName + "\nLast Name: " + lastName + "\nStreet: " + street + "\nCity: " + city
                + "\nState: " + state + "\nZip Code: " + zipCode + "\nPhone: " + phone + "\nEmail: " + email + "\n";
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
