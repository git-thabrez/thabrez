import java.util.*;
class NumSorting{
     public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Elements : ");
        int n = scan.nextInt();
        System.out.println("Enter the Elements 0's 1's and 2 : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
         arr[i]=scan.nextInt();
        }
        Sort obj=new Sort();
        obj.sort(arr,n);
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
         }
  }
}
class Sort{
    public void sort(int arr[],int n){
          Swap obj1 = new Swap();
          int low=0;
          int mid=0;
          int high = n-1;
          while(mid<=high){
            if(arr[mid]==0){
                obj1.swap(arr,low,mid);
                low++;
                mid++;
                }
            else if(arr[mid]==1){
                   mid++;
              }
            else{
              obj1.swap(arr,mid,high);
              high--;
            }
         }
     }
  }
class Swap{
      public void swap(int arr[],int i,int j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
     }
}