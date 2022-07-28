import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력하시오 : ");
		int year = sc.nextInt();
		
		System.out.println("월을 입력하시오 : ");
		int month = sc.nextInt();
		
		if(month == 2) {
			if(year % 400 ==0 || (year %4 ==0 && year %100 !=0)){ //윤년이라면
				System.out.println("마지막날은 29일 입니다.");
			}else {  //윤년이라면
				System.out.println("마지막날은 28일 입니다. ");
			}
								
			}else if(month !=2) { //2월이 아니라면
				if(month ==1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month==12) {
					System.out.println("마지막날은 31일입니다.");
				}else {
					System.out.println("마지막날은 30일입니다.");
				}
			}
		}
}

