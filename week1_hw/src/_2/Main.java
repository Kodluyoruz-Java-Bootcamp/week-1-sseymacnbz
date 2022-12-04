package _2;

public class Main {
	
	public static String whiteSpace(int sp) {
		String s = "";
		for(int i = 0; i<sp; i++) {
			s+=" ";
		}
		
		return s;
	}
	
	public static void leftTriangle(int num) {
		
		for(int i=1; i<=num;i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void rightTriangle(int num) {
		String s = "";
		for(int i=num; i>=1; i--) {
			s = whiteSpace(i-1);
			for(int j=0; j<num-i+1; j++) {
				s += "*";  
			}
			System.out.println(s);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		rightTriangle(6);
		leftTriangle(4);

	}

}
