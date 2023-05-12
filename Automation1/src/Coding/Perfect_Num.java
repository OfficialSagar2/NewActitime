package Coding;

public class Perfect_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int sum=0;
		for (int i = 1; i < n; i++) {
			if(n%i==0) {
			 sum=sum+i;
			}			
		}
		if(sum==n) {
		System.out.println("Perfect num");
		}
		else {
		System.out.println("Not a perfect num");
		}
	}

}
