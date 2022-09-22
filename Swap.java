import java.util.*;
class Swap{
   public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first Value : ");
	int a = scan.nextInt();
	System.out.println("Enter the Second Value : ");
	int b = scan.nextInt();
        System.out.println("Values Before Swapping : ");
	System.out.println("A is : "+a+"   "+"B is : "+b);
	int temp = a;
	a=b;
	b=temp;
        System.out.println("Values After Swapping : ");
	System.out.println("A is : "+a+"   "+"B is : "+b);
 }
}