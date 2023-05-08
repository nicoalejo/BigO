import java.util.*;

public class BigO {

   public String O1(){
       Stack<Integer> testStack = new Stack<>();

       long linearStartTime = System.nanoTime();
       testStack.push(1);
       long linearEndTime = System.nanoTime();
       long linearDuration = linearEndTime - linearStartTime;


   }


   public void TestBigO(){
        int[] sizes = {1000, 10000, 100000, 1000000, 10000000}; // Diferentes tamaños de datos para probar los algoritmos

        for (int size : sizes) {
            int[] data = generateRandomArray(size);

            // Medir el tiempo de ejecución de la búsqueda lineal
            long linearStartTime = System.nanoTime();
            linearSearch(data, -1); // Buscar un valor que no esté en el arreglo para asegurar el peor caso
            long linearEndTime = System.nanoTime();
            long linearDuration = linearEndTime - linearStartTime;

            // Ordenar el arreglo para la búsqueda binaria
            Arrays.sort(data);

            // Medir el tiempo de ejecución de la búsqueda binaria
            long binaryStartTime = System.nanoTime();
            binarySearch(data, -1); // Buscar un valor que no esté en el arreglo para asegurar el peor caso
            long binaryEndTime = System.nanoTime();
            long binaryDuration = binaryEndTime - binaryStartTime;

            System.out.printf("Size: %d | Linear Search: %d ns | Binary Search: %d ns%n", size, linearDuration, binaryDuration);
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }
        return array;
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == value) {
                return middle;
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}