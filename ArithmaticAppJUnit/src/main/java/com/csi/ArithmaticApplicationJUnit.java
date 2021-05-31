package com.csi;

public class ArithmaticApplicationJUnit {
	public static void main(String[] args) {
		System.out.println("\n Addtion Result is :" + add(10, 30));
		System.out.println("\n  Substraction Result is :" + sub(10, 30));
		System.out.println("\n Multiplicatio Result is:" + multi(10, 30));
		System.out.println("\n Division Result  is:" + div(10, 30));

	}

	public static int add(int s1, int s2) {
		return s1 + s2;
	}

	public static int sub(int s1, int s2) {
		return s1 - s2;
	}

	public static int multi(int s1, int s2) {
		return s1 * s2;
	}

	public static int div(int s1, int s2) {
		return s1 * s2;
	}
}
