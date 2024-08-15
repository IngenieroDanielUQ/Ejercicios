package co.edu.uniquindio.poo;

public class Estudiante {
    
    //Atributos privados para la clase de estudiante
    private String nombre;
    private byte edad;
    private double nota;

    //Constructor para poder utilizar las variables
    public Estudiante(String nombre, byte edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    //Getters y setters para obtener y modificar los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
