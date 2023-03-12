class Main {
  public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
    System.out.println(arr[4]);
    /////////////////////////////
    int[] arr1 = new int[3]; // указан только заголовок массива, поэтому привызовеьмассива выйдет "адрес" а при выхове индекса выйдет 0
    System.out.println(arr1);
    System.out.println(arr1[2]);
///////////////////////
    arr = new int[]{1,2,3,4,5};
    System.out.println(arr[2]);
    ////////////////////////////
    
    
  }
  
  
}