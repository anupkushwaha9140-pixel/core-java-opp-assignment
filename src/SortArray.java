public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        // Bubble sort
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing sorted array
        System.out.println("Sorted array:");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}