import java.io.*;
import java.util.ArrayList;

public class Serialization {
    public void doSerialization(ArrayList<Passenger> passengerList)
    {
        try
        {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\EVALUATION -1\\PassengerList.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(passengerList);
            out.flush();
            out.close();
            fout.close();
            System.out.println("Serialization Success!");
        }
        catch(IOException e){}
    }

    public ArrayList<Passenger> doDeSerialization()
    {
        ArrayList<Passenger> list = new ArrayList<>();
        try
        {
            FileInputStream fin = new FileInputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\EVALUATION -1\\PassengerList.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            list = (ArrayList<Passenger>)in.readObject();
            in.close();
            fin.close();
            System.out.println("Deserialization Success!");
        }
        catch(IOException e){}
        catch(ClassNotFoundException e){}
        return list;
    }
}
