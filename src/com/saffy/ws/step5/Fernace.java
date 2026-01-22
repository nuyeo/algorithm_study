package com.saffy.ws.step5;
import java.util.Scanner;

public class Fernace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a, b, n, res=0, min_diff, current_abs;
		boolean button_flag=false;
		
		a=sc.nextInt();
		b=sc.nextInt();
		n=sc.nextInt();
		
		int arr[]=new int[n];
		min_diff=Math.abs(b-a);
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			current_abs=Math.abs(b-arr[i]);
			
			if(min_diff>current_abs) {
				min_diff=current_abs;
				button_flag=true;
			}
		}
		
		if(button_flag) {
			res+=1;
		}
		res+=min_diff;
		
		
		if(res>600) {
			res=-1;
		}
			
		System.out.println(res);
	}

}
