package Constructor_overloading;

class Students 
{
	public String name;
	public int age;
	public double tenth;
	public double Inter;
	public double Degree;
	public double MasterDegree;
	public Students(String n , int a){
	name = n;
	age = a;
	}
	public Students (String n, int a, double b){
	name = n;
	age = a;
	tenth = b;
	}
	public Students (String n, int a, double b, double c){
	name = n;
	age = a;
	tenth = b;
	Inter = c;
	}
	public Students (String n, int a, double b, double c, double d){
	name = n;
	age = a;
	tenth = b;
	Inter = c;
	Degree = d;
	}
	public Students (String n, int a, double b, double c, double d,double e){
	name = n;
	age = a;
	tenth = b;
	Inter = c;
	Degree = d;
	MasterDegree = e;
	}
	public void DisplayInfo(){
	System.out.println("---------*****---------");
	System.out.println("Name : "+ name);
	System.out.println("Age : "+ age);
	System.out.println("Tenth marks : "+ tenth);
	System.out.println("Inter marks : "+Inter);
	System.out.println("Degree marks : "+ Degree);
	System.out.println("Mster Degree marks : "+ MasterDegree);
	System.out.println("---------*****---------");

	}
	public static void main(String[] args) 
	{
		System.out.println("main Starts");
	Students s1 = new Students("Raja", 24);
	Students s2 = new Students ("Rani", 24, 63.0);
	Students s3 = new Students ("Dinga", 24,65.0,73.5);
	Students s4 = new Students("Dingi", 25,65.2,75.3,60.0);
	Students s5 = new Students("Nibba", 26,65.2,70.6,69.2,65.2);
	s1.DisplayInfo();
		s2.DisplayInfo();
		s3.DisplayInfo();
		s4.DisplayInfo();
		s5.DisplayInfo();
		System.out.println("main ends");
	}
}
