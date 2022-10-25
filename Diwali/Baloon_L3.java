import java.util.Scanner;

public class Baloon_L3 
{
	public static void main(String[] args) 
	{
		Data obj = new Data();
		obj.add();
	    obj.view();
	}

}
class Data
{
	public Data() 
	{
		System.out.println("Enter the number of rows :");
		this.row=scan.nextInt();
		System.out.println("Enter the number of columns :");
		this.col=scan.nextInt();
		char arr[][]=new char[row][col];
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				arr[i][j]='-';
			}
		}
	}
	Scanner scan = new Scanner(System.in);
	int row;
	int col;
	int colnum;
	char balcol;
	boolean flag =true;
	char option;
	
	char arr[][]=new char[row][col];
	
	public void add() 
	{
		
		
		while(flag) 
		{
	    	System.out.println("Enter the column number :");
			colnum=scan.nextInt()-1;
			if(arr[0][colnum]=='-'||arr[1][colnum]=='-'|| arr[2][colnum]=='-') 
			{
				System.out.println("Enter the Baloon color :");
				balcol=scan.next().charAt(0);
				if(balcol=='R')
					balcol=88;
				if(balcol=='B')
					balcol=66;
				if(arr[2][colnum]!=0) 
				{
					arr[2][colnum]=balcol;
				}
				else if(arr[1][colnum]!=0) {
					arr[1][colnum]=balcol;
				}
				else if(arr[0][colnum]!=0) {
					arr[0][colnum]=balcol;
				}
				System.out.println("Do you want to continue(Y/N) :");
		    	option=scan.next().charAt(0);
		    	if(option=='Y') {
		    		option=89;
		    	}
		    	else if(option=='N') {
		    		//option=78;
		    		flag=false;
		    		break;
		    	}
			}
			
	    }
	}
	public void view() {
		    for(int i=0;i<row;i++) {
		    	for(int j=0;j<col;j++) {
		    		System.out.print(arr[i][j]+" ");
		    	}
		    	System.out.println();
		    }
	}
}
