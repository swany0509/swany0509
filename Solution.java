//package com.ssafy.view;
import java.util.Scanner;
import java.util.Vector;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1 ; t <= T ; t++) {
			System.out.println("#"+t);
			int N = sc.nextInt();
			Vector V = new Vector();
			
			for (int i = 0; i < N ; i++) {
				String al = sc.next();
				int num = sc.nextInt();
				
				for(int j = 0; j < num; j++) {
					V.add(al);
				}
				
			}
			
			for(int i = 0; i < V.size(); i++) {
				System.out.print(V.get(i));
				if (i%10==9) System.out.println();
			}
			
			
			System.out.println();
		}

	}

}
