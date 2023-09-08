public class SelectionSort {

    // Quadratic Time of O(n^2)

    public static void main(String[] args) {

        int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5, 0 };

        selectionSort(array);

        for (int i : array) {
            System.out.print(i + "  ");
        }

    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }
}