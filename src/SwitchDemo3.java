//Switch를 이용한 랜덤문자
public class SwitchDemo3 {
	public static void main(String[] args) {
		int R = (int)(Math.random()*10+1);
		
		switch(R) {
		case 1 : 
			System.out.println("Bananas" + R); break;
		case 2 :
			System.out.println("Oranges" + R); break;
		case 3 :
			System.out.println("Peach" + R);
		case 4 :
			System.out.println("Apples" + R);
		case 5 :
		System.out.println("Plums" + R); break;
		case 6 :
			System.out.println("Pineapples" + R); break;
		case 7 :
			System.out.println(R);break;
		default :
			System.out.println("Nuts" +R); 
			//마지막에 default를 넣는게 가독성이 좋다. 중간에있어도 상관은 없지만 맨아래가 아닌 다른 곳에 있다면 반드시 break; 사용해주어야한다
		}
	}
}
