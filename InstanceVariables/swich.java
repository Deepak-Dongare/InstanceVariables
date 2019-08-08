package InstanceVariables;

import java.util.Scanner;

public class swich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=100;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter option");
		int a=sc.nextInt();
		switch(a) {
		case 1:{
			for(int i=1;i<=n;i++)
			{
				if(i%2==0) {
					System.out.println("Odd Number::="+i);
					
				}
				
			}

		} break;
		case 2:{
			for(int i=1;i<=n;i++)
			{
				if(i%2!=0) {
					System.out.println("Even Number::="+i);
					
				}
				
			}

		}break;
		case 3:{
			for(int i = 2; i<=100;){
		         int prime = 1;
		         for(int loop = 2; loop <=i; loop++) {
		            if((i % loop) == 0 && loop!=i) {
		               prime = 0;
		            }
		         }
		         if (prime != 0){
		            System.out.println(i+" is a prime number");
		            i++;
		         }
		         else
		         i ++;
		      }
		}
		break;
		}
	}

}
