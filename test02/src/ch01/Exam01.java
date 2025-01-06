package ch01;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int times=1; times<=9; time++) {
			for(int dan=2; times)
		}
		
		
		for(int i=-10; i<=10; i++) {
			for(int j=-10; j<=10; j++) {
				if(Math.abs(j)<=10-Math.abs(i))
					System.out.println("*");
				else
					System.out.println("");
			}
			System.out.println();
		}
		System.out.println();
	
		
		for(int i=10; i>=5; i--) {
			for(int j=i; j>-5; j--) {
				System.out.println(j+"\t");
			}
			System.out.println();
		}
	}

}
