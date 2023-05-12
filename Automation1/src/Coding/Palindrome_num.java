package Coding;

public class Palindrome_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=125;
		int temp=n;
		int rev=0;
		while(n!=0) {
			int d=n%10;
			rev= rev*10+d;
			n=n/10;
		}
        if (rev==temp) {
        	System.out.println("Palindrome num");
        }
        else {
            	System.out.println("Not a palindrome num");
            }	
	}

}
