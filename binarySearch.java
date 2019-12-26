class BinarySearch{
  //a is sorted array
  static int binSearch(int[] a, int key) {
    int low = 0;
    int high = a.length - 1;
    while(low <= high){
      int mid = low + ((high - low) / 2); //to prevent overflow
      if(a[mid] == key){
        return mid;
      }
      if(a[mid] < key){
        low = mid+1;
      }else{
        high = mid - 1;
      }
    }
    return -1;
  }
}  
