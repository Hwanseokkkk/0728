import java.util.Scanner; //스캐너를 만들고 ctrl + shift + o 하면 자동으로 생성해줌

public class SwitchDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신은 어느 계절을 좋아하시나요? (Spring, Summer, Fall, Winter) :  ");
		String season = sc.nextLine();
//		
//		String flowers = (season.equals("Spring")) ? "진달래, 개나리" : 
//			(season.equals("Summer")) ? "장미, 아카시아" :
//				(season.equals("Fall")) ? "코스모스, 백합" :
//					(season.equals("Winter")) ? "동백, 매화" : "그런 계절은 없습니다.";
//		System.out.println(flowers);
		
//				if(season.equals("Spring")) { //season이 알 고 있는 주소의 값이 Spring과 일치합니까? 
//			System.out.println("진달래, 개나리")
//		}else if(season.equals("Summer")) {
//			System.out.println("장미, 아카시아");
//		}else if(season.equals("Fall")) {
//			System.out.println("코스모스, 백합");
//		}else if(season.equals("Winter")) {
//			System.out.println("동백, 매화");
//		}else {
//			System.out.println("그런 계절은 존재하지 않습니다.");
//	}


	
	switch(season) {
	case "Spring" :
	case "spring" :
	case "s" :
	case "S" :
	case "봄" :
		System.out.println("진달래, 개나리"); break;
	case "Summer" :
		System.out.println("장미, 아카시아"); break;
	case "Fall" : 
		System.out.println("코스모스, 백합"); break;
	case "Winter" :
		System.out.println("동백, 매화"); break;
		default :
			System.out.println("그런 계절은 없습니다.");
	}
	}
}
