import java.util.Scanner;
public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출생년도를 입력하시오 : ");
		int year = sc.nextInt();
		
		
			if(year % 12 ==0 ) {
				System.out.println("원숭이띠 입니다.");
				
			}else if(year %12 ==1){  //윤년이라면
					System.out.println("닭띠 입니다.. ");
				
			}else if(year %12 ==2){ 
				System.out.println("개띠 입니다.. ");
				
			}
			else if(year %12 ==3){  //윤년이라면
				System.out.println("돼지띠 입니다.. ");
				
			}
			else if(year %12 ==4){  //윤년이라면
				System.out.println("쥐띠 입니다.. ");
				
			}
			else if(year %12 ==5){  //윤년이라면
				System.out.println("소띠 입니다.. ");
				
			}
			else if(year %12 ==6){  //윤년이라면
				System.out.println("범띠 입니다... ");
			}
			else if(year %12 ==7){  //윤년이라면
				System.out.println("토끼띠 입니다.. ");
			}
			else if(year %12 ==8){  //윤년이라면
				System.out.println("용띠 입니다.. ");
			}
			else if(year %12 ==9){  //윤년이라면
				System.out.println("뱀띠 입니다.. ");
			}
			else if(year %12 ==10){  //윤년이라면
				System.out.println("말띠 입니다.. ");
			}
			else if(year %12 ==11){  //윤년이라면
				System.out.println("양띠 입니다.. ");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
	}
}
			
