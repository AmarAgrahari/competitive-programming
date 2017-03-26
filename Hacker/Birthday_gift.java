package com.info;

import java.util.Scanner;

public class Birthday_gift {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int test_cases=sc.nextInt();
   for(int i=0;i<test_cases;i++)
   {
	   int sum=0;
	   int B=sc.nextInt();
	   int W=sc.nextInt();
	   int black_price=sc.nextInt();
	   int white_price=sc.nextInt();
	   int conversion=sc.nextInt();
	   if((black_price+conversion)<white_price)
	   {
		   int black_to_white=black_price+conversion;
		   sum=(B*black_price)+(W*black_to_white);
	   }
	   else if((white_price+conversion)<black_price)
	   {
		   int white_to_black=white_price+conversion;
		   sum=(B*white_to_black)+(W*white_price);
	   }
	   else
	   {
		   sum=(B*black_price)+(W*white_price);
	   }
		   System.out.println(sum);
   }
	}

}
