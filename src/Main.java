import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;

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

        System.out.println("\n===============Respuesta Correcta implementando una función LAMBDA propia===============\n");
        Function<Integer[], Integer> max = arr -> Arrays.stream(arr).reduce(0, (a, b) -> a > b ? a: b);
        /*Function<Entrada, Salida>*/
        /*reduce(Valor inicial, (a, b) -> a > b ? Asignar a 'a' el valor de 'b');*/

        Integer resultado = max.apply(arr_numeros);
        System.out.println("Mayor número del arreglo: " + resultado);


    }
}