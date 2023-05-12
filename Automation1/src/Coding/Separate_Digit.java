package Coding;

public class Separate_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=458;
		while(n!=0) {
			int d=n%10;
			System.out.println(d);
			n=n/10;
		}

	}

}
