package com.info;

import java.util.Scanner;

public class MelodiousString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String v="aeiou";
		String c="bcdfghjklmnpqrstvwxz";
		char vowel[]=v.toCharArray();
		char consonant[]=c.toCharArray();
		switch(n)
		{
		case 1:
			for(int i=0;i<vowel.length;i++)
			{
				System.out.println(vowel[i]);
			}
			for(int i=0;i<consonant.length;i++)
			{
				System.out.println(consonant[i]);
			}
			break;
		
		case 2:
			for(int i=0;i<vowel.length;i++)
			{
				for(int j=0;j<consonant.length;j++)
				{
					String ac=vowel[i]+""+consonant[j];
					StringBuilder str=new StringBuilder(ac);
					str.reverse();
					System.out.println(ac);
					System.out.println(str);
				}
			}
			break;
			
		case 3:
			for(int k=0;k<vowel.length;k++)
			{
			for(int i=0;i<consonant.length;i++)
			{
				for(int j=0;j<vowel.length;j++)
				{
					String ac=vowel[k]+""+consonant[i]+""+vowel[j];
					System.out.println(ac);
					if(vowel[k]!=(vowel[j]))
							{
					StringBuilder str=new StringBuilder(ac);
					str.reverse();
					
					System.out.println(str);
							}
				}
			}
			}
			for(int k=0;k<consonant.length;k++)
			{
			for(int i=0;i<vowel.length;i++)
			{
				for(int j=0;j<consonant.length;j++)
				{
					String ac=consonant[k]+""+vowel[i]+""+consonant[j];
					System.out.println(ac);
					if(consonant[k]!=(consonant[j]))
					{
					StringBuilder str=new StringBuilder(ac);
					str.reverse();
					
					System.out.println(str);
				}
			}
			}
			}
			break;
		case 4:
			for(int k=0;k<vowel.length;k++)
			{
			for(int i=0;i<consonant.length;i++)
			{
				for(int j=0;j<vowel.length;j++)
				{
					for(int l=0;l<consonant.length;l++)
					{
					String ac=vowel[k]+""+consonant[i]+""+vowel[j]+consonant[l];
					System.out.println(ac);
					}
				}
			}
			}
			for(int k=0;k<consonant.length;k++)
			{
			for(int i=0;i<vowel.length;i++)
			{
				for(int j=0;j<consonant.length;j++)
				{
					for(int l=0;l<vowel.length;l++)
					{
					String ac=consonant[k]+""+vowel[i]+""+consonant[j]+vowel[l];
					System.out.println(ac);
					}
					
			}
			}
			}
			break;
		case 5:
			
			for(int k=0;k<vowel.length;k++)
			{
			for(int i=0;i<consonant.length;i++)
			{
				for(int j=0;j<vowel.length;j++)
				{
					for(int l=0;l<consonant.length;l++)
					{
						for(int m=0;m<vowel.length;m++)
						{
					String ac=vowel[k]+""+consonant[i]+""+vowel[j]+consonant[l]+vowel[m];
					System.out.println(ac);
					}
					}
				}
			}
			}
			for(int k=0;k<consonant.length;k++)
			{
			for(int i=0;i<vowel.length;i++)
			{
				for(int j=0;j<consonant.length;j++)
				{
					for(int l=0;l<vowel.length;l++)
					{
						for(int m=0;m<consonant.length;m++)
						{
					String ac=consonant[k]+""+vowel[i]+""+consonant[j]+vowel[l]+consonant[m];
					System.out.println(ac);
						}
					}
					
			}
			}
			}
			break;
		case 6:
			for(int k=0;k<vowel.length;k++)
			{
			for(int i=0;i<consonant.length;i++)
			{
				for(int j=0;j<vowel.length;j++)
				{
					for(int l=0;l<consonant.length;l++)
					{
						for(int m=0;m<vowel.length;m++)
						{
							for(int h=0;h<consonant.length;h++)
							{
					String ac=vowel[k]+""+consonant[i]+""+vowel[j]+consonant[l]+vowel[m]+consonant[h];
					System.out.println(ac);
							}
					}
					}
				}
			}
			}
			for(int k=0;k<consonant.length;k++)
			{
			for(int i=0;i<vowel.length;i++)
			{
				for(int j=0;j<consonant.length;j++)
				{
					for(int l=0;l<vowel.length;l++)
					{
						for(int m=0;m<consonant.length;m++)
						{
							for(int h=0;h<vowel.length;h++)
							{
					String ac=consonant[k]+""+vowel[i]+""+consonant[j]+vowel[l]+consonant[m]+vowel[h];
					System.out.println(ac);
							}
						}
					}
					
			}
			}
			}
			break;
		}
	}

}
