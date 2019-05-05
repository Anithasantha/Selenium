package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Vechile{
	String color;
	int speed,seat,wheel,doors;
	boolean status;
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}	
	
void displayDetails(){
	System.out.println("Color:"+color);
	System.out.println("Maximum Speed:"+speed);
	System.out.println("Number of Seats:"+seat);
	System.out.println("Number of Wheels:"+wheel);
	
		
	}
	
}
class Car extends Vechile{
	void displayDetails(){
		System.out.println("Car Details");
		super.displayDetails();
		System.out.println("Enter number of doors:"+doors);
		System.out.println("Ac:"+status);
	}
}
class Bike extends Vechile{
void displayDetails(){
	System.out.println("Bike Details");
	super.displayDetails();
	System.out.println("Disk Break:"+status);
	}
}
public class VechileDetails {
	static String color;
	static int speed,seat,wheel,doors;
	static boolean status;
	static int ch=0;
	
	static BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
	static void getDetails(){
		try {
			System.out.println("\nEnter the color:");
			color=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the  maximum speed");
		try {
			speed=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the number of seats");
		try {
			seat=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the number of wheels");
		try {
			wheel=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(ch==1) {
			System.out.println("Enter the number of doors");
			try {
				doors=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		if(ch==1) {
			System.out.println("Enter the status of AC(true/false):");
			try {
				status=Boolean.parseBoolean(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
		System.out.println("Enter the status of diskbreak(true/false):");
		try {
			status=Boolean.parseBoolean(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}
	public static void main(String[] args) {
		Vechile vechileType =new Vechile();
		Scanner sc=new Scanner(System.in);
		do {
			
			System.out.println("1)Car");
			System.out.println("2)Bike");
			System.out.println("Enter the option:");
			
			ch=sc.nextInt();
			
			if(ch>3)
				System.out.println("Invalid Option");
			else {
				System.out.print("Enter the details of ");
				if(ch==1)
					System.out.print("car");
				else if(ch==2)
					System.out.println("bike");
				getDetails();
				switch(ch) {
					case 1: 
						vechileType=new Car();
						break;
					case 2:
						vechileType=new Bike();
						break;
				}
				vechileType.setColor(color);
				vechileType.setSpeed(speed);
				vechileType.setWheel(wheel);
				vechileType.setSeat(seat);
				vechileType.setDoors(doors);
				vechileType.setStatus(status);
				vechileType.displayDetails();
			}
		}while(ch<3);
	}
}
