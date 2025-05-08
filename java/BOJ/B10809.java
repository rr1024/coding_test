/** 
 * 
 * 백준10809번 문제 - 문자열 - 알파벳 찾기
 * 문제 : https://www.acmicpc.net/problem/10809
 * 
 * */
//
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
//		String str = br.readLine();
//		//int len = (int)'z' - (int)'a' + 1;	// 알파벳의 위치를 담은 배열의 길이
//		//int[] arr = java.util.stream.IntStream.generate(() -> -1)
//		//		.limit(len).toArray(); // 알파벳 위치를 담을 배열
//		int[] arr = new int[26];
//		Arrays.fill(arr, -1) // 그냥 Arrays fill 써도 가능함.
//
//		for(int i = 0; i < str.length(); i++) {
//			//int idx = (int)str.charAt(i) - (int)'a'; // 해당 알파벳의 위치 찾기
//			int idx = str.charAt(i) - 'a'; // 캐스팅 생략 가능
//			
//			if(arr[idx] != -1) continue;
//			
//			arr[idx] = i;
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.printf("%d ", arr[i]);
//		}
//	}
//
//}
