package triangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1= new Triangle (3,4,5);
		System.out.println("Le triangle t1 est " + t1.getType());
		Triangle t2= new Triangle (0,0,0);
		System.out.println("Le triangle t2 est " + t2.getType());
		Triangle t3= new Triangle (2,3,7);
		System.out.println("Le triangle t3 est " + t3.getType());
	}

}
