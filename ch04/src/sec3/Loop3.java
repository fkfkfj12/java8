package sec3;

public class Loop3 {

	public static void main(String[] args) {
/*		반복변수=초기값;
		do {
			실행문장;
			증감식;
		}	while(조건식);
*/
		int a=10, tot=0;
		do	{
			tot=tot+a;
			a++;
		}	while(a<10);
		System.out.println("a="+a+"tot="+tot);
	
	}

}
