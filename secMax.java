class CheckSecondMax {
  
  public int findSecondMaximum(int[] arr)
  {
    int max = Integer.MIN_VALUE;
    int secMax = Integer.MIN_VALUE;
    for(int n : arr){
      if(n > max){
        //when find a new max. old max becomes new secMax
        secMax= max;
        max = n;
      }else if(n > secMax){
        secMax = n;
      }
    }
    return secMax;
  }
}
