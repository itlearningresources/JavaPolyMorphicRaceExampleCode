import  java.util.*;
//  **************************************************************************
//  **  Race
//  **************************************************************************
public class Race {

    //---------------------------------------------+
    // Static Utility Method
    //---------------------------------------------+
    private static int irand(int min, int max) { return (new Random()).nextInt(max + 1 - min) + min; }
    private static float frand(float min, float max) { return  min + (new Random()).nextFloat() * (max - min);}
    private static String  leader(RaceCar[] cars, RaceCar car) {
        boolean b = true;
        for (int i=0;i<cars.length;i++) 
            if (car.getDistance() < cars[i].getDistance())
                b = false;
        return b ? "LEAD" : "    ";
    }
    //---------------------------------------------+
    // Main Method
    //---------------------------------------------+
    public static void main(String[] args) {
        String sz;
        final int MAXCARS = 12;
        final int MOVES = 5;

        RaceCar[] cars = new RaceCar[MAXCARS];

        for (int i=0;i<cars.length;i++) {
            int n = irand(1,4);
            if ( n == 1) cars[i] = new Ferrari();
            if ( n == 2) cars[i] = new Ford();
            if ( n == 3) cars[i] = new Chevy();
            if ( n == 4) cars[i] = new Toyota();
        }

        for (int l=0;l<MOVES;l++) {
            System.out.println("\nMove:");
            System.out.println(cars[0].toStringHeader());
            // System.out.print("\033[H\033[2J");
            // System.out.flush();
            for (int i=0;i<cars.length;i++) {
                cars[i].move();  // A polymorphic call
                System.out.print(cars[i]);
                System.out.print("  " + leader(cars, cars[i]));
                System.out.println("  " + cars[i].history.toString());
            } 
        } 


    }
} 
