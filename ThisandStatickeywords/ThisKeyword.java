package ThisandStatickeywords;

public class ThisKeyword {

	
		int x,y;
		
		ThisKeyword(int x, int y) {
			this.x = x;
			this.y= y;
		}
		
		void display() {
			System.out.println(x);
			System.out.println(y);
		}
		
		public static void main(String[] args) {
			ThisKeyword tKeyword= new ThisKeyword(20, 10);
			tKeyword.display();
		}



}
