//move all elements 1 to the right. last becomes first. 
class CheckRotateArray{
  
  public static void rotateArray(int[] arr){
      int last = arr[arr.length-1];
      for(int i = arr.length-1; i>0; i--){
        arr[i] = arr[i-1]; //shift 1 to the right starting from the end
      }
      arr[0] = last;
    }
}
