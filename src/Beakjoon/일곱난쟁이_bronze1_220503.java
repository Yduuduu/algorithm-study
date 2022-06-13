package Beakjoon;

import java.util.Arrays;
import java.util.Scanner;

// 완전탐색(Exhaustive search)
public class 일곱난쟁이_bronze1_220503 {
	private static int[] persons = new int[9];
	private static int sum;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < persons.length; i++) { // 난쟁이 키 입력
			persons[i] = sc.nextInt();
			sum += persons[i];
		}
		
		// 9명 - 가짜 난쟁이 2명의 키 = 7 난쟁이의 키
		all : for(int i = 0; i < persons.length; i++) {
			for(int j = i + 1; j < persons.length; j++) {
				if((sum - persons[i] - persons[j]) == 100) {
					// 오름차순 시 앞 두 개의 인덱스는 가짜 난쟁이 필터용
					persons[i] = 0;
					persons[j] = 0;
					break all; // 가짜 난쟁이 발견 즉시 for문 탈출, label 사용
				}
			}
		}
		
		Arrays.sort(persons); // 오름차순 출력 준비 문
		
		for(int i = 2; i < persons.length; i++) { // 앞의 두 개의 인덱스는 가짜 난쟁이 키
			System.out.println(persons[i]);
		}
	}
}
