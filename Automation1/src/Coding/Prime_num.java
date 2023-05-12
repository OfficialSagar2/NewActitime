package Coding;

public class Prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=7;
         int count=0;
         for (int i = 1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
         if(count==2) {
        	 System.out.println("Prime num");
         }
         else {   	 
            System.out.println("Not a Prime num");        
         }

	}

}
