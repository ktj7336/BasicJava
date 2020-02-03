package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * << 배열 >>
		 * - int[] number = new int[5];
		 * - int[] number = new int[] {10, 20, 30, 40, 50};
		 * - int[] number = {10, 20, 30, 40, 50};
		 * 
		 * - 여러개의 변수를 묶어서 사용하는게 배열 (타입이 같아야함)
		 * - [] : 타입
		 * - 배열의 중요한 특징 : 배열을 정하면 늘리거나 줄일수 없다.
		 * 
		 */
		
		//배열은 참조형 타입이다. 
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다.
		// new : 새로운 저장공간 생성 및 주소 변환
		// int[5] : int를 저장할 수 있는 5개의 공간
		// 배열 초기화시 기본값이 저장된다.
		
		System.out.println(array);
		
		System.out.println(array[0]); // 실제 값에 접근하기 위해서는 index를 지정해줘야 한다.
		//index에는 int만 사용할 수 있다. (리터럴, 변수, 상수, 연산 등)
		//배열의 최대 크기는 int의 최대값(약20억)이다.
		
		String arrayStr = Arrays.toString(array); //배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);
		
		int [] iArray1 = new int[]{1, 2, 3}; //값의 개수로 배열의 길이가 정해진다.
		int [] iArray2 = {1, 2, 3}; //선언과 초기화를 동시에 해야한다.
		int [] iArray3;
//		iArray3 = {1, 2, 3}; // 컴파일 에러 발생
		
		array[0] = 10; //인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
//		array[5] = 50; // ArrayIndexOutOfBoundsException 발생
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요
		int [] array1 = new int[10];
		
		//모든 인덱스에 있는 값을 변경해주세요.	
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		array1[4] = 50;
		array1[5] = 60;
		array1[6] = 70;
		array1[7] = 80;
		array1[8] = 90;
		array1[9] = 100;
		
		//모든 인덱스에 있는 값을 더해주세요
		int sum = 0;
		sum += array1[0];
		sum += array1[1];
		sum += array1[2];
		sum += array1[3];
		sum += array1[4];
		sum += array1[5];
		sum += array1[6];
		sum += array1[7];
		sum += array1[8];
		sum += array1[9];
		System.out.println(sum);
		
		//index는 1씩 증가하는 규칙이 잇어 for문과 함께 사용하기 좋다
		for(int i = 0; i < array1.length; i++){
			System.out.println(array1[i]);
		}
		
		for(int i = 0; i < array1.length; i++){
			array1[i] = i + 1;
		}
		System.out.println(Arrays.toString(array1));
		
		//배열에 숫자를 저장하고 합계와 평균을 구해보자
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++){//length : 길이
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(numbers));
		
		sum = 0; //합계
		double avg = 0; // 평균
		
		for(int i = 0; i < numbers.length; i++){
			sum = sum + numbers[i];
		}
		 avg = (double)sum/numbers.length;
		 System.out.println(" 합계 " + sum + " 평균 " + avg);
		 
		 //향상된 for문
		 for(int number : numbers){ //배열에 있는 값을 차례대로 변수에 넣는다.
			 System.out.println(number);
		 }
		 
		 for(int number : numbers){
			 number = 0; //numbers의 값은 변경되지 않는다.
			 System.out.println(number);
		 }
		 System.out.println(Arrays.toString(numbers));
		 
		 
		 //배열에 저장된 숫자들중 최소값과 최대값을 찾아주세요
		 int min = numbers[0];// 최소값을 저장할 변수를 만들고 배열의 첫번째 숫자를 저장한다
		 int max = numbers[0];// 최대값을 저장할 변수를 만들고 배열의 첫번째 숫자를 저장한다
		 for(int i = 0; i < numbers.length; i++){// 배열의 길이만큼 반복하면서 
			 									 
			 if(min > numbers[i]){ // 최소값을 배열이랑 비교하는 공식
				 min = numbers[i];
			 }
			 if(max < numbers[i]){// 최대값을 배열이랑 비교해 배열의 값이 더 큰경우
				 max = numbers[i];//최대값에 배열의값을 저장한다
			 }
			 
			 }
		 System.out.println("최소값 : " + min + " 최대값 : " + max);
		 
		 
		 int[] shuffle = new int [30];
		 for(int i = 0; i < shuffle.length; i++){
			 shuffle[i] = i + 1;
		 }
		System.out.println(Arrays.toString(shuffle));
		
		
		for(int i = 0; i < shuffle.length * 10; i++){
			int random = (int)(Math.random() * shuffle.length); // 랜덤값을 생성 (랜덤 인덱스를 발생)
			int temp = shuffle[0]; // 변수를 새로 생성해서 잠깐동안 저장한다
			shuffle[0] = shuffle[random];// 랜덤값을 첫번째 인덱스 값에 넣어준다
			shuffle[random] = temp; 
		
		}
		System.out.println(Arrays.toString(shuffle));
		
		//1 ~ 10사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요
		
		int[] aa = new int [500];
		int[] bb = new int [10];
		for(int i = 0; i < 500  ; i++){
			aa[i] = (int)(Math.random());
			System.out.println(aa[i]);
			
		}
		System.out.println();
		
		for (int i = 0; i < 500; i++){
			bb[aa[i]]++;
		}
		
		for (int i = 0; i < 500; i++){
			System.out.println(i + "의 개수 : " + bb[i] );
		}
	
			 
		 }
	

		
	    
}
