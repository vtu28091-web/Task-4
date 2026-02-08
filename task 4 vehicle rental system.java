class Vehicle { 
int vehicleId; 
String modelName; 
double baseRent; 
Vehicle(int vehicleId, String modelName, double baseRent) { 
this.vehicleId = vehicleId; 
this.modelName = modelName; 
this.baseRent = baseRent; 
} 
void display() { 
System.out.println("Vehicle ID   : " + vehicleId); 
System.out.println("Model Name   : " + modelName); 
System.out.println("Base Rent    : " + baseRent); 
} 
} 
class Car extends Vehicle { 
Car(int vehicleId, String modelName, double baseRent) { 
super(vehicleId, modelName, baseRent); 
} 
double calculateRent() { 
return baseRent + 500; 
} 
} 
class Bike extends Vehicle { 
Bike(int vehicleId, String modelName, double baseRent) { 
super(vehicleId, modelName, baseRent); 
} 
double calculateRent() { 
return baseRent + 200; 
} 
} 
public class VehicleRental { 
public static void main(String[] args) { 
Car car = new Car(101, "Honda City", 2000); 
System.out.println("---- Car Details ----"); 
car.display(); 
System.out.println("Total Rent   : " + car.calculateRent()); 
System.out.println(); 
Bike bike = new Bike(201, "Yamaha R15", 800); 
System.out.println("---- Bike Details ----"); 
bike.display(); 
System.out.println("Total Rent   : " + bike.calculateRent()); 
} 
} 
