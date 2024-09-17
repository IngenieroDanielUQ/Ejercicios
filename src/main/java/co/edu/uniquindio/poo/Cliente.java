package co.edu.uniquindio.poo;

public class Cliente {

    // Atributos propios de la clase cliente
    private String cedula, nombre, apellido, direccion, telefonoFijo, telefonoMovil, correo;

    // Constructor para la clase cliente
    public Cliente(String cedula, String nombre, String apellido, String direccion, String telefonoFijo,
            String telefonoMovil, String correo) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
        this.correo = correo;
    }

    // Getters and setters: se utilizan para obtener las variables y poder
    // modificarlas

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Metodo toString para poder acceder a los datos
    @Override
    public String toString() {
        return "Cliente [cedula: " + cedula +
                ", nombre: " + nombre +
                ", apellido: " + apellido +
                ", direccion: " + direccion +
                ", telefono Fijo: " + telefonoFijo +
                ", telefono Movil: " + telefonoMovil +
                ", correo: " + correo + "]";
    }

    public static ClienteBuilder builder() {
        return new ClienteBuilder();
    }

}
