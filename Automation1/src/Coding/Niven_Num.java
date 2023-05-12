package Coding;

public class Niven_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=27;
        int sum=0;
        int temp=n;
        while(n!=0) {
        	int d=n%10;
        	sum=sum+d;
        	n=n/10;
        }
        if(temp%sum==0) {
        	System.out.println("Niven num");
        }
        else {
        	System.out.println("Not a niven num");
        }
	}

}
