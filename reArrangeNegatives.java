//negatives on the left. positives on the right
class CheckReArrange {

  public static void reArrange(int[] arr) {
    int left = 0;
    int right = arr.length-1;
    while(left < right){
      if(arr[right] < 0 && arr[left] > 0){
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
        left++;
        right--;
      }else if(arr[left] < 0){
        left++;
      }else{
        right--;
      }
    }
    //Write - Your - Code        
  }
}
