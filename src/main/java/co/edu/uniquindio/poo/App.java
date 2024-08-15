package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        // Crear un objeto de la clase Ejemplo
        App ejemplo = new App();

        // Crear una lista de numeros
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(5);
        lista.add(9);

        // Llamar al metodo sumarPrimos y mostrar el resultado en consola
        int suma = ejemplo.sumarPrimos(lista);
        System.out.println(suma);
    }

    /**
     * Metodo que recibe una lista de numeros y devuelve la suma de los numeros primos
     * @param lista lista de numeros
     * @return suma de los numeros primos
     */
    public int sumarPrimos(ArrayList<Integer> lista){

        int suma = 0;

        for(int i = 0; i < lista.size(); i++){
            boolean esPrimo = esPrimo( lista.get(i) );
            if(esPrimo == true){
                suma+=lista.get(i);
            }
        }

        return  suma;
    }

    /**
     * Metodo que recibe un numero e indica si es primo o no. Un numero primo es aquel que solo es divisible por 1 y por si mismo
     * @param numero numero a evaluar
     * @return true si es primo, false en caso contrario
     */
    public boolean esPrimo(int numero){

        int contador = 0;

        for(int i = 2; i < numero; i++){
            if( numero%i == 0 ){
                contador++;
            }
        }

        if(contador == 0){
            return true;
        }else{
            return false;   
        }

    }
}