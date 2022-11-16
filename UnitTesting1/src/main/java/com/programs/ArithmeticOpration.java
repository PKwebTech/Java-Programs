package com.programs;

public class ArithmeticOpration {
	
	int a,b,ans;
	
	int add(int a,int b) {
		this.a=a;
		this.b=b;
		ans=a+b;
		return ans;
	}
	int sub(int a,int b) {
		this.a=a;
		this.b=b;
		ans=a-b;
		return ans;
	}
	int mul(int a,int b) {
		this.a=a;
		this.b=b;
		ans=a*b;
		return ans;
	}
	int div(int a,int b) {
		this.a=a;
		this.b=b;
		ans=a/b;
		return ans;
	}
	int mod(int a,int b) {
		this.a=a;
		this.b=b;
		ans=a%b;
		return ans;
	}

}
