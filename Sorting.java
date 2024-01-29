package java8;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {

		try {

			String in="readable content of a page when looking at its layout";

			String inArr[]=in.split(" ");

			Arrays.sort(inArr, (a, b)->Integer.compare(b.length(),a.length()));

			System.out.println( Arrays.toString(inArr));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
