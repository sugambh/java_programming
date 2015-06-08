package firstmaxsecondmax;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static int readInteger() throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String num=br.readLine();
		int n=Integer.parseInt(num);
		return n;
		
	}
	public static void printList(int[] x){
		for (Integer i: x){
			System.out.println(" "+i);
		}
		System.out.println("");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String num=br.readLine();
		int n=Integer.parseInt(num);
		int[] x=new int[n];
		int size=n;
		while(n>0){
			int temp=readInteger();
			x[size-n]=temp;
			n--;
		}
		//printList(x);
		int second;
		int first;
		if(x[1]>=x[0])
		{
			second=x[0];
			first=x[1];
		}
		else{
			second=x[1];
			first=x[0];
		}
		for(int i=2;i<x.length;i++){
			if(x[i]>second && x[i]<first){
				second=x[i];
			}
			else if(x[i]>first){
				second=first;
				first=x[i];
			}
		}
		System.out.println("Maximum element is "+first+"\nSecond Maximum Element is "+second);
		

	}


}
