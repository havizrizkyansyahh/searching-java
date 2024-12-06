public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 35, 48, 56, 68 };
        int n = 68;
        int arrLength = arr.length;

        int result = binarySearch(arr, 0, arrLength - 1, n);

        if(result == -1){
            System.out.println("Angka " + n + " tidak ditemukan pada array!");
        } else{
            System.out.println("Angka " + n + " ditemukan pada index ke-" + result + " pada array.");
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int n) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == n){
                return mid;
            }
            
            if (arr[mid] > n){
                return binarySearch(arr, left, mid - 1, n);
            }
                
            return binarySearch(arr, mid + 1, right, n);
        }

        return -1;
    }
}
