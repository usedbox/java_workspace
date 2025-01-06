package ch04_2;

public class SwitchTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=85;
		char grade;
		
		switch(score/10) {
		case 10,9:grade='A'; break;
		case 8:grade='B'; break;
		case 7:grade='C'; break;
		default:grade='F';
		}
		System.out.println(grade);
		
		if(score>=90) {
			grade='A';
		}else if(score>=80) {
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else {
			grade='F';
		}
		System.out.println(grade);

	}

}
