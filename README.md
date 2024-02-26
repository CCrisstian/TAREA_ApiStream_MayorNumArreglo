<h1 align="center">Tarea: Obtener el numero mayor en un arreglo</h1>
<p>Obtener el numero mayor en un arreglo con programación funcional lambda y api stream</p>
<p>El siguiente ejercicio es obtener el numero mayor de un arreglo pero utilizando programación funcional, 
  implementando la expresión lambda Function<T,R> (que viene predefinida) con el api stream y operador reduce.</p>

<h2 align="center">Respuesta del Profesor</h2>

```java
import java.util.Arrays;
import java.util.function.Function;

public class ProyectoJava8Stream {

    public static void main(String[] args) {
        // la función lambda que obtiene el numero mayor del arreglo usando api stream en su implementación
        Function<Integer[], Integer> max = arr -> Arrays.stream(arr).reduce(0, (ac, e) -> ac > e? ac: e);

        int resultado = max.apply(new Integer[]{1, 78, -1700, 2500, 0, 2000, 54, 2});
        System.out.println(resultado);
    }
}
```
