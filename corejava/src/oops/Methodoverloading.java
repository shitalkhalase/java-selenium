package oops;

public class Methodoverloading {

	int data( int x , int y) {
		
		return x*y;
		
	}
	Double data(Double x, Double y, Double z) {
		
		return x+y+z;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Methodoverloading sc= new Methodoverloading();
		System.out.println(sc.data(10, 20));
		System.out.println(sc.data(12.30, 20.17, 9.21));
	}

}
