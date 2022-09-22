import java.util.*;
class AreaAndPerimeter
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius...");
		float radius = scan.nextFloat();
		System.out.println("The Area for the given inpt is :"+(Math.PI*radius*radius));
		System.out.println("The Perimeter of the iven input is : "+(2*Math.PI*radius));
	}
		
}