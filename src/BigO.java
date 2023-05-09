import java.util.*;

public class BigO {

   public String O1(){
       Stack<Integer> testStack = new Stack<>();

       long timeStack = System.nanoTime();
       testStack.push(1);
       long endTimeStack = System.nanoTime();
       long durationSmallStack = (endTimeStack - timeStack) / 1000;

       Stack<Integer> testLongStack = new Stack<>();

       for (int i=0; i < 100000; i++){
           testLongStack.push(i);
       }

       long timeStack2 = System.nanoTime();
       testStack.push(100005);
       long endTimeStack2 = System.nanoTime();
       long durationLongStack = (endTimeStack2 - timeStack2) / 1000;

       return "Duracion Stack Pequeño ms: " + durationSmallStack + "\n" +
               "Duracion Stack Grande ms: " + durationLongStack + "\n";
   }

   public String hashTest(){
       HashMap<Integer, String> testHashMap = new HashMap<>();
       List<Integer> mylist = new ArrayList<>();

       for (int i=0; i < 10000000; i++){
           testHashMap.put(i, "num"+i);
           mylist.add(i);
       }

       long timeinit = System.nanoTime();
       testHashMap.get(500000);
       long endTime = System.nanoTime();
       long duration = (endTime - timeinit);

       long timeinitList = System.nanoTime();
       for (int i=0; i < mylist.size(); i++){
           if(i == 500000) break;
       }
       long endTimeList = System.nanoTime();
       long durationList = (endTimeList - timeinitList);

       return "Duración de busqueda en el hashmap " + duration + "\n" +
               "Duración de busqueda lineal " + durationList;
   }

   public String ForVSForEach(){
       String timeToTraverse = "";
       List<Integer> mylist = new ArrayList<>();

       for (int i = 0; i < 10000000; i++) {
           mylist.add(i);
       }

       long forLoopStartTime = System.currentTimeMillis();
       for (int i = 0; i < mylist.size(); i++)
       {
           mylist.get(i);
       }
       long forLoopTraversalCost = System.currentTimeMillis()-forLoopStartTime;
       timeToTraverse += "El tiempo que demora usando for es " + forLoopTraversalCost + "\n";

       long forEachStartTime = System.currentTimeMillis();
       for (Integer integer : mylist) {}

       long forEachTraversalCost =System.currentTimeMillis()-forEachStartTime;
       timeToTraverse += "El tiempo que demora usando for-each es " + forEachTraversalCost;

       return timeToTraverse;
   }


   public String ON(){
       int[] sizes = {1000, 10000, 100000, 1000000, 10000000};
       String timeResults = "";
       for (int size : sizes) {
           long resultado = 0;
           long linearStartTime = System.nanoTime();
           for(int i=1; i <= size; i++){
               resultado += i;
           }
           long linearEndTime = System.nanoTime();
           long linearDuration = (linearEndTime - linearStartTime) / 1000000;

           timeResults += "La duración del tamaño " + size + " es " + linearDuration +"\n";
       }

       return timeResults;
   }

   public String TestBigO(){
        int[] sizes = {1000, 10000, 100000, 1000000, 10000000}; // Diferentes tamaños de datos para probar los algoritmos
        String tiempos = "";
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

            tiempos += "Size: " + size + "| Linear Search: "+linearDuration+" ns | Binary Search: "+binaryDuration+" ns\n";

        }
        return tiempos;
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