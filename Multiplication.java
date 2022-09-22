import java.util.*;
class Multiplication{
	public static void main(String [] args){
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the number for the tables : ");
	 int n = scan.nextInt();
	 for(int i=1;i<=10;i++){
	   int mul = n*i;
	   System.out.println(n+"*"+i+"="+mul);
	 }
  }
}
