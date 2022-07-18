package Main;
import Exception.*;
import Flights.Indigo;

import java.lang.IllegalArgumentException;

public class Main {
    public static void main(String[] args)  {
        Indigo passenger_1 = new Indigo(123456, "Indore" , "Dehli",300,2000);
        passenger_1.Available_seats();
        passenger_1.booked_ticket();
        try{
        Indigo passenger_2 = new Indigo(123356, "Indore" , "Mumbai",-2,2000);
        passenger_2.Available_seats();
        passenger_2.booked_ticket();}
        catch (IllegalArgumentException e){
            e.getMessage();
            System.out.println( e.getMessage());
        }

    }

}
