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
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String word = br.readLine();
//		
//		// 미리 dial을 만들어두기
//		String[] dial = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
//		int dialChar[] = new int[26];
//		
//		// 각 번호에 해당하는 알파벳 꺼내서 다이얼 값 넣기
//		for(int i = 0; i < dial.length; i++) {
//			for(char c : dial[i].toCharArray()) {
//				dialChar[c - 'A'] = i + 3;
//			}
//		}
//		
//		int result = 0;
//		for (int i = 0; i < word.length(); i++) {
//		    result += dialChar[word.charAt(i) - 'A'];
//		}
//			
//		System.out.println(result);
//	}
//
//}