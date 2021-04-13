
import java.util.Scanner;

public class Circle {
	 private double radius;
	 
	 public void setRadius(double r)
	 {
		 if(r<0) this.radius=0;
		 else this.radius=r;
	 }
	 public double getRadius()
	 {
		 return this.radius;
	 }
	 
	 public      Circle()
	 {
		 this.radius=8;
	 }
	 public      Circle(double radius)
	 {
		 setRadius(radius);
	 }
	 
	
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter radius");
		this.radius=kb.nextDouble();
		
	}
	public double area()
	{
		return this.radius*this.radius*Math.PI;
	}
	public double perimete()
	{
		return this.radius*2*Math.PI;
	}
	public void output()
	{
		System.out.println("area"+this.area());
		System.out.println("perimete"+this.perimete());
	}

	public static void main(String[] args) {
		Circle rec1=new Circle();
		System.out.println(rec1.area());
		System.out.println(rec1.perimete());
		
		
		Circle rec2=new Circle(4);
		System.out.println(rec2.area());
		System.out.println(rec2.perimete());
		

	}

}