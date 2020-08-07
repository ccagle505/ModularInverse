import java.util.Random;
import java.lang.Math;

/* This class is simply a collection of several useful math functions. The main method
 * finds the modular multiplicative inverse of x mod y where x and y are randomly generated 
 * prime numbers
 */

public class ModularInverse {

		public static void main(String[] args) {
			int x = randomPrimeInt();
			int y = randomPrimeInt();
			System.out.println("x: " + x);
			System.out.println("y: " + y);
			modularInverse(x, y);
		}//end main
	
		
		/**
		 * Description: Trivial implementation for finding the modular inverse.
		 * Please note that this method is slow when using large numbers.
		 * @param int x, int y
		 * @return int e
		 */
		public static int modularInverse(int x, int y) {
			int e = 1;
			while(true) {
			if((x*e)%y == 1) {
				System.out.println("Modular inverse is :" + e);
				return e;
			}
				e++;
			}
		
		}
		
		/**
		 * Description: Tests if two values are coPrime. Coprimality is true when
		 * the GCD between two numbers is equal to 1.
		 * @param int x, int y
		 * @return boolean
		 */
		public static boolean isCoprime(int x, int y) {
			if(findGCD(x,y) == 1){
				return true;
			}
			else 
				return false;
		}
		
		/**
		 * Description: Finds GCD of two numbers using Euclid's algorithm
		 * @param int x, int y
		 * @return int
		 */
		public static int findGCD(int x, int y) {
			int q = x % y;
			if(q == 0) {
				return y;
			}
			x = y;
			return findGCD(x,q);
		}
		
		/**
		 * Description: Generates random ints that are also prime
		 * @param none
		 * @return int num
		 */
		public static int randomPrimeInt() {
			
			Random rand = new Random();
			int num = rand.nextInt(100);
			
			while(!isPrime(num)) {
				num = rand.nextInt(100);
			}
			
			return num;
		}
		
		/**
		 * Description:Tests if an int is a prime number
		 * @param int num
		 * @return boolean
		 */
		public static boolean isPrime(int num) {
			if(num <= 1) {
				return false;
			}
			else if(num == 2) {
				return true;
			}
			else if(num % 2 == 0) {
				return false;
			}

			for(int i = 2; i <= Math.sqrt(num) + 1; i++) {
				if(num % i == 0) {
					return false;
				}
			}
			
			return true;
		}
	}

