//vehicle Program Using inheritance with super class
import java.util.*;
class Vehicle
{
	private String Vmodel;
	private String Reg_no;
	private double Fuel_capacity;
	private double Fuel_consumption;
	private double Speed;
	
	Vehicle(String Vmodel,String Reg_no,double Fuel_capacity,double Fuel_consumption,double Speed)
	{
		this.Vmodel = Vmodel;
		this.Reg_no = Reg_no;
		this.Fuel_capacity = Fuel_capacity;
		this.Fuel_consumption = Fuel_consumption;
		this.Speed = Speed;
	}
	public void setVmodel(String Vmodel)
	{
		this.Vmodel = Vmodel;
	}
	public String getVmodel()
	{
		return Vmodel;
	}
	public void setRegno(String Reg_no)
	{
		this.Reg_no = Reg_no;
	}
	public String getRegno()
	{
		return Reg_no;
	}
	public void setFuelcapacity(double Fuel_capacity)
	{
		this.Fuel_capacity = Fuel_capacity;
	}
	public double getFuelcapacity()
	{
		return Fuel_capacity;
	}
	public void setFuleconsumption(double Fuel_consumption)
	{
		this.Fuel_consumption = Fuel_consumption;
	}
	public double getFuelconsumption()
	{
		return Fuel_consumption;
	}
	public void setSpeed(double Speed)
	{
		this.Speed = Speed;
	}
	public double getSpeed()
	{
		return Speed;
	}
	public double FuelNeeded(double distance)
	{
		return distance/Fuel_consumption;
	}
	public double DistanceCovered(double Time)
	{
	    return Time*Speed;
	}
	
	public void Display()
	{
		//System.out.println();
		System.out.println("=========================================");
		System.out.println("Model "+Vmodel);
		System.out.println("Registration NO "+Reg_no);
		System.out.println("Speed " +Speed+ "km/h");
		System.out.println("Fuel Capacity "+Fuel_capacity+ "liters");
		System.out.println("Fuel Consumption "+Fuel_consumption+ "km/l");
	}
}

class Truck extends Vehicle
{
	private double CargoWeigthLimit;
    Truck(String Vmodel,String Reg_no,double Speed,double Fuel_capacity, double Fuel_consumption,double CargoWeigthLimit )
	{
		super(Vmodel,Reg_no,Speed,Fuel_capacity,Fuel_consumption);
		this.CargoWeigthLimit = CargoWeigthLimit;
	}
	public void SetCargoWeightLimit(double CargoWeigthLimit)
	{
		this.CargoWeigthLimit = CargoWeigthLimit;
	}
	public double getCargoWeightLimit()
	{
		return CargoWeigthLimit;
	}
	public void Display()
	{
		System.out.println();
		System.out.println("Cargo Weight Limit "+CargoWeigthLimit+ "kg");
	}
}

class Bus extends Vehicle
{
	private int NumberOfPassengers;
	 
	public Bus(String Vmodel , String Reg_no, double Speed , double Fuel_capacity ,double Fuel_consumption, int NumberOfPassengers)
	{
		super(Vmodel,Reg_no,Speed,Fuel_capacity,Fuel_consumption);
		this.NumberOfPassengers = NumberOfPassengers;
	}
	public int getNumberOfPassengers()
	{
		return NumberOfPassengers;
	}
	public void Display()
	{
		super.Display();
		System.out.println("Number Of Passengers"+NumberOfPassengers);
	}
}
public class TransportApp
{
	public static void main(String x[])
	{
		Truck T = new Truck("Truck2020","T5054",70,40,20,3000);
		double result = T.getCargoWeightLimit();
		T.Display();
		
		Bus B = new Bus("Bus2015","EN1217",60,20,30,50);
		double Result = B.getNumberOfPassengers();
		B.Display();
	}
}