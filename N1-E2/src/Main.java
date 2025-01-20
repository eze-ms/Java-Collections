import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Clase principal que demuestra la creación de una lista de enteros
 * y la copia de sus elementos en otra lista en orden inverso.
 */
public class Main {
    public static void main(String[] args) {

        // Crear la primera lista y agregar elementos
        List<Integer> firstList = new ArrayList<>();
        firstList.add(10);
        firstList.add(20);
        firstList.add(30);
        firstList.add(40);
        firstList.add(50);

        // Mostrar la primera lista
        System.out.println("Primera lista: " + firstList);

        // Crear la segunda lista para almacenar los elementos en orden inverso
        List<Integer> secondList = new ArrayList<>();

        // Itera para recorrer la primera lista en orden inverso
        ListIterator<Integer> iterator = firstList.listIterator(firstList.size());
        while (iterator.hasPrevious()) {
            secondList.add(iterator.previous()); // Agregar elementos a la segunda lista
        }

        // Mostrar la segunda lista (en orden inverso)
        System.out.println("Segunda lista (orden inverso): " + secondList);
    }
}
