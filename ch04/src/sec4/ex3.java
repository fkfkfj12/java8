package sec4;

public class ex3 {

	public static void main(String[] args) {
		int a = 0 ;
		for(int n=0;n<100;n+=3){
			a=a+n;
			
			
		}
		System.out.println(a);
		
		int b = 0;
		int m = 0;
		while(b<=100){
			
			m+=b;
			b+=3;
		}
		System.out.println(m);
	
	int res=0;
	for(int c=0;c<=100;c++){
		if(c%3==0) res+=c;
	}
	System.out.println(res);
	
	int res1=0;
	
	for(int f=0;f<=100;f++){
		if(f%3!=0) continue;
		res1+=f;
	}
	System.out.println(res);
	}

}
