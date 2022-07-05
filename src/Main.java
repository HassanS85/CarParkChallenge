import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*
   Car Park Tech Test
Design a parking lot using object-oriented principles

Goals:

Your solution should be in Java.
Assumptions:

The parking lot can hold motorcycles, cars and vans
The parking lot has motorcycle spots, car spots and large spots
A motorcycle can park in a motorcycle spot OR a regular spot
A car can park in a regular spot
A van can park, but it will take up 3 regular spots
These are just a few assumptions. Feel free to ask your interviewer about more assumptions as needed
Here are a few methods that you should be able to run:

Tell us how many spots are remaining
Tell us how many total spots are in the parking lot
Tell us when the parking lot is full
Tell us when the parking lot is empty
Tell us when certain spots are full e.g. when all motorcycle spots are taken
Tell us how many spots vans are taking up
Suggestions for Classes
At a very minimum we expect to see:

Vehicle Class
Motorcycle Class
Car Class
Van Class
Car Park Class
A method to populate the car park
Inheritance
Polymorphism
Encapsulation
Abstraction
A solution

Run the code using Main class.
After each parking attempt general stats about car park are logged.
At moment no cars leave the car park!

    */

        Motorcycle motorcycle = new Motorcycle("Motorcycle",1);
        Car car = new Car("Car", 2);
        Van van = new Van("Van", 3);

        ParkingLot parking = new ParkingLot(100, 50) {
            @Override
            public int remainingSpaces() {
                return 0;
            }

            @Override
            public boolean isFull() {
                return false;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean isCompactFull() {
                return false;
            }

            @Override
            public boolean isRegularFull() {
                return false;
            }

            @Override
            public void addVehicle(Vehicle vehicle) {

            }

            @Override
            public void removeVehicle(Vehicle vehicle) {

            }

            @Override
            public ArrayList<String> spacesByVehicle(Vehicle vehicle) {
                return null;
            }
        };


    }
}