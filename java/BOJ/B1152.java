/** 
 * 
 * 백준1152번 문제 - 문자열 - 단어의 개수
 * 문제 : https://www.acmicpc.net/problem/1152
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class Main {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str = br.readLine().trim();
//		
//		//if(str.length() == 0) {
//		if(str.isEmpty())	{// 좀 더 직관적으로!
//			System.out.println(0);
//			return;
//		}
//		
//		//String[] word = str.split(" ");
//		// 여기는 연속으로 공백이 나오지는 않지만 아래와 같이 정규표현식으로 표현하면 더 안전함.
//		String[] word = str.split("\\s+");
//		
//		System.out.println(word.length);
//		
//	}
//
//}
