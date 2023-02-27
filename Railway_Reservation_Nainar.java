import java.util.Scanner;

public class Railway_Reservation{
    static int lower=1,upper=1,middle=1,waiting=1,for_index=0,q=0,m=0,n=0;
    static  int[] wait=new  int[4];
    static class Booking
    {
        int passenger_id,passenger_age;
     String passenger_name;
     char berth;
     public void check(char be)
     {
         m++;
         if(lower==0 && upper==0 && middle==0 && waiting==0) {
             System.out.println("All Tickets are Booked.....");
             n--;
         }
         else {
             if (be == 'l' && lower > 0) {
                 berth=be;
                 System.out.println("Lower Berth is Booked....");
                 lower--;
             } else if ((be == 'm' && middle >0) || (be == 'l' && middle>0) || (be=='u' && upper<=0)) {
                 berth='m';
                 System.out.println("Middle Berth is Booked....");
                 middle--;
             } else if ((be == 'u' && upper >0) || (be == 'm' && upper>0) || (be == 'l' && upper>0)) {
                 berth='u';
                 System.out.println("Upper Berth is Booked....");
                 upper--;
             }
             else {
                 berth='W';
                 wait[for_index++] =m;
                 System.out.println("You are waiting list....");
                 waiting--;
             }
             System.out.println("Booked Successfully.........!");
         }
     }
    };
    static void display()
    {
        System.out.println("Lower_Berth : "+lower);
        System.out.println("Middle_Berth : "+middle);
        System.out.println("Upper_Berth : "+upper);
        System.out.println("Waiting List : "+waiting);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Booking[] pass=new Booking[10];
        int c=0,v=0,j=0;
        do{
            System.out.println();
            System.out.println(" 1. Booking\n" +
                    " 2. Availability checking\n" +
                    " 3. Cancellation\n" +
                    " 4. Display the Details\n"+
                    " 5. Exit");
            c=sc.nextInt();
            switch (c)
            {
                case 1:
                    n++;
                    System.out.println();
                    pass[n]=new Booking();
                    pass[n].passenger_id=n;
                    System.out.println("Enter the Passenger Name:");
                    pass[n].passenger_name=sc.next();
                    System.out.println("Enter the Passenger Age:");
                    pass[n].passenger_age=sc.nextInt();
                    System.out.println("Enter the Berth:");
                    char berth=sc.next().charAt(0);
                    pass[n].check(berth);
                    break;
                case 2:
                    System.out.println("Available Tickets :");
                    System.out.println("==============================");
                     display();
                    break;
                case 3:
                    System.out.println("Enter the Passenger Id:");
                    int check_pass=sc.nextInt();
                    pass[check_pass].passenger_id=-1;
                    pass[wait[q++]].berth=pass[check_pass].berth;
                    System.out.println("Canceled Successfully.........!");
                    waiting++;
                    break;
                case 4:
                    System.out.println("Passenger ID" + "   " + "Passenger Name" + "     " + "Passenger Age" + "    " + "Berth");
                    System.out.println("-----------------------------------------------------------------------------------------");
                    for(int i=1;i<=n;i++) {
                        if(pass[i].passenger_id!=-1)
                            System.out.println(pass[i].passenger_id + "               " + pass[i].passenger_name + "                 " + pass[i].passenger_age + "          " + pass[i].berth);

                    }
                    break;
                case 5:
                   v=1;
                   break;

            }
        }while(v!=1);
    }
}
