package Beakjoon;

import java.util.Arrays;
import java.util.Scanner;

// ����Ž��(Exhaustive search)
public class �ϰ�������_bronze1_220503 {
	private static int[] persons = new int[9];
	private static int sum;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < persons.length; i++) { // ������ Ű �Է�
			persons[i] = sc.nextInt();
			sum += persons[i];
		}
		
		// 9�� - ��¥ ������ 2���� Ű = 7 �������� Ű
		all : for(int i = 0; i < persons.length; i++) {
			for(int j = i + 1; j < persons.length; j++) {
				if((sum - persons[i] - persons[j]) == 100) {
					// �������� �� �� �� ���� �ε����� ��¥ ������ ���Ϳ�
					persons[i] = 0;
					persons[j] = 0;
					break all; // ��¥ ������ �߰� ��� for�� Ż��, label ���
				}
			}
		}
		
		Arrays.sort(persons); // �������� ��� �غ� ��
		
		for(int i = 2; i < persons.length; i++) { // ���� �� ���� �ε����� ��¥ ������ Ű
			System.out.println(persons[i]);
		}
	}
}
