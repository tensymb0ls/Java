public class ArrayTools {
    public static void main(String[] args){
        int[] arr = {15,2,6,4,5};
        PrintArray.prntArray(arr);
        int a = Math.min(1, 0);
        System.out.println("________");
        System.out.println(a);
        System.out.println("________");
        //////////////////////////////////////
        int[] arr3 = new int[100];
        fillArrInRange(arr3, 1, 20);
        System.out.println(arr3);
    }
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    /// бинарный поиск
public static int binarySearch(int[] arr, int n){
    int l = 0, r = arr.length - 1, mid;
    while(l <= r){
        mid = (l + r) / 2;
        if(arr[mid] == n){
            return mid;
        }else if(n > arr[mid]){
            l = mid +1;
        }else{
            r = mid -1;
        }
    }
    return -1;
}
//рандом генератор массива
public static void fillArrInRange(int[] arr, int min, int max){
    for(int i = 0; i < arr.length; i++){
        int rnd = (int) (min + Math.random() * (max - min));
        arr[i] = rnd;
    }
}

}
