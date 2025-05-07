import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int n = sc.nextInt();
		int n = Integer.parseInt(br.readLine());
		//sc.nextLine();
		
		String s = br.readLine();
		int sum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		System.out.println(sum);
		
		
	}
}