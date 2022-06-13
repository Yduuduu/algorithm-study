package Beakjoon;

import java.util.Scanner;

public class N��M_1_silver3_220503 {
	
	public static int[] arr;
	public static boolean[] visit;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
    }
	
	public static void dfs(int N, int M, int depth) {
		// ��� ���̰� M�� �������� Ž���������� ��Ҵ� �迭�� ����Ѵ�.
		if(depth == M) {
			for(int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			// ���� �ش� ���(��)�� �湮���� �ʾҴٸ�?
			if(!visit[i]) {
				visit[i] = true; // �ش� ��带 �湮���·� ����
				arr[depth] = i + 1; // �ش� ���̸� index�� �Ͽ� i + 1 �� ����
				dfs(N, M, depth + 1); // ���� �ڽ� ��� �湮�� ���� depth 1 ������Ű�鼭 ���ȣ��
				
				// �ڽĳ�� �湮�� ������ ���ƿ��� �湮��带 �湮���� ���� ���·� ����
				visit[i] = false;
			}
		}
	}
}
