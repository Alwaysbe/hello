package main;

import java.io.*;
import java.util.*;

public class main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int test_case = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test_case; i++) {
			int n = Integer.parseInt(br.readLine());
			
			HashMap<String, Integer> hm = new HashMap<>();
			
			while(n-->0) {
				st = new StringTokenizer(br.readLine()," ");
				
				st.nextToken();
				
				String kind = st.nextToken();
				
				if(hm.containsKey(kind)) {
					hm.put(kind, hm.get(kind)+1);
				}
				
				else {
					hm.put(kind, 1);
				}
			}
			
		
			int result = 1;
			
			for(int val:hm.values()) {
				result *= (val+1);
			}
			
			sb.append(result-1).append('\n');
			
		}
		
		System.out.println(sb);
	}
	

}