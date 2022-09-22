import java.util.*;
class Change{
   public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str = scan.next();
	char arr[] = str.toCharArray();
	for(int i=0;i<arr.length;i++){
	   if(arr[i]>='a' && arr[i]<='z'){
               arr[i]=(char)(122-(int)arr[i]+97);
              }
	   if(arr[i]>='A' && arr[i]<='Z'){
		arr[i]=(char)(90-(int)arr[i]+65);
	      }
           }
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]);
	}
   }
}