package sec1;

public class Oop1 {

	public static void main(String[] args) {
		//객체지향프로그래밍(Object Oriented Programming) - OOP
		//클래스와 같은 구조(를) 만든 인스턴스 -> 객체
		Member mem = new Member();
		//이때 Member은 클래스명, mem은 인스턴스(객체), new 는 객체를 만드는 명령(키워드),
		//Member() 는 생성자(Constructor)
		//인스턴스(객체)는 자바에서 1) 기본적으로 제공하는 클래스이거나  2) 사용자가 필요에 따라 만든 클래스로부터 생성될 수 있다.
		String str = new String("kim"); //1
		Member mem1 = new Member();    //2
		//또한, 클래스는 멤버필드, 멤버상수, 생성자, 메서드 등으로 묶어서 구성되는데 이를 캡슐화라 함
		//이렇게 구성된 클래스는 작성한 사람 또는 설계자만 알 수 있도록 하는 것을 정보은닉이라 하며,
		//피
	}

}