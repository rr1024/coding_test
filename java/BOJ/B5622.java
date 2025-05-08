/** 
 * 
 * 백준5622번 문제 - 문자열 - 다이얼
 * 문제 : https://www.acmicpc.net/problem/5622
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
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int call[] = new int[26];
//		int count = 0;
//		int second = 3;
//		
//		call[25] = 10;
//		
//		for(int i = 0; i < 25; i++) {
//			call[i] = second;
//			
//			count++;
//			if(count >= 3 && i != ('R' - 'A')) {
//				second++;
//				count = 0;
//			}
//		}
//		
//		String word = br.readLine();
//		int result = 0;
//		
//		for(int i = 0; i < word.length(); i++) {
//			int idx = (int)word.charAt(i) - 'A';
//			result += call[idx];
//		}
//		
//		System.out.println(result);
//		
//	}
//
//}
