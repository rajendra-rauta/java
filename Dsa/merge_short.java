package Dsa;

public class merge_short {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];
        int idx_1 = si;
        int idx_2 = mid + 1;
        int x = 0;

        while (idx_1 <= mid && idx_2 <= ei) {
            if (arr[idx_1] <= arr[idx_2]) {
                merge[x++] = arr[idx_1++];
            } else {
                merge[x++] = arr[idx_2++];
            }
        }
        while (idx_1 <= mid) {
            merge[x++] = arr[idx_1++];

        }
        while (idx_2 <= ei) {
            merge[x++] = arr[idx_2++];
        }

        for (int i = 0, j = si; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; //
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}
