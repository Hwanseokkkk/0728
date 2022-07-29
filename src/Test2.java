import java.util.Scanner; //Client 클래스를 하나 만들어 bmi계산식

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Client hs = new Client();
		
		System.out.print("Name : ");
		hs.name = sc.nextLine();
		
		System.out.print("Age : ");
		hs.age = sc.nextInt();
		sc.nextLine(); //입력 Buffer Clear (숫자 다음 글자가 오게되면 넣어줘야함)
		
		System.out.print("Gender(남성 : m / 여성 : f) : ");
		String gender = sc.nextLine(); // "m"
		hs.gender = gender.charAt(0); // 'm' 
		
		System.out.print("Weight : ");
		hs.weight = sc.nextDouble();
		
		System.out.print("Height : ");
		hs.height = sc.nextDouble();
		
		double bmi = hs.weight / ((hs.height * 0.01)*(hs.height * 0.01));
		hs.bmi = bmi; //hs의 bmi를 할당
		
		if(bmi>=35) hs.result = "고도 비만"	;
		else if(bmi >=30 &&bmi <35) hs.result = "중도비만(2단계)";
		else if(bmi >=25 &&bmi < 30) hs.result = "경고 비만(1단계)";
		else if(bmi >=23 &&bmi < 25)hs.result = "과체중";
		else if(bmi >=18.5 &&bmi <23)hs.result = "정상체중";
		else hs.result = "저체중";
		
		System.out.println("<<고객 검진 결과>>");
		System.out.println("이름 : " + hs.name);
		System.out.println("나이 : " + hs.age);
		System.out.print("성별 : ");
		System.out.println((hs.gender == 'm') ? "남성" : "여성"); //3항연산자 사용
		System.out.println("신장 : " + hs.height);
		System.out.println("체중 : " + hs.weight);
		System.out.println("BMI지수" + hs.bmi);
		System.out.println("결과 : " + hs.result);
		System.out.println("Thank You..");
		}

}
