package practice.tree.traversal;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Traversal {

	public static int[][] a = new int[50][2];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			StringTokenizer token = new StringTokenizer(sc.nextLine());
			
			int x = token.nextToken().charAt(0) - 'A';
			int y = token.nextToken().charAt(0);
			int z = token.nextToken().charAt(0);
			
			if (y == '.') {
				a[x][0] = -1;
			} else {
				a[x][0] = y - 'A';
			}
			if (z == '.') {
				a[x][1] = -1;
			} else {
				a[x][1] = z - 'A';
			}
		}
		
		preorder(0);
		System.out.println();
		
		inorder(0);
		System.out.println();
		
		postorder(0);
		System.out.println();
		
	}

	private static void postorder(int x) {
		if (x == -1) return;
		postorder(a[x][0]);
		postorder(a[x][1]);
		System.out.print((char)(x + 'A'));
	}

	private static void inorder(int x) {
		if (x == -1) return;
		inorder(a[x][0]);
		System.out.print((char)(x + 'A'));
		inorder(a[x][1]);
		
	}

	private static void preorder(int x) {
		if (x == -1) return;
		System.out.print((char)(x + 'A'));
		preorder(a[x][0]);
		preorder(a[x][1]);
	}
	
}
