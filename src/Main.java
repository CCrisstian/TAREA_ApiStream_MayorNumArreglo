import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\tTarea: Obtener el numero mayor en un arreglo");


        Integer[] arr_numeros = new Integer[15];    /*Arreglo de números*/
        Random numeros_random = new Random();
        for (int i = 0; i < arr_numeros.length; i++) {
            arr_numeros[i] = numeros_random.nextInt(100);  /*Asignar al arreglo números al azar*/
            /*Números al azar entre 0 y 99*/
        }
        System.out.println("====================Arreglo de números====================");
        System.out.println(Arrays.toString(arr_numeros));


        Optional<Integer> maximo = Arrays.stream(arr_numeros)   /*Convertir 'Array' en 'Stream'*/
                .reduce(Integer::max);  /*Usar 'reduce' para hallar el mayor valor*/
        System.out.println("\nMayor número del arreglo: " + maximo.get());

    }
}