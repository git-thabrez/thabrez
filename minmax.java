import java.util.Scanner;
class minmax{
    public static void main(String [] args){
	  Scanner scan = new Scanner(System.in);
         System.out.println("Enter the number of Elemets to Enter... : ");
         int n = scan.nextInt();
         int arr[] = new int[n];		 
		 for(int i=0;i<n;i++){
		      arr[i] = scan.nextInt();
		 }
		 int temp[] = new int[n];
		 temp[0]=arr[n-1];
		 for(int i=0;i<n-1;i++){
		     temp[i+1]=arr[i];
		 }
		 System.out.println("The soted array is : ");
		 for(int i=0;i<n;i++){
		     System.out.println(temp[i]);
		 }
	}
}