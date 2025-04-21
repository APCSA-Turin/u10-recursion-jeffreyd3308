import java.util.Arrays;

public class MergeSort {
    private static int amountCall = 0;
    private static int amtCall = 0;
    public static void main(String[] args) {
        int[] arr = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
        System.out.println(amountCall);
        System.out.println(amtCall);
    }

    private static void mergeSort(int[] elements, int from, int to, int[] temp) {
        amountCall++;
        if (from < to) {
            int middle = (from + to) / 2;
            mergeSort(elements, from, middle, temp); // recurse left
            mergeSort(elements, middle + 1, to, temp); // recurse right
            merge(elements, from, middle, to, temp); // merge halves
        }
    }

    private static void merge(int[] elements, int from, int mid, int to, int[] temp) {
        amtCall++;
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to) {
            if (elements[i] < elements[j]) {
                temp[k] = elements[i];
                i++;
            } else {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to) {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++) {
            elements[k] = temp[k];
        }
    }
}
