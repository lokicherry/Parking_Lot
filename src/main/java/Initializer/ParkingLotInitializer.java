package Initializer;

import Bean.Spot;

import java.util.ArrayList;

public class ParkingLotInitializer {
    private static ParkingLotInitializer parkingLotInitializer;

    private ParkingLotInitializer(){

    }
    public static ParkingLotInitializer initialize(int spaces){
            if(parkingLotInitializer==null){
                parkingLotInitializer=new ParkingLotInitializer(spaces);
                return parkingLotInitializer;
            }

            else{
                return parkingLotInitializer;
            }
    }

    private ParkingLotInitializer(int numberOfSpaces){
         ArrayList<Spot> spots;
        spots = new ArrayList<Spot>(numberOfSpaces);
    }
}
