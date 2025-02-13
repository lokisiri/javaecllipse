package Practise;

import java.util.Arrays;

import java.util.Collections;

public class Descendingorder {
	
	public static void main(String []args)
	{
		Integer a[]= {4,5,6,-99,66,78,999};
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(a));
	}

}
