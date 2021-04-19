package DualArray;

import java.awt.List;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Quize_0419_2 {

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("src/input3.txt"));
		Scanner s = new Scanner(System.in);	
		int T; 
//		반복할 횟수를 정하는 숫자를 받는다
		T = s.nextInt();
//		위의 숫자에 기준해서 반복을 실행한다.
		for(int j = 0; j < T; j++) {
//			배열의 길이를 정하는 숫자를 받는다.
			int num = s.nextInt();
//			위에서 받은 숫자에 기준해서 새로운 배열을 생성한다.
			int [] array = new int[num];
//			생성된 배열의 크기만큼 반복해서 숫자를 받는다.
			for(int i = 0; i < array.length; i++) {
				array[i] = s.nextInt();
			}
//			오름차순으로 정렬을 실행한다.
			Arrays.sort(array);
//			System.out.println(Arrays.toString(array));
//			오름차순으로 정렬된 배열에서 중복된 숫자를 제거한다.
			for(int k = 0; k <  array.length; k++) {
//				만약 1번 인덱스부터 자신의 인덱스숫자가 이전 인덱스 숫자와 동일하다면 아무것도 실행하지 않는다.
				if(k >=1 && array[k] == array[k-1])
				{
					// DO NOTHING
//				그 외에는 배열내의 값을 순차적으로 출력한다.	
				}else {
					System.out.print(array[k]+" ");
				}
			}
//			한칸 넘긴다.
			System.out.println();
	}
}
}
