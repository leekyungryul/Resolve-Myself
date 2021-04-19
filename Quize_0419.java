package DualArray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Quize_0419 {

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("src/input2.txt"));
		Scanner s = new Scanner(System.in);
//		이중배열의 크기를 정하기 위해서 input2.txt파일에서 첫줄에 있는 2,3을 받아서 a와 b에 넣었다. 
		int a = s.nextInt();
		int b = s.nextInt();
//		위에서 입력받은 숫자를 기준하여 배열을 생성하였다
		int [][] array = new int[a][b];
//		생성된 배열의 모든 위치에 input2.txt파일에 있는 숫자를 입력받아서 대입했다.
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = s.nextInt();
			}
		}
		int T; 
//		반복을 할 횟수를 정하는 숫자를 input2.txt파일에서 받아서 대입하였다.
		T = s.nextInt();
//		외부 반복문에는 반복하는 횟수를 기준해서 생성한다.
		for(int i = 0; i < T; i++) {
//			input2.txt파일에서 각 턴에 해당하는 숫자를 각 자리에 대입한다.
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
//			누적된 값을 저장할수있는 정수형 변수를 담았다.
			int result1 = 0;
//			생성된 배열에서 모든위치를 검색하는 이중 반복문을 생성한다.
			for(int j = 0; j < array.length; j++) {
				for(int k = 0; k< array[j].length; k++) {
//					만약 첫번째 숫자의 x축 값보다 j가 작으면 계산하지 않는다.
					if(j < x1-1 ) {
						continue;
					}
//					만약 첫번째 숫자의 y축 값보다 k가 작으면 계산하지 않는다.
					if(k < y1-1) {
						continue;
					}
//					만약 두번째 숫자의 x축 값보다 j가 크면 계산하지 않는다.
					if(j > x2-1) {
						continue;
					}
//					만약 두번째 숫자의 y축 값보다 j가 크면 계산하지 않는다.
					if(k > y2-1) {
						continue;
					}
//					그 외에는 결과변수에 누적하여 담아낸다.
					else {
						result1 = result1 + array[j][k];
					}
				}
			}
			System.out.println(result1);
		}

	}

}
