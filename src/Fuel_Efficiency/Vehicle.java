package Fuel_Efficiency;

public class Vehicle {
	private static int counter = 0;
	private int id;
	private String model;
	private int mileage;
	private int fuelCapacity;
	
	public Vehicle()
	{
		counter++;
		id=counter;
	}
	public int getId()
	{
		return id;
	}
	
	public void setModel(String m)
	{
		model = m;
	}
	public String getModel()
	{
		return model;
	}
	
	public void setMileage(int mil)
	{
		mileage = mil;
	}
	public int getMileage()
	{
		return mileage;
	}
	
	public void setFuelCapacity(int fc)
	{
		fuelCapacity = fc;
	}
	public int getFuelCapacity()
	{
		return fuelCapacity;
	}
}
