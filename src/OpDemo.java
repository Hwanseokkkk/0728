import java.util.Scanner;
//import java.util.GregorianCalendar; //윤년을 계산하는 api util > gregoriancalendar
public class OpDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//나머지 연산자 %
		//System.out.println(5/2); //정수 나누기 정수의 값은 정수이다 = 2
		System.out.println(5%2); //나머지 값 =  1
		
		//Shift Operator
		//System.out.println(32767<<5); // = 32767 곱하기 2^5승
		//System.out.println(32767>>5); // = 32767 나누기 2^5승
		//System.out.println(-32767 >>5);
		//System.out.println(-32767 >>>5);
		//System.out.println(true && true);
		
//		int a = 5; int b = 10; int c = 15;
//		if(a>c && ++b < c) {
//			System.out.println("참");
//		}else  {
//			System.out.println("거짓");
//		}
//		System.out.println("b = " + b);
//		if(4>5) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		//System.out.println(   (4>5) ? "참"  :  "거짓");
		
		//System.out.println("정수 한개를 입력하세요 : ");
		//int su = sc.nextInt();
		
		//if(su % 2 ==0) System.out.println("짝수이군요.");
		//else System.out.println("홀수이군요.");
		
		//System.out.println(   (su %2 ==0) ? "짝수이군요" : "홀수이군요.");  //if문을 간단하게 사용할 수 있는 3항연산자 사용(? : )
		
		//System.out.println("년도를 입력하세요 : ");
		//int year = sc.nextInt();
		
		//System.out.println(    (year %400 ==0)||(year %4 == 00 && year %100 !=0)  ? "당신이 입력하신" + year + "년은 윤년이군요." : "당신이 입력하신" + year + "년은 평년이군요.");
		// || 또는(or) && 그리고(and) == 같으면  != 같지않으면
			
		//GregorianCalendar gc = new GregorianCalendar();
		//boolean flag = gc.isLeapYear(year);
		//System.out.println("당신이 입력하신 " + year + "년도는 " + ((flag) ? "윤년입니다." : "평년입니다."));
		
		//int age = 26; //할당 연산자
		//age++; // age = age +1
		//age = age +5;
		//age +=5; //할당연산자(복합연산자) 5씩 더한다.
		
		//int a = 5, b = 10, c = 15; // (,)콤마라는 나열연산자를 통해서 한줄로 간단히 표현 할 수 있다.
		
		//double year = (true) ? 2022 : 3.14; //정수와 실수를 비교하는 식이기에 int가아닌 double로 받아야한다.
		
		
		
	}

}
