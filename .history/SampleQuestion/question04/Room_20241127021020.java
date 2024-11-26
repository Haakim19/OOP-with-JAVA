// represent rooms available in the hotel
package samplequestion.question04;
class Room {
    protected String roomNumber,type;
    protected double pricePernight;
    protected int nightsBooked;
    public void bookRoom(int nights){
        if (nights>0){
            nightsBooked = nights;
            System.out.println("Room booked for "+nights+" nights");
        }
        else{
        System.out.println("Invalid number of nights");
     }
}
