public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int[] buffer = new int[array.length];
        mergeSort(array, buffer, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int[] buffer, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(array, buffer, left, mid);
        mergeSort(array, buffer, mid + 1, right);
        merge(array, buffer, left, mid, right);
    }

    private static void merge(int[] array, int[] buffer, int left, int mid, int right) {
        System.arraycopy(array, left, buffer, left, right - left + 1);

        int i = left;      
        int j = mid + 1;   
        int k = left;      

        while (i <= mid && j <= right) {
            if (buffer[i] <= buffer[j]) {
                array[k++] = buffer[i++];
            } else {
                array[k++] = buffer[j++];
            }
        }
        while (i <= mid) {
            array[k++] = buffer[i++];
        }
        while (j <= right) {
            array[k++] = buffer[j++];
        }
    }

    public static void main(String[] args) {
        int[] data = {38, 27, 43, 3, 9, 82, 10, -5, 27};
        System.out.println("Before:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println("\nAfter:");
        mergeSort(data);
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}