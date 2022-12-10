import java.util.Random;

/**
 * Сортировка слиянием
 */
public class MergeSort {
    int[] array;
    int arrayLength = 0;

    public MergeSort(int length) {
        if (length > 0) {
            array = new int[length];
            arrayLength = length;
        }
    }

    // Слияние двух массивов
    private void merge(int[] workArray, int lower, int middle, int upper) {
        int i = 0;
        int lowerBound = lower;
        int mid = middle - 1;
        int n = upper - lower + 1;
        while((lower <= mid) && (middle <= upper)) {
            if (array[lower] < array[middle]) {
                workArray[i++] = array[lower++];
            } else {
                workArray[i++] = array[middle++];
            }
        }
        while(lower <= mid) {
            workArray[i++] = array[lower++];
        }
        while(middle <= upper) {
            workArray[i++] = array[middle++];
        }
        for(i=0; i < n; i++) {
            array[lowerBound+i] = workArray[i];
        }
    }

    // Заполнение массива случайными числами
    public void fillArray() {
        if (arrayLength > 0) {
            Random random = new Random();
            for (int i = 0; i < arrayLength; i++) {
                array[i] = random.nextInt(100);
            }
        }
    }

    // Вывод массива
    public void printArray() {
        for(int i=0; i < arrayLength; i++) {
            System.out.printf("%3d ", array[i]);
        }
        System.out.println();
    }
    public void sort() {
        int[] workArray = new int[arrayLength];
        recMergeSort(workArray, 0, arrayLength - 1);
    }
    public static void main(String[] args) {
        MergeSort mS = new MergeSort(20);
        mS.fillArray();   // Заполнение массива случайными числами
        mS.printArray();  // Вывод в консоль сформированного массива
        mS.sort();        // Сортировка слиянием
        System.out.println("Отсортированный массив:");
        mS.printArray();  // Вывод отсортированного массива
    }
}