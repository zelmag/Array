class CheckFirstUnique
{
 public static int findFirstUnique(int[] arr) 
 {
   LinkedHashMap<Integer,Integer> seen = new LinkedHashMap<>();
   for(int n : arr){
     int count = seen.getOrDefault(n,0);
     seen.put(n,count+1);
   }
   for(Integer element : seen.keySet()){
     if(seen.get(element) == 1){
       return element;
     }
   }
   return -1;
 }
}
