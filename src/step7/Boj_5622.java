package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_5622 {

	public static void main(String[] args) throws IOException{
		//	다이얼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();//할머니가 외운 단어
		int sec = 0;//최소 시간
		
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
				case 'A': case 'B': case 'C':
					sec += 3;
					break;
				case 'D': case 'E': case 'F':
					sec += 4;
					break;
				case 'G': case 'H': case 'I':
					sec += 5;
					break;
				case 'J': case 'K': case 'L':
					sec += 6;
					break;
				case 'M': case 'N': case 'O':
					sec += 7;
					break;
				case 'P': case 'Q': case 'R': case 'S':
					sec += 8;
					break;
				case 'T': case 'U': case 'V':
					sec += 9;
					break;
				case 'W': case 'X': case 'Y': case 'Z':
					sec += 10;
					break;
			}
					
		}
		System.out.println(sec);
		
		br.close();

	}

}
