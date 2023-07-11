
public class ArithmeticExample {

	public static void main(String[] args) {
		long current = System.currentTimeMillis()/1000;	//초로 변환
		/*
		 * epoch time(unix tume) : 1970/01/01 00:00:00 ~ 경과시간
		 * 
		 */
		
		long hour = current/60/60%24 + 9;
		long minute = current/60%60;
		long second = current%60;
		
		
		System.out.println(second);
		
		System.out.println(current);
		
		System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
	}

}
