package com.nbit;

public class Pattern {

	public static void main(String[] args) {
		int n = 8;
// ------------------------------------- this is loop for iNEURON--------------------------------------------------------------
		for(int i = 0; i < n; i++)
		{
			//Loop for I Alphabet
			for(int j = 0; j < n; j++)
			{
				
				if(j==(n-1)/2 && i==0 || j==(n-1)/2 && i>=2)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			//Loop for N Alphabet
			for(int j = 0; j < n; j++)
			{
				if(j==0 || j==n-1 || i==j)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//Loop for E Alphabet
			for(int j = 0; j < n; j++)
			{
				if(j==0 || i==0 || i==n-1 || i==(n-1)/2)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//Loop for U Alphabet
			for(int j = 0; j < n; j++)
			{
				if(j==0 && i!=n-1 || j==n-1 && i!=n-1 || i==n-1 && j!=0 && j!=n-1)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			//Loop for R Alphabet
			System.out.print(" ");
			for(int j = 0; j < n; j++)
			{
				if(j==0 || i==0 && j!=n-1 || j==n-1 && i<(n-1)/2 ||i==(n-1)/2 && j!=1 && j!=n-1 || i-j==(n-1)/2)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			//Loop for O Alphabet
			System.out.print(" ");
			for(int j = 0; j < n; j++)
			{
				if(j==0 && i!=n-1 && i!=0 || j==n-1 && i!=n-1 && i!=0 || i==n-1 && j!=0 && j!=n-1 || i==0 && j!=0 && j!=n-1 )
					System.out.print("@");
				else
					System.out.print(" ");
			}
			//Loop for N Alphabet
			System.out.print(" ");
			for(int j = 0; j < n; j++)
			{
				if(j==0 || j==n-1 || i==j)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");
		
// ---------------------this is loop for PRAVEEN---------------------------------------------------
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(j==0 || i==0 && j!=n-1 || i==(n-1)/2 && j!=n-1 || j==n-1 && i<(n-1)/2 && i!=0)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int j = 0; j < n; j++)
			{
				if(j==0 || i==0 && j!=n-1 || j==n-1 && i<(n-1)/2 ||i==(n-1)/2 && j!=1 && j!=n-1 || i-j==(n-1)/2)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int j = 0; j < n; j++)
			{
				if(j==0 && i!=0 || j==n-1 && i!=0 || i==0 && j!=0 && j!=n-1 || i==(n-1)/2 && j!=0 && j!=n-1 )
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int j = 0; j < n; j++)
			{
				if(i-j==(n-1)/2 || j==0 && i<=(n-1)/2 || j==n-1 && i<=(n-1)/2 || i+j==n+(n-1)/2)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int j = 0; j < n; j++)
			{
				if(j==0 || i==0 || i==n-1 || i==(n-1)/2)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int j = 0; j < n; j++)
			{
				if(j==0 || i==0 || i==n-1 || i==(n-1)/2)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int j = 0; j < n; j++)
			{
				if(j==0 || j==n-1 || i==j)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
