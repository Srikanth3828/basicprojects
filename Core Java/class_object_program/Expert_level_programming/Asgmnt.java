package class_object_program.Expert_level_programming;

class DistanceTravel{
	public static int speed = 140;
	public int time;
	public String brandName;
	public  DistanceTravel(String bname, int t){
	time = t;
	brandName = bname;
	}
	public void CalculateDistance(){
	System.out.println("---------***--------");
	System.out.println("Speed of "+ brandName + " is "+speed + "km/hour for duration of " + time+ " hours");
	System.out.println("Distance travelled by "+brandName + " is "+ speed * time + " kms");
}
}
public class Asgmnt {
	public static void main(String[] args) {
		DistanceTravel c1 = new DistanceTravel("Audi",1);
		DistanceTravel c2 = new DistanceTravel("Ferrari", 5);
		DistanceTravel c3 = new DistanceTravel("Benz", 3);
		DistanceTravel c4 = new DistanceTravel("BMW", 6);
		c1.CalculateDistance();
		c2.CalculateDistance();
		c3.CalculateDistance();
		c4.CalculateDistance();
	}
}
