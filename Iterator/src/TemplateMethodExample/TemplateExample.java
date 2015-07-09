package TemplateMethodExample;

public class TemplateExample {
	public static void main(String[] args){
		System.out.println("first let's try packageA");
		Trip trip = new PackageA();
		trip.performTrip();
		System.out.println("now make it packageB");
		trip = new PackageB();
		trip.performTrip();
	}
}
