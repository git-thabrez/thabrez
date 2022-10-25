import java.util.*;
public class CodeDoubts {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Rows :");
		int n=scan.nextInt();
		System.out.println("Enter the number of Columns :");
		int m = scan.nextInt();
		Data2 obj = new Data2(n,m);
		obj.init();
		obj.work();
		
	}

}
class Data2{
	Scanner scan = new Scanner(System.in);
	int row;
	int col;
	int colnum;
	char balcol;
	char option;
    public Data2(int i,int j) {
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
	
	public void view() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
public void add() { 
	boolean linecheck;
	boolean flag = true;
		while(flag) {
	    	System.out.println("Enter the column number :");
			colnum=scan.nextInt()-1;
			linecheck=check(colnum);
			if(linecheck) {
				if(arr[0][colnum]=='-'||arr[1][colnum]=='-'|| arr[2][colnum]=='-') {
					System.out.println("Enter the Baloon color :");
					balcol=scan.next().charAt(0);

					
					if(arr[2][colnum]=='-') {
						arr[2][colnum]=balcol;
					}
					else if(arr[1][colnum]=='-') {
						arr[1][colnum]=balcol;
					}
					else if(arr[0][colnum]=='-') {
						arr[0][colnum]=balcol;
					}
					view();
					System.out.println("Do you want to continue(Y/N) :");
			    	option=scan.next().charAt(0);
//			    	
			        if(option=='N') {
			    		flag=false;
			    		break;
			    	}
		       }
				else {
					System.out.println("MATRIX IS FULL...");
					break;
				}
			}
			else {
				System.out.println("The column is Full...");
				break;
			}
			
        }
    }
public void work() {
	boolean flag =true;
	System.out.println("\t    Welcome");
	while(flag) {
		System.out.println("Press '1' for add Baloon, '2' for view, '3' for exit");
		int n = scan.nextInt();
		switch(n) {
		case 1 :{
			add();
			break;
		}
		case 2:{
			view();
			break;
		}
		case 3:{
			flag = false;
			break;
		}
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
