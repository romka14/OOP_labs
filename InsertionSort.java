
public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] data = {3, 123, 23, 21, 10};
        System.out.println("Before:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println("\nAfter:");
        insertionSort(data);
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}