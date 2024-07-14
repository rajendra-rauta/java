package Dsa;

public class quick_short {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]= arr[high];
        arr[high]= temp; 
        return i; // pivot index
    }

    public static void quickShort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quickShort(arr, low, pidx - 1);
            quickShort(arr, pidx + 1, high);

        }

    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        quickShort(arr, 0, n - 1);
        // print
        for(int i= 0; i<n; i++){
            System.out.println(arr[i]+ " ");
        }
System.out.println();
    }

}
