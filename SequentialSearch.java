class SequentialSearch {
    public static void main (String [] args){
        int[] arr = { 13, 28, 31, 44, 76 };

        int n = 31;

        int result = sequentialSearch(arr, n);

        if(result == -1){
            System.out.println("Angka " + n + " tidak ditemukan pada array!");
        } else {
            System.out.println("Angka " + n + " ditemukan pada index ke-" + result + " pada array.");
        }
    }

    public static int sequentialSearch(int[] arr, int n){
        int arrLength = arr.length;

        for(int i = 0; i < arrLength; ++i){
            if(arr[i] == n){
                return i;
            }
        }

        return -1;
    }
}