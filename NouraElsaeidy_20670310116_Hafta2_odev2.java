package week2;

public class NouraElsaeidy_20670310116_Hafta2_odev2 {

	public static void main(String[] args) {
	point p1=new point();
	p1.x=3;
	p1.y=4;
	System.out.println(p1.x+" ,"+p1.y);
	double dist=p1.distanceFromOrigin();
	System.out.println("orjine olan uzaklik="+dist);
	
	p1.translate(2, 8);
System.out.println("orijine uzaklik="+p1.distanceFromOrigin());
	}

}
