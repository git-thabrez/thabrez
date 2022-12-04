import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		Starter obj = new Starter();
		obj.work();
		
		
	}

}

class Starter{
	Scanner scan = new Scanner(System.in);
	static int n=1,count=0;
	static char a[][]= new char[3][3];
	
	public Starter() {
		init();
		display();
	}
	public void init()
	{
		char ch=49;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=ch;
				ch++;
			}
		}
	}
	
	public void display() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	 
	public void work() {
		while(true)
		{
			if(n==1){
				System.out.println("Now X's turn......");
				System.out.println("Enter the number : ");
				char input=scan.next().charAt(0);
				char option='X';
				++n;
				setInput(input,option);
				display();
			}
			else if(n==2)
			{
				System.out.println("Now O's turn......");
				System.out.println("Enter the number : ");	
				char input1=scan.next().charAt(0);
				char option='O';
				--n;
				setInput(input1,option);
				display();
			}
		}
	}
	
	public void setInput(char input,char op) {
		boolean c=true;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]==input)
				{
					count++;
					c=false;
					a[i][j]=op;
				}
			}
		}
		winner(op);
		if(c)
		{
			System.out.println("The place is already filled !!!!");
			n=(n==2)?--n:++n;
		}
		if(count == 9)
		{
			display();
			System.out.println("The boxes are filled \n \tGAME OVER");
			System.exit(0);
		}
	}
	
	public void winner(char op) {
		int count1=0,count2=0,count3,count4=0;
		for(int i=0;i<3;i++)
		{
			int m=0;
			for(int j=0;j<3;j++)
			{
				if(a[i][m]==op)
				{
					m++;
					count1++;
					if(count1==3)
					{
						display();
						System.out.println(" Conratulations !!"+op+"'s won the match ");
						System.exit(0);
					}
				}
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]==op)
				{
					count3=0;
					for(int m=i;m<3;m++)
					{
						if(a[m][j]==op)
						{
							count3++;
							if(count3==3)
							{
								display();
									System.out.println(" Conratulations !!"+op+"'s won the match ");
									System.exit(0);
							}
						}
					}
				}
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j && a[i][j]==op)
				{
					count2++;
					if(count2==3)
					{
						display();
						System.out.println(" Conratulations !!"+op+"'s won the match ");
						System.exit(0);
					}
				}
			}
		}
		
		
		for(int i=0,j=2;i<3 && j>=0;i++,j--)
		{
			if(a[i][j]==op)
			{
				count4++;
				if(count4==3)
				{
					display();
					System.out.println(" Conratulations !!"+op+"'s won the match ");
					System.exit(0);
				}
			}
		}
	}
	
	
}
