import java.io.Serializable;

public class Passenger implements Serializable {
    private String passengerName;
    private int passengerAge;
    private String passengerPhone;
    private String passengerDob;
    private String passengerAddress;
    private String passengerMail;
    private int ticketNumber;
    private int ticketCost;

    private String ticketType;

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public String getPassengerPhone() {
        return passengerPhone;
    }

    public void setPassengerPhone(String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }

    public String getPassengerDob() {
        return passengerDob;
    }

    public void setPassengerDob(String passengerDob) {
        this.passengerDob = passengerDob;
    }

    public String getPassengerAddress() {
        return passengerAddress;
    }

    public void setPassengerAddress(String passengerAddress) {
        this.passengerAddress = passengerAddress;
    }

    public String getPassengerMail() {
        return passengerMail;
    }

    public void setPassengerMail(String passengerMail) {
        this.passengerMail = passengerMail;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Passenger(String passengerName, int passengerAge){
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
//        this.passengerPhone = passengerPhone;
//        this.passengerDob = passengerDob;
//        this.passengerAddress = passengerAddress;
//        this.passengerMail = passengerMail;
    }


}
