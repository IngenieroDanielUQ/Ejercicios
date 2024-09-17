package co.edu.uniquindio.poo;

import java.lang.module.ModuleDescriptor.Builder;

public class ClienteBuilder {
    private String cedula, nombre, apellido, direccion, telefonoFijo, telefonoMovil, correo;

    public ClienteBuilder() {
    }

    public ClienteBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public ClienteBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ClienteBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public ClienteBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public ClienteBuilder telefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
        return this;
    }

    public ClienteBuilder telefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
        return this;
    }

    public ClienteBuilder correo(String correo) {
        this.correo = correo;
        return this;
    }

    public Cliente build() {
        return new Cliente(cedula, nombre, apellido, direccion, telefonoFijo, telefonoMovil, correo);
    }

}
