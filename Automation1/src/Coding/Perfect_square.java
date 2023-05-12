package Coding;

public class Perfect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=25;
		boolean b = false;
		
		for (int i = 1; i*i <=n ; i++) {
		if(i*i==n) {
	    	b=true;
			System.out.println("perfect square ");
			 }
		}
		if(b==false) {
			 System.out.println("Not a perfect square ");
		 }
	}
	}

