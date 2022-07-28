
public class RandomDemo {
	 public static void main(String[] args) {
		 int R = (int)(Math.random()*6+1); 
		 //Math.ramdom이라는게 0.0보다 크고 1.0보다 낮은수를 랜덤으로 산출하는 식이므로  강제형변수 (int)를 대입한다.
		 //주사위의 최소값 1을 더하고 최대값 6을 곱한다.
		 System.out.println(R);
	 }
}

