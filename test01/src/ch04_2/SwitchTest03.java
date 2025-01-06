package ch04_2;

public class SwitchTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string season="";
		int month=7;
		
		switch(month) {
		case 3,4,5:season='봄'; break;
		case 6,7,8:season='여'; break;
		case 9,10,11:season='가'; break;
		case 12,1,2:season='겨'; break;
		default:
			System.out.println("없는 달입니다");
		}
		System.out.println(season);
	}

}
