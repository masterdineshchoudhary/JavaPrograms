package number;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
	public static void main(String[] args) {
		// using random() method
		// It generates only double type random number greater than or equal to 0.0 and
		// less than 1.0
		System.out.println(Math.random());
		// generate random number between a specified range.
		int max = 400, min = 200;
		System.out.println(Math.random() * (max - min + 1) + min);

		// using Random class (java.util)
		// It generate a random number of any data type, such as integer, float, double,
		// Boolean, long.
		Random ran = new Random();
		System.out.println(ran.nextInt()); // range 0 to bound -1
		System.out.println(ran.nextInt(1));
		System.out.println(ran.nextInt(50)); // range 0 to 49
		System.out.println(ran.nextInt(500));
		
		System.out.println(ran.nextDouble()); // / 0.0 - 1.0
		System.out.println(ran.nextFloat()); // 0.0 - 1.0
		System.out.println(ran.nextLong());
		System.out.println(ran.nextBoolean()); // true or false
	
		// Using the ThreadLocalRandom Class (java.util.concurrent)
		// It is initialized with an internally generated seed, the same as the random
		// generator of the Math class. It cannot be modified.
		System.out.println(ThreadLocalRandom.current().nextInt()); // default
		System.out.println(ThreadLocalRandom.current().nextInt(1000)); // (int bound)
		System.out.println(ThreadLocalRandom.current().nextInt(50, 100)); // (int origin, int bound)
		System.out.println(ThreadLocalRandom.current().nextFloat());
		System.out.println(ThreadLocalRandom.current().nextDouble());
		System.out.println(ThreadLocalRandom.current().nextLong());
	}
}
