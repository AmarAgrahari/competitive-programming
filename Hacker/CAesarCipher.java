package com.Hacker;

import java.util.Scanner;

public class CAesarCipher {
	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String s=sc.next();
 
	  char[] ch=s.toCharArray();
  
  int k=sc.nextInt();
  for(int i=0;i<n;i++)
  {
	char c=ch[i];
	int ascii=c;
	/*System.out.println(ascii);*/
	if((ascii>=65 && ascii<=90))
	{
	int m1=65+(ascii+k-65)%26;
	System.out.print((char)m1);
    }
	else if((ascii>=97 && ascii<=122))
	{
		int m1=97+(ascii+k-97)%26;
		System.out.print((char)m1);
	}
	else
		System.out.print(ch[i]);
	}

}
}
