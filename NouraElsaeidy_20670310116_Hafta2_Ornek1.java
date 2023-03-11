package week2;

public class NouraElsaeidy_20670310116_Hafta2_Ornek1 {

	public static void main(String[] args) {
		point p1 = new point ();
		p1.x =4;
		p1.y =3;
		
		point p2= new point();
		p2.x =3;
		p2.y =10;
		System.out.println("point1= (" + p1.x+","+p1.y+")");
		double dist = Math .sqrt(p1 .x * p1.x + p1.y * p1.y);
		System.out.println("distance from origin ="+dist);
		
		System.out.println("point2= (" + p2.x+","+p2.y+")");
		double dist2 = Math .sqrt(p2 .x * p2.x + p2.y * p2.y);
		System.out.println("distance from origin ="+dist2);
		
		/*p1.x +=10;
		p1.y +=6;*/
		p2.x +=2;
		p2.y +=2;

		//System.out.println("point1= (" + p1.x+","+p1.y+")");
		System.out.println("point2= (" + p2.x+","+p2.y+")");
		
	}

		
	}


