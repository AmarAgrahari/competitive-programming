package com.info;

import java.util.*;
import java.text.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;
import java.util.regex.*;

public class Solution_Fact {
    
   
    public BigInteger factorial(BigInteger n)
        {
        /*if(lookup[n]==-1)
            {
            if(n==0 || n==1)
                return 1;
            else
                lookup[n]= n*factorial(n-1);
        }
        return lookup[n];*/
    	if(n.equals(1))
    		return BigInteger.valueOf(1);
    	else
    	{
    		BigInteger a=(n.subtract(BigInteger.valueOf(1)));
    		return factorial(a).multiply(n);
    	}
    		
    }

    public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BigInteger n=new BigInteger(br.readLine());
        Solution_Fact s=new Solution_Fact();
        System.out.println(s.factorial(n));
    }
}