import java.util.*;
public class RemoveFromSortedArray{
 
  public static int removeDup(int arr[]){
    int j=1;

    for(int i=1;i<arr.length;i++){
      if(arr[i]!=arr[i-1]){
        arr[j++]=arr[i];
       }
    }
    return j;
   
   }

  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     }
    System.out.println(removeDup(arr));
     
  }

}