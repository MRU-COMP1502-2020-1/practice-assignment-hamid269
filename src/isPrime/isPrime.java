package isPrime;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello This is Prime!");

		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(10));
		System.out.println(isPrime(11));
		System.out.println(isPrime(12));
	}

	public static boolean isPrime(int number) {
	boolean prime = true;
		for (int i = 2; i < (number / 2) + 1; i++) {

			if(isDivisible(number, i)){
				prime=false;
				break;
			}

		}

		return prime;

	}

	public static boolean isDivisible(int dividend, int divisor) {
		boolean divisible = true;
		if (dividend % divisor == 0) {
			divisible=true;
			
		} else {
			divisible=false; 
		}
		return divisible; 
	}
}
