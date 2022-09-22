import java.util.Scanner;
class pyramidNumber{
      public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the number of rows...");
	  int n = scan.nextInt();
	  int sum=1;
	  for(int i=0;i<n;i++){
	     for(int j=0;j<=i;j++){
		      System.out.print(sum+" ");
			  sum++;
		 }
		 System.out.println();
	  }
}
}