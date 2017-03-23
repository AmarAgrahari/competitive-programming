package com.Hacker;
/*int i=35646;
double m=i/(double)1000;
System.out.println(new DecimalFormat("##.##").format(m));*/
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class CalculatingVolume {
public static double pi=Math.PI;
	public static void main(String[] args) throws Exception {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
  {
	  int b=sc.nextInt();
	  if(b>0)
	  {
  switch(b)
  {
  case 1:
	 double a1=sc.nextDouble();
	  if(a1>0)
	  {
	  double volume=a1*a1*a1;
	  System.out.println(new DecimalFormat("##.000").format(volume));
	  }
	  else
	  {
		  throw new NumberFormatException("All the values must be positive");
	  }
	  break;
	  
  case 2:
	  double l=sc.nextDouble();
	  double b1=sc.nextDouble();
	  double h=sc.nextDouble();
	  if(l>0 && b1>0 && h>0)
	  {
	  double volume=l*b1*h;
	  System.out.println(new DecimalFormat("##.000").format(volume));
	  }
	  else
	  {
		  throw new NumberFormatException("All the values must be positive");
	  }
	  break;
	  
  case 3:
	  double r=sc.nextDouble();
	  if(r>0)
	  {
	  double volume=(2*pi*r*r*r)/3;
	  System.out.println(new DecimalFormat("##.000").format(volume));
	  }
	  else
	  {
		  throw new NumberFormatException("All the values must be positive");
	  }
	  break;
	  
  case 4:
	  double r1=sc.nextDouble();
	 
	  double h1=sc.nextDouble();
	  if( r1>0 && h1>0)
	  {
	  double volume=pi*r1*r1*h1;
	  System.out.println(new DecimalFormat("##.000").format(volume));
	  }
	  else
	  {
		  throw new NumberFormatException("All the values must be positive");
	  }
	  break;
	  
  }
	  }
	  else
		  throw new NumberFormatException("All the values must be positive");  
  }
	}

}
