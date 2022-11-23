import java.util.*;
public class BankFinal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=0;
        do{
            System.out.println("Enter '1' for Login :\nEnter '2' for UserAccess :\nEnter '3' for Exit");
            a = scan.nextInt();
            Customer obj=new Customer();
            switch(a){
                case 1:
                {
                    obj.log();
                    break;
                }
                case 2:
                {
                    int s=obj.signIn();
                    System.out.println(s);
                    obj.work(s);
                    break;
                }
            }

        }
        while(a!=3);

    }
}
class LoginPortal
{
    static Scanner scan=new Scanner(System.in);
    static int u=3;
    String username[]=new String[u];
    String password[]=new String[u];
    static int deposit[]=new int[u];
   static int count=0;
    void signUp()
    {
        if(count!=u) {
            System.out.println("Enter the Username :");
            String cname=scan.next();
            System.out.println("Enter the Password :");
            String cpass=scan.next();
            System.out.println("Enter the Deposit Amount :");
            int depo=scan.nextInt();
            username[count]=cname;
            password[count]=cpass;
            deposit[count]=depo;
            ++count;
        }
        else
            System.out.println("No.of.exceeds");
    }
    int signIn() {
        int value=-1;
        System.out.println("Enter the username");
        String sname=scan.next();
        System.out.println("Enter the password");
        String spass=scan.next();
        for(int i=0;i<u;i++) {
         if(sname.equals(username[i]) && spass.equals(password[i]))
         {
             value=i;
             System.out.println("Login successfully :)");
             break;
         }
        }
    if(value!=-1)
        return value;
    else
        return -1;
    }
}
class Customer extends LoginPortal
{
     int giftCard[]=new int[u];
     int giftCardAmount[]=new int[u];
     int giftCardPin[]=new int[u];

     int reedemPoint[]=new int[u];
     static  String block[]={"null","null","null"};
     int cardNum=19131,pinNum=8141;

    void log()
    {
        int n=0;
        do {
            System.out.println("Enter '1' for signin\nEnter '2' for signup\nEnter '3' for Exit");
            n=scan.nextInt();
            switch (n)
            {
                case 1:
                 int index=signIn();
                 if(index!=-1)
                 {
                     //cardDetails(index);
                     System.out.println("Logged in successfully...");
                     System.out.println(index);
                     work(index);
                 }
                 else
                 {
                     System.out.println("No account found :(");
                 }
                    break;
                case 2:
                 signUp();
                    break;
            }
        }while(n!=u);
    }
//    void cardDetails(int index)
//    {
//        System.out.println("You are Get in");
//        System.out.println(index);
//    }


    void createGiftCard(int i){
        int index=i;
        if(giftCard[index]==0){
            giftCard[index]=cardNum;
            giftCardPin[index]=pinNum;
            cardNum++;
            pinNum++;
            System.out.println("Gift card Generated Sucessfully...");
            System.out.println("Card Num :"+cardNum+"\nCard Pin :"+pinNum);
        }
        else {
            System.out.println("Already Having GiftCard....");
        }
    }


    void topUp(int i){
        int index=i;
        System.out.println("Enter the Amount to be Added :");
        int n = scan.nextInt();
        if(block[index].equals("Block")){
            System.out.println("Card is Blocked Cannot add Money...");
        }
        else if(giftCard[index]!=0){
            if(deposit[index]>=n){
                giftCardAmount[index]+=n;
                System.out.println("Amount added to GiftCard....");
                deposit[index]-=n;
                int points=n/100;
                reedemPoint[index]=points;
                if(points>=10 && points%10==0){
                    deposit[index]+=points;
                    System.out.println("Total Amount in account :"+deposit[index]);
                }
            }
            else{
                System.out.println("Not enough Amount in deposit Cash...");
            }
        }
        else{
            System.out.println("You don't have a GiftCard...");
        }


    }


    void transactionHistory(int i){
       int index=i;
        System.out.println("The Transaction History....");
        System.out.println("Amount in card :"+giftCardAmount[index]);
    }


    void block(int i){
        int index=i;
        System.out.println("Card is Blocked Sucessfully...");
        block[index]="Block";
        int amount=giftCardAmount[index];
        giftCardAmount[index]=0;
        deposit[index]+=amount;

    }



    void work(int i){
        int index=i;
        int n=0;
        do{
            System.out.println("Enter '1' for CreateGiftCard :\n"+
                    "Enter '2' for Topup :\n"+
                    "Enter '3' for Transaction History :\n"+
                    "Enter '4' for Block :\n"+
                    "Enter '5' for Logout :");

            n = scan.nextInt();

            switch(n)
            {
                case 1:
                {
                    createGiftCard(index);
                    break;
                }
                case 2:
                {
                    topUp(index);
                    break;
                }
                case 3:
                {
                    transactionHistory(index);
                    break;
                }
                case 4:
                {
                    block(index);
                    break;
                }
            }

        }
        while(n!=5);


    }
}