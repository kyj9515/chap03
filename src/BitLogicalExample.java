
public class BitLogicalExample {

	public static void main(String[] args) {
		int num1 = 0b1111_1000;
		int num2 = 0b0001_1111;
		
		
		int result1 = num1 & num2;	// 24
		/*
		 *  1111_1000 
		 * &0001_1111 
		 * ============
		 *  0001_1000
		 */
		int result2 = num1 | num2;	//255
		/*
		 *  1111_1000 
		 * |0001_1111 
		 * ============
		 *  1111_1111
		 */
		int result3 = num1 ^ num2;	//231
		/*
		 *  1111_1000 
		 * ^0001_1111 
		 * ============
		 *  1110_0111
		 */
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
