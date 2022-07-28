
public class SwitchDemo {
	public static void main(String[] args) {
		int su = 2333334;
		switch (su %2) {
		case 0 :
			System.out.println("짝수");
			break;
		case 1 :
			System.out.println("홀수");
			break;
			default :
			System.out.println("이 문장은 절대 볼 수 없습니다.");
		}
	}

}
