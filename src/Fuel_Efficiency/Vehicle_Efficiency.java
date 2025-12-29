/*8. Vehicle Fuel Efficiency
Task:
 Create a Vehicle class with fields: model, mileage, and fuelCapacity.
 In the main method:
Create a Vehicle object.
Calculate how far the vehicle can travel (mileage * fuelCapacity) and print the result.
*/

package Fuel_Efficiency;

import java.util.*;
public class Vehicle_Efficiency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		Vehicle v[] = new Vehicle[size];
		
		int Id = 0, Mileage = 0, FuelCapacity = 0;
		String Model = " ";
		
		for(int i = 0; i < v.length; i++)
		{
			v[i] = new Vehicle();
			
			System.out.println("Enter the Model Name: ");
			Model = sc.next();
			
			System.out.println("Enter the Mileage: ");
			Mileage = sc.nextInt();
			
			System.out.println("Enter the Fuel Capacity: ");
			FuelCapacity = sc.nextInt();
			
			v[i].setModel(Model);
			v[i].setMileage(Mileage);
			v[i].setFuelCapacity(FuelCapacity);
		}
		System.out.printf("%-5s %-15s %-15s %-10s\n", "Id", "Model", "Mileage", "Fuel Capacity");

		for(int i = 0; i < v.length; i++)
		{
			System.out.printf("%-5s %-15s %-15s %-10s\n", v[i].getId(), v[i].getModel(), v[i].getMileage(), v[i].getFuelCapacity());
			
			int VehTravel = v[i].getMileage() * v[i].getFuelCapacity();
			System.out.println("Vehicle Travel by " + VehTravel + " km");
		}
	}
}
