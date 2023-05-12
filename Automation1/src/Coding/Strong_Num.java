package Coding;

public class Strong_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=140;
		int sum=0;
		int temp=n;
		while(n!=0) {
			int d=n%10;
			int fact=1;
			for (int i =1 ; i <=d; i++) {
				fact=fact*i;				
			}
			sum=sum+fact;
			n=n/10;
		}
        if(sum==temp) {
	    System.out.println("Strong num");
        }
        else {
        System.out.println("not a Strong num");
        }
}

}
