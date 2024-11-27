package task01;
class Room{
    private final int[][] roomCharge = {
        {3000,2000},
        {5000,6000}
    };
    public int calculateAmount(String roomType,int guestType,int numberFoDays){
        int roomTypeIndex = (roomType.equals("A")) ? 0 : (roomType.equals("B")) ? 1 : -1;
        if (roomTypeIndex == -1 || guestType < 1 || guestType >2 || numberFoDays <= 0){
            return -1;
        }
        return roomCharge[roomTypeIndex][guestType -1] * numberFoDays;
    }
}