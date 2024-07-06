package com.online_auth_api.online_auth_api;

import java.util.Iterator;

public class TestingNewLearning {

	public static void main(String[] args) {
 System.out.println(isPowerOfTwo(32));;
	}
	
	
	static Boolean isPowerOfTwo(int n) {
		// TODO Auto-generated method stub
			for (int i = 1; i < n; i++) {
				if(i%2 == 0 && i*2 == n) {
                return true;
				}
			}
			return false;
	}
	
	
	static Boolean funPrime(int n) {
		// TODO Auto-generated method stub
			if(n <2)
				return false;
			for (int i = 2; i < Math.sqrt(n); i++) {
				if(n%i == 0) {
					return false;					
				}
			}
			return true;
	}
	
	static void factorialFun(int n) {
		
		int product = 1;
		for (int i = 1; i <= n; i++) {
				product = product * i;
		}
		System.out.println(product);
		// Complexity BigO = O(n) 
	}
	
	

	static int[] fibByArray(int n) {
		int[] arr = {0,1};
		for(int i=2; i< n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		// Complexity BigO = O(n) 
		return arr;
		
	}
	
	void fib(int n){
		
		int first = 0;
		int second = 1;
		if( n == 1 )
		System.out.println(first);
		
		if( n ==2 )
		System.out.println(first);
		System.out.println(second);
		for (int i = 0; i < n - 2; i++) {
			System.out.println(second + first);
			int temp = second;
			second = second + first;
			first = temp;
		}
		// Complexity BigO = O(n) 
	}
	
}
