import java.util.*;
class Library1
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=0;
		do{
		System.out.println("'1' for Admin and '2' for User :");
		 n = scan.nextInt();
		switch(n){
		     case 1:
		       {
		    	  AdminWork aw = new AdminWork();
			      aw.signIn(); 
			      aw.work();
			      break;
		       }
		     case 2:
		       {
		    	   UserWork us = new UserWork();
		    	   us.signUp();
		    	   us.signIn();
		    	   us.uwork();
		    	   break;
		       }
		}
		}while(n!=3);
	}	
}

class Login{
	public Login() {
		// TODO Auto-generated constructor stub
	}
	public Login(String admin) {
		userName="Thabrez";
		password="Thabrez#1999";
	}
	Scanner scan = new Scanner(System.in);
	String userName;
	String password;
	public void signIn(){
		System.out.println("Enter the User Name : ");
		String Name1=scan.next();
		System.out.println("Enter the password : ");
		String Pass1=scan.next();
		if(Name1.equals(userName)&&Pass1.equals(password))
		{
			System.out.println("Signed in successfully");
		}
		else
		{
			System.out.println("Account not found....");
			System.out.println("Try to signin first...");
		}
	}
	public void signUp(){
		System.out.println("Enter the User Name");
	    userName = scan.next();
		while(true)
		{
			System.out.println("Enter the password");
		    password=scan.next();	
		   if(password.length()>=8)
		     {
			    int u=0,l=0,n=0,s=0;
                for(int i=0;i<password.length();i++)
			      {
				     if(password.charAt(i)>=48 && password.charAt(i)<=57)
					       n++;
				     if(password.charAt(i)>=65 && password.charAt(i)<=90)
					       u++;
				     if(password.charAt(i)>=97 && password.charAt(i)<=122)
					       l++;				        
				     if(password.charAt(i)>=33 && password.charAt(i)<=47)				        
					       s++;				       				
			      }	
                if(n>=1 && l>=1 && u>=1 &&	s>=1)
				{
					System.out.println("Password Validated..");
					break;
				}
				     
                else
					System.out.println("Password must contain atleast 1 upper lower number and special characters...");					
		     }
			else
				System.out.println("Password is Too short... Try Again ");
	    }
	}
}


class AdminWork extends Login{
	public AdminWork() {
		super("Admin");
	}
	
	Scanner scan = new Scanner(System.in);
	static String BookName[]= new String[50];
	static int Count []=new int[50];
	 static int Price[]=new int [50];
	 int k=0;
	public void work(){
		
		boolean end=true;
		while(end){
			System.out.println("Enter '1' for View, '2' for Add, '3' Delete, '4' for Update, '5' for Exit");
			int a = scan.nextInt();
			switch(a)
			{
			case 1:
			{
				view();
				break;
			}
			case 2:
			{
			    add();
				break;
			}
			case 3:
			{
				delete();
				break;
			}
			case 4:
			{
				update();
				break;
			}
			case 5:
			{
				end=false;
				break;
			}
			}
		}
	}
	 void view(){
		System.out.println("S.No"+"  "+"Book:"+"   "+"Count:"+"   "+"Price:");
		for(int i=0;i<BookName.length;i++){
			if(Price[i]!=0)
			{
			System.out.println((i)+"     "+BookName[i]+"    "+Count[i]+"     "+Price[i]+" ");
			System.out.println();
			}
		}
	}
	
	void add(){
		System.out.println("Enter the Number of books to add :");
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++){
			System.out.println("Enter the Title :");
			BookName[k]=scan.next();
			System.out.println("Enter the Book Count :");
			Count[k]=scan.nextInt();
			System.out.println("Enter the Price of the Book :");
			Price[k]=scan.nextInt();
			++k;
		}
		System.out.println("Books added Successfully...");
	}
	
	void delete(){
		System.out.println("Enter the Serial No to delete :");
		int n = scan.nextInt();
		BookName[n]=null;
		Count[n]=0;
		Price[n]=0;
		for(int i=n;i<Count.length;i++){
			String temp=BookName[n];
			BookName[n]=BookName[n+1];
			BookName[n+1]=temp;
			
			int count=Count[n];
			Count[n]=Count[n+1];
			Count[n+1]=count;
			
			int value=Price[n];
			Price[n]=Price[n+1];
			Price[n+1]=value;
		}
	}
	
	void update(){
		System.out.println("Enter the Serial number to update");
		int n = scan.nextInt();
		System.out.println("Enter '1' for BookName, '2' for BookCount, '3' for BookPrice");
		int m= scan.nextInt();
		switch (m){
		case 1:
		{
			System.out.println("Enter the BookName :");
			String str = scan.next();
			BookName[n]=str;
			break;
		}
		case 2:
		{
			System.out.println("Enter the Book Count :");
			int y = scan.nextInt();
			Count[n]=y;
			break;
		}
		case 3:
		{
			System.out.println("Enter the Book Price :");
			int z = scan.nextInt();
			Price[n]=z;
			break;
		}
		}
	}
	
}

class UserWork extends AdminWork{
	public void uwork(){
		boolean end = true;
		while(end){
			System.out.println("Enter '1' for view BookDetails, '2' for buy Book, '3' for Read Content,'4' for End");
			int n = scan.nextInt();
			switch(n){
			case 1:
			{
				view();
				break;
			}
			case 2:
			{
				buy();
				break;
			}
			case 3:
			{
				read();
				break;
			}
			case 4:
			{
				end = false;
				break;
			}
			}
		}
	}
	public void buy(){
		System.out.println("Enter the S.No to buy :");
		int n = scan.nextInt();
		Count[n]-=1;
		System.out.println("Book Purchased Successfully.....");
	}
	public void read(){
		System.out.println("Enter the S.No For which book u wanna Read Description");
		int f = scan.nextInt();
		System.out.println(BookName[f]);
		System.out.println("About This Book");
		System.out.println("Enjoy your first step into the world of programming");
		System.out.println("Understand what a language is and use its features to build applications");
		System.out.println("Learn about a wide variety of programming applications");
		System.out.println("Who This Book Is For");
		System.out.println("Introduction to Programming is for anybody who wants to learn programming.");
		System.out.println(" All you'll need is a computer, internet connection, and a cup of coffee.");
		System.out.println("What You Will LearnIn DetailStyle and approach");
	}
	

	
}


