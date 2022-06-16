package week1.day2;

public class Car {

	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println("if you need to stop");
	obj.applyBreak();
	System.out.println("if u want to start car");
	obj.applyAccelerator();
	System.out.println("if u want to go fast");
	obj.applyGear();
	System.out.println("if u want to increase chillness");
	obj.switchOnAc();
	System.out.println("if u want to adjust space");
	obj.moveSeater();
	
	}
	
public void applyBreak()
	{
		System.out.println("break applied");
	}
private void applyAccelerator()
{
	System.out.println("Car started");
}
 void applyGear()
{
	System.out.println("Car started");
}
void switchOnAc()
{
System.out.println("Ac on");
}
private void moveSeater()
{
	System.out.println("Space adjusted");	
}



}
