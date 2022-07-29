//대문자 +32 는 소문자
//홀수줄은 대문자 , 짝수줄은 소문자
public class Test1 {
	public static void main(String[] args) {
		int count = 0;
		int line = 1;
		for(int i=65; i<=90; i++) {
			if(line %2 ==0)System.out.printf("%c\t",i +32 );
			else System.out.printf("%c\t", i);
			count++;
			line++;
			if(count %5 ==0)System.out.println();
		}
	}
}
