package sec3;

public class Loop8 {

	public static void main(String[] args) {
		/*	 이중 for 문을 활용하여 아래와 같은 형태의 구구단을 출력
		
		2*1=2   3*1=3  .....  9*1=9
		2*2=4   .....   ....
		....
		..
		....
		2*9=18  ...... 0*9=81
		*/
		
		int[][] a;
		for(int i=1;i<10;i++){
			for(int j=2;j<10;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		
		
	}

}
