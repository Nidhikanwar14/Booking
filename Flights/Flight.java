package Flights;

abstract class Flight {
    private int Flight_num;
    private String Origin;
    private String Destination;
    private int Total_seats;
    private double Ticket_Price;


    public Flight(int flight_num, String origin, String destination, int total_seats, double ticket_Price) throws IllegalArgumentException {
        try {
            if (destination.equals(origin) == true) {
                throw new IllegalArgumentException("destination and origin are the same.");
            } else {
                Flight_num = flight_num;
                Origin = origin;
                Destination = destination;
                Total_seats = total_seats;
                Ticket_Price = ticket_Price;
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
            throw new IllegalArgumentException("destination and origin are the same");
        }
    }

    int[] array = new int[300];


    public void Available_seats() throws IllegalArgumentException {
        try {
            if (Total_seats < 0) {
                throw new IllegalArgumentException("No seat available!");
            } else {
                System.out.println("Number of seats available is " + Total_seats + ".");
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
            throw new IllegalArgumentException("No seats available!");
        }
    }

    public void booked_ticket() {
        if (book_seat() == true) {
            Total_seats = Total_seats - 1;
        }
        System.out.println("After booking ticket number of seats will be : " + Total_seats);
    }


    public boolean book_seat() throws IllegalArgumentException {
        if (Total_seats > 0) {
//            Total_seats = Total_seats-1;
            return true;
        } else {
            try {
                if (Total_seats < 0) {
                    throw new IllegalArgumentException("No seat available!");
                }
            } catch (IllegalArgumentException e) {
                e.getMessage();
              throw new IllegalArgumentException("No seat available!");
            }
        }
        return false;
    }

    public int getFlight_num() {
        return Flight_num;
    }

    public void setFlight_num(int flight_num) {
        Flight_num = flight_num;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public int getTotal_seats() {
        return Total_seats;
    }

    public void setTotal_seats(int total_seats) {
        Total_seats = total_seats;
    }

    public double getTicket_Price() {
        return Ticket_Price;
    }

    public void setTicket_Price(double ticket_Price) {
        Ticket_Price = ticket_Price;
    }

}
