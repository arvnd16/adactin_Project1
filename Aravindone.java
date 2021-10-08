package org.aravind.name;


public class Aravindone {

	public Aravindone() {
    int a=789;
    int b=456;
    System.out.println("MULIPILCATION"+":" + (a*b));
	}
	public Aravindone( String name ) {
		System.out.println("NAME"+":" +name);
	}
		
	public Aravindone(short hint) {
	short	f=78;
	short	g=88;
	System.out.println("HINT"+ (f+g));
	}
	public Aravindone(char T) {
		System.out.println("BASIC"+":"+T);
	}
	public Aravindone(long PhoneNumber) {
		System.out.println("PHONENUMBER"+":"+PhoneNumber);
	}
	public static void main(String[] args) {
		Aravindone h = new Aravindone();
		Aravindone i = new Aravindone("ARAVIND");
		Aravindone J =  new Aravindone("MARKS");
		Aravindone k = new Aravindone('T');
		Aravindone l = new Aravindone("9629480073");
	}
	
	
	
}
