// represent rooms available in the hotel
package samplequestion.question04;
class Room {
    protected String roomNumber,type;
    protected double pricePernight;
    protected int nightsBooked;
    protected boolean isAvilaible;
    public void bookRoom(int nights){
        if (nights>0){
            nightsBooked = nights;
            System.out.println("Room booked for "+nights+" nights");
            isAvilaible = false;
        }
        else{
        System.out.println("Invalid number of nights");
        }
    }
    public void cancelBooking(){
        nightsBooked = 0;
        System.out.println("Booking cancelled");
        isAvilaible = true;
    }
    public void display(){
        System.out.println("Room Number: "+roomNumber);
        System.out.println("Type: "+type);
        System.out.println("Price per night: "+pricePernight);
        System.out.println("Nights booked: "+nightsBooked);
        System.out.println("Is available: "+isAvilaible);
    }
}