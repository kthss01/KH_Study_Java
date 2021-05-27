package practice.tree.dfsbfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DfsBfs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();

		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			a.add(new ArrayList<Integer>());
		}
		boolean[] c = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			a.get(u).add(v);
			a.get(v).add(u);
		}

		for (int i = 0; i < N; i++) {
			Collections.sort(a.get(i));
		}

		sc.close();

		dfs(a, c, V);
//		dfs2(a, c, V);
		Arrays.fill(c, false);
		System.out.println();
		bfs(a, c, V);
	}

	private static void bfs(ArrayList<ArrayList<Integer>> g, boolean[] c, int x) {
		Queue<Integer> q = new LinkedList<>();
		c[x] = true;
		q.add(x);

		while (!q.isEmpty()) {
			x = q.poll();
			System.out.println(x + " ");
			for (int y : g.get(x)) {
				if (c[y] == false) {
					c[y] = true;
					q.add(y);
				}
			}
		}
	}

	private static void dfs2(ArrayList<ArrayList<Integer>> g, boolean[] c, int x) {
		Stack<Integer> st = new Stack<Integer>();

		st.push(x);
		c[x] = true;
		System.out.println(x + " ");

		boolean flag = false;

		while (!st.empty()) {
			x = st.peek();

			flag = false;

			for (int y : g.get(x)) {
				if (c[y] == false) {
					st.push(y);
					System.out.println(y + " ");

					c[y] = true;
					flag = true;
					break;
				}
			}
			if (!flag) {
				st.pop();
			}
		}
	}

	private static void dfs(ArrayList<ArrayList<Integer>> g, boolean[] c, int x) {
		c[x] = true;

		System.out.println(x + " ");

		for (Integer y : g.get(x)) {
			if (c[y] == false) {
				dfs(g, c, y);
			}
		}
	}

}
