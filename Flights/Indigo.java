package Flights;

public class Indigo extends Flight implements Flight_booking {
    public Indigo(int flight_num, String origin, String destination, int total_seats, double ticket_Price) {
        super(flight_num, origin, destination, total_seats, ticket_Price);

    }
    

    public void Available_seats() throws IllegalArgumentException{
        super.Available_seats();
//        try {
//            if (this.getTotal_seats() < 0) {
//                throw new IllegalArgumentException("No seat available!");
//            }
//        } catch (IllegalArgumentException e) {
//            e.getMessage();
//            throw new IllegalArgumentException("No seat available!");
//        }
//        super.booked_ticket();
//        if(this.getTotal_seats()<0){
//            throw new IllegalArgumentException("No seats available");
//        }
    }
    public void booked_ticket(){
        super.booked_ticket();

    }



}
