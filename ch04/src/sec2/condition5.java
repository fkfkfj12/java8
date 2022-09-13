package sec2;

import java.util.Scanner;

public class condition5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sw = true;
		int money = 0, balance= 0;
		
		while(sw){
			System.out.print("작업할 번호(1-입금, 2-출금, 3-잔액조회, 기타-종료 [1-9]");
			int job = sc.nextInt();
			switch(job){
				case 1:
					System.out.print("입금액 :");
					money = sc.nextInt();
					balance+=money;
					break;
				case 2:
					System.out.print("출금액 :");
					money = sc.nextInt();
					balance-=money;
					break;
				case 3:
					System.out.print("잔액 : "+balance);
					break;
				default:
					System.out.print("작업이 종료 됐습니다.");
					sw = false;
						
						
			}
		}
	}

}
