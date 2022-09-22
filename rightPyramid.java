import java.util.Scanner;
class rightPyramid{
	public static void main(String [] args){
		System.out.println("Enter the number of rows... ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
