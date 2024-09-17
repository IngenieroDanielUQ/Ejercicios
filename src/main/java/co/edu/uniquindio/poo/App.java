package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        //Ejemplo de como usar el patrón Builder
        Cliente mCliente = new Cliente("1038646923", "Daniel", "Gonzalez", "La casa", "6067381406", "31467452720", "danielgonzalezsan4567@outlook.com");

        Cliente mCliente2 = Cliente.builder().cedula("1038646923").apellido("Gonzalez").nombre("Daniel").build();

        System.out.println(mCliente);
        System.out.println(mCliente2);

    }
}
