import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Main {

    Scanner in = new Scanner(System.in);
    Passenger[][] ticket = new Passenger[1][6];
    ArrayList<Passenger> passengerList = new ArrayList<>();
    Queue<Passenger> waitingList = new LinkedList<>();
    Serialization sc = new Serialization();


    int freeTicket = ticket.length * ticket[0].length;
    public static void main(String[] args) {
        Main m = new Main();
        m.showMenu();
    }

    public void writeInFile(String s){
        try{
            FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\INC - 3508\\EVALUATION -1\\Passenger.txt",true);
            for(int i=0;i<ticket.length;i++){
                for(int j=0;j<ticket[i].length;j++){
                    fw.write(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showMenu() {
        boolean flag = true;
        System.out.println("Welcome to LakeView Flight-Booking System!!!\n");
        while(flag){
            System.out.println("Menu ---> ");
            System.out.print("1.Book New Ticket\n2.Show Available Ticket\n3.Display All Seats\n4.Show Passenger Details\n5.Show Filled Passenger List\n6.Cancel Ticket\n7.Show Waiting List\n8.Print Deserialized Data\n9.Exit\nEnter Your Choice : ");
            int choice = in.nextInt();
            switch(choice){
                case 1 : bookNewTicket();break;
                case 2 : showFreeTickets();break;
                case 3 : displayPassengersList();break;
                case 4 : showPassengerDetails();break;
                case 5 : showFilledPassengerList();break;
                case 6 : cancelBookedTicket();break;
                case 7 : showWaitingList();break;
                case 8 : printSerializedData();break;
                case 9 : System.out.println("Thank you for visiting LakeView!! :)");flag = false;break;
                default : System.out.println("Invalid Input, Please Try again");break;
            }
        }
    }

    private void printSerializedData() {
        ArrayList<Passenger> list = sc.doDeSerialization();
        for(Passenger p : list){
            System.out.println("Passenger Name : "+p.getPassengerName()+"\tPassenger Ticket Type : "+p.getTicketType());
        }
    }

    private void showWaitingList() {
        if(waitingList.size()==0){
            System.out.println("------------------------------------------");
            System.out.println("Nothing to show!!!!");
            System.out.println("------------------------------------------");
        }
        for(Passenger p : waitingList){
            System.out.println(p.getPassengerName());
        }
    }

    private void showFilledPassengerList() {
        System.out.println("PASSENGER LIST-->");
        for(int row=0;row<ticket.length;row++){
            for(int col=0;col<ticket[row].length;col++){
                Passenger p = ticket[row][col];
                if(p!=null){
                    System.out.println("Ticket Number : "+p.getTicketNumber()+"\tPassenger Name : "+p.getPassengerName()+"\tPassenger Age : "+p.getPassengerAge()+"\tTicket Cost : "+p.getTicketCost());
                }
            }
        }
    }

    private void showPassengerDetails() {
        System.out.print("PASSENGER DETAILS--> \n\nEnter Ticket Number : ");
        int ticketNumber = in.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("NAME\tAge\tMail");
        OUTER : for(int row=0;row<ticket.length;row++){
            for(int col=0;col<ticket[row].length;col++){
                Passenger p = ticket[row][col];
                if(p!=null && p.getTicketNumber()==ticketNumber){
                    System.out.println(p.getPassengerName()+"\t "+p.getPassengerAge()+"\t "+p.getPassengerMail());
                    break OUTER;
                }
            }
        }
        System.out.println("------------------------------------------");
    }

    private void cancelBookedTicket() {
        ArrayList<Passenger> list = sc.doDeSerialization();
        System.out.print("Enter Ticket Number : ");
        int ticketNumber = in.nextInt();
        int row = ticketNumber/6, col = ticketNumber%6-1;
        if(ticket[row][col].getPassengerAge()>9 && checkAdjacentAdult(row,col)){
            System.out.println("------------------------------------------");
            System.out.println("Deleted : "+ticket[row][col].getPassengerName());
            System.out.println("------------------------------------------");
            ticket[row][col] = null;
            if(waitingList.size()>0){
                Passenger p1 = waitingList.poll();
                p1.setTicketNumber(ticketNumber);
                p1.setTicketType("CT");
                ticket[row][col] = p1;
                list.add(p1);
                System.out.println("------------------------------------------");
                System.out.println("Added : "+ticket[row][col].getPassengerName());
                System.out.println("Waiting List No:1 is successfully added!");
                System.out.println("------------------------------------------");
            }
        }
        else{
            System.out.println("An adjacent child is Present, You can't cancel!!\n");
            System.out.println("You can only cancel along with the child, if ok press y/n : ");
            char choice = in.next().charAt(0);
            if(choice == 'y' ){
                int[] pos = findAdjacentChild(row,col);
                System.out.println(Arrays.toString(pos));
                ticket[pos[0]][pos[1]] = null;
                if(waitingList.size()>0){
                    Passenger p1 = waitingList.poll();
                    p1.setTicketNumber(ticketNumber);
                    p1.setTicketType("CT");
                    ticket[pos[0]][pos[1]] = p1;
                    list.add(p1);
                    System.out.println("------------------------------------------");
                    System.out.println("Added : "+ticket[row][col].getPassengerName());
                    System.out.println("Waiting List No:1 is successfully added!");
                    System.out.println("------------------------------------------");
                }
            }
        }
        sc.doSerialization(list);
    }

    private int[] findAdjacentChild(int row, int col) {
        int[] pos = {-1,-1};
        int  kidCount = 0;
        int start = 0,end = ticket.length;
        int mid = (start + end)/2;
        if(col<mid) {
            start = 0;
            end = mid;
        }
        else {
            start = mid;
            end = ticket.length;
        }
        for(int j=start;j<end;j++){
            if(j!=col && ticket[row][j].getPassengerAge()<10) {
                pos[0] = row;
                pos[1] = j;
            }
        }
        return pos;
    }

    private boolean checkAdjacentAdult(int row, int col) {
        int  kidCount = 0;
        int start = 0,end = 6;
        int mid = (start + end)/2;
        if(col<=mid) {
            start = 0;
            end = mid;
        }
        else {
            start = mid+1;
            end = ticket.length;
        }
        for(int j=start;j<end;j++){
            if(j!=col && ticket[row][j].getPassengerAge()>10)
                return true;
        }
        return false;
    }

    private void showFreeTickets() {
        System.out.println("------------------------------------------");
        System.out.println("The Free Tickets are : ");
        for(int row=0;row<ticket.length;row++){
            for(int col=0;col<ticket[row].length;col++){
                Passenger p = ticket[row][col];
                if(p==null){
                    System.out.print((row*6)+(col+1)+"\t");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }

    private void displayPassengersList() {
        System.out.println("------------------------------------------");
        System.out.println("PASSENGERS LIST -->\n");
        for(int row=0;row<ticket.length;row++){
            for(int col=0;col<ticket[row].length;col++){
                Passenger p = ticket[row][col];
                if(ticket[row][col]!=null){
                    System.out.print(p.getTicketNumber()+"\t");
                    //+"\t"+p.getPassengerName()+"\t"+p.getPassengerAge()+"\t"+p.getPassengerPhone()+"\t"+p.getTicketNumber()
                }
                else{
                    System.out.print("null\t");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");

    }

    private void bookNewTicket() {
        System.out.println("Welcome to LakeView Flight-Booking System!!!(CHENNAI -> MUMBAI)\n");
        in.nextLine();
        System.out.print("Enter Passenger Name : ");
        String name = in.nextLine();
        System.out.print("Enter Passenger Age : ");
        int age = in.nextInt();
//        System.out.print("Enter Passenger PhoneNo : ");
//        String phone = in.next();
//        System.out.print("Enter Passenger DOB : ");
//        String dob = in.next();
//        in.nextLine();
//        System.out.print("Enter Passenger Address : ");
//        String address = in.nextLine();
//        System.out.print("Enter Passenger Email-Id : ");
//        String mail = in.next();
        System.out.print("Do you need to book a window seat, if Yes press y or n : ");
        char selection = in.next().charAt(0);
        Passenger passenger = new Passenger(name,age);
        if(selection=='y' && freeTicket>0)
            bookWindowSeat(passenger);
        else if(selection!='y'){
            bookNormalSeat(passenger);
        }
        if(freeTicket<=0){
            System.out.println("Sorry No active Seats Available!, We are moving you into WaitingList");
            addToWaitingList(passenger);
        }
    }

    private void bookNormalSeat(Passenger passenger){
        boolean flag = true;
        ArrayList<Passenger> list = sc.doDeSerialization();
        for(int row=0;row<ticket.length && flag;row++){
            for(int col=1;col<ticket[row].length-1;col++){
                if(ticket[row][col]==null){
                    if(passenger.getPassengerAge()<10) {
                        System.out.println("Is a Kid");
                        if (freeKidSeats(row)) {
                            passenger.setTicketNumber((row*6)+(col+1));
                            passenger.setTicketCost(600);
                            passenger.setTicketType("CT");
                            ticket[row][col] = passenger;
                            flag = false;
                            freeTicket--;
                            list.add(passenger);
                            break;
                        }
                        else
                            continue;
                    }
                    else{
                        passenger.setTicketType("CT");
                        passenger.setTicketNumber((row*6)+(col+1));
                        passenger.setTicketCost(1300);
                        freeTicket--;
                        ticket[row][col] = passenger;
                        flag = false;
                        list.add(passenger);
                        break;
                    }
                }
            }
        }
        sc.doSerialization(list);
        if(flag == true){
            bookWindowSeat(passenger);
        }
    }
    private void bookWindowSeat(Passenger passenger) {
        boolean flag = true;
        ArrayList<Passenger> list = sc.doDeSerialization();
        OUTER : for (int row = 0; row < ticket.length ; row++) {
            for (int col = 0; col < 1; col++) {
                if (ticket[row][col] == null) {
                    if(passenger.getPassengerAge()<10) {
                        System.out.println("------------------------------------------");
                        System.out.println("Is a Kid");
                        System.out.println("------------------------------------------");
                        if (freeKidSeats(col)) {
                            passenger.setTicketNumber((row*6)+(col+1));
                            passenger.setTicketCost(700);
                            passenger.setTicketType("CT");
                            ticket[row][col] = passenger;
                            flag = false;
                            freeTicket--;
                            list.add(passenger);
                            break OUTER;
                        }
                        else
                            continue;
                    }
                    else{
                        passenger.setTicketNumber((row*6)+(col+1));
                        passenger.setTicketCost(1400);
                        passenger.setTicketType("CT");
                        ticket[row][col] = passenger;
                        flag = false;
                        list.add(passenger);
                        break OUTER;
                    }
                }
            }
            for (int col = ticket[row].length-1; col < ticket[row].length && flag; col++) {
                if (ticket[row][col] == null) {
                    if (passenger.getPassengerAge() < 10) {
                        System.out.println("------------------------------------------");
                        System.out.println("Is a Kid");
                        System.out.println("------------------------------------------");
                        if (freeKidSeats(col)) {
                            passenger.setTicketNumber((row * 6) + (col + 1));
                            passenger.setTicketCost(700);
                            passenger.setTicketType("CT");
                            ticket[row][col] = passenger;
                            flag = false;
                            freeTicket--;
                            list.add(passenger);
                            break OUTER;
                        } else
                            continue;
                    } else {
                        passenger.setTicketNumber((row*6)+(col+1));
                        passenger.setTicketCost(1400);
                        passenger.setTicketType("CT");
                        ticket[row][col] = passenger;
                        flag = false;
                        list.add(passenger);
                        break OUTER;
                    }
                }
            }
        }
        sc.doSerialization(list);
        if(flag == true)
            addToWaitingList(passenger);
    }

    private void addToWaitingList(Passenger passenger) {
        ArrayList<Passenger> list = sc.doDeSerialization();
        if(waitingList.size()<=2){
            passenger.setTicketType("WL");
            waitingList.add(passenger);
            list.add(passenger);
        }
        else{
            System.out.println("------------------------------------------");
            System.out.println("Sorry For the Inconvenience!, Tickets are all Sold out");
            System.out.println("------------------------------------------");
            return;
        }
        sc.doSerialization(list);
    }

    private boolean freeKidSeats(int col){
        int  kidCount = 0;
        int start = 0,end = ticket.length;
        int mid = (start + end)/2;
        if(col<mid) {
            start = 0;
            end = mid;
        }
        else {
            start = mid;
            end = ticket.length;
        }
        for(int i=0;i<ticket.length;i++){
            for(int j=start;j<end;j++){
                if(ticket[i][j]!=null && ticket[i][j].getPassengerAge()<10)
                    kidCount++;
            }
        }
        return kidCount<2;
    }
}