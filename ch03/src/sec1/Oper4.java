package sec1;

public class Oper4 {

	public static void main(String[] args) {
		int a=200, b=100,c=20,d=10;
		//비교 연산자 (== , != , > , >= , < , <=) -> true 또는 false로 결과가 산출됨
		System.out.println("a==b => "+(a==b));  // f
		System.out.println("a!=b =>"+(a!=b));   // t
		System.out.println("a>b =: "+(a>b));   // t
		System.out.println("a>=b =: "+(a>=b));   // t
		System.out.println("a<b =: "+(a<b));   // f
		System.out.println("a<=b =: "+(a<=b));   // f
		System.out.println("a 문자열이 맞나? =>"+a instanceof String);
		//논리 연산자
		System.out.println("a>b && c>d => "+(a>b && c>d));
		System.out.println("a<b || c<d => "+(a<b || c<d));
		System.out.println("!(a>b) => "+(!(a>b)));
		//삼항 연산 => 조건 ? 참일때식 : 거짓일때식
		System.out.println(a>=b ? "크거나 같다" : "작다");
	}

}
