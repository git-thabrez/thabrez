import java.util.Scanner;
public class Baloon3_L3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Rows :");
		int row = scan.nextInt();
		System.out.println("Enter the number of Columns :");
		int col = scan.nextInt();
		Data3 obj = new Data3(row,col);
		
	}

}
class Data3{
	Scanner scan = new Scanner(System.in);
	int row,col;
	int colnum;
	char balcol;
	char option;
	public Data3(int i,int j) {
		this.row=i;
		this.col=j;
	}
	static char arr[][]=new char[5][5];
	
	public void init() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]='-';
			}
		}
	}
	public void add() {
		boolean linecheck;
		boolean flag = true;
		while(flag) {
			System.out.println("Enter the column Number");
			colnum=scan.nextInt()-1;
			if(linecheck=check(colnum)) {
				
			}
		}
	}
	public boolean check(int n) {
		int count=0;
		for(int i=0;i<row;i++) {
			if(arr[i][n]!='-') {
				count++;
				continue;
			}		
		}
		if(count==row)
		    return false;
		else
			return true;
	}
	
}
