public class Rent {
    private String name; // Nombre del inquilino
    private String email; // Email del inquilino

    public Rent(String name, String email) { // Constructor para inicializar el nombre y email del inquilino
        this.name = name;
        this.email = email;
    }

    public String getName() { // Getter para obtener el nombre del inquilino
        return name;
    }

    public void setName(String name) { // Setter para establecer el nombre del inquilino
        this.name = name;
    }

    public String getEmail() { // Getter para obtener el email del inquilino
        return email;
    }

    public void setEmail(String email) { // Setter para establecer el email del inquilino
        this.email = email;
    }

    public String toString() { // Método toString para obtener una representación en cadena del objeto Rent
        return name + ", " + email;
    }

}
