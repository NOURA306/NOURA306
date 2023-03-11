package week2;

public class point {
	int x;
	 int y;
		public double distanceFromOrigin() {
			return Math .sqrt(x*x + y*y);
			
		}
		
		public void translate(int dx ,int dy) {
			x +=dx;
			y +=dy;
		}


		}


