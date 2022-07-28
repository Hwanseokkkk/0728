import java.util.Scanner;
public class IfDemo {
	public static void main(String[] args) {
//		int su = 59;
//		if(su >=60) { //if 괄호내에 있는 것만
//			System.out.println("합격입니다.");
//		}else {if("불합격입니다.");
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("당신은 어느 계절을 좋아하시나요? (Spring, Summer, Fall, Winter) :  ");
		String season = sc.nextLine();
		if(season.equals("Spring")) { //season이 알고 있는 주소의 값이 Spring과 일치합니까? 
			System.out.println("진달래, 개나리");
		}else if(season.equals("Summer")) {
			System.out.println("장미, 아카시아");
		}else if(season.equals("Fall")) {
			System.out.println("코스모스, 백합");
		}else if(season.equals("Winter")) {
			System.out.println("동백, 매화");
		}else {
			System.out.println("그런 계절은 존재하지 않습니다.");
		} //String은 주소값이기 떄문에 값으로만 지정하면 찾지못한다. equals을 사용해야한다.
		
		
		

	}
}
