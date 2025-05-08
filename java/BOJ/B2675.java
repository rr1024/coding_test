/** 
 * 
 * 백준2675번 문제 - 문자열 - 문자열 반복
 * 문제 : https://www.acmicpc.net/problem/2675
 * 
 * */

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class Main {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		for(int i = 0; i < n; i++) {
//			String input = br.readLine();
//			String[] part = input.split(" ");
//			
//			int t = Integer.parseInt(part[0]);
//			String s = part[1];
//			
//			// 이중 for문 하나씩 돌리면서 주어진 갯수만큼 돌리기
//			//for(int j = 0; j < s.length(); j++) {
//			//	for(int k = 0; k < t; k++) {
//			//		System.out.print(s.charAt(j));
//			//	}
//			//}
//			
//			// StringBuilder랑 repeat 사용하기 Java11 이상
//			StringBuilder sb = new StringBuilder();
//			
//			for(int j = 0; j < s.length(); j++) {
//				char c = s.charAt(j);
//				sb.append(String.valueOf(c).repeat(t));
//			}
//			
//			System.out.println(sb);
//		}
//		
//	}
//
//}
