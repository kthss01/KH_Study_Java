package com.kh.chap03_set.part02_treeset.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap03_set.part02_treeset.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();
		
		ts.add(new String("하하하"));
		ts.add(new String("나나나"));
		ts.add(new String("가가가"));
		ts.add(new String("다다다"));
		ts.add(new String("하하하"));
		
		System.out.println(ts);
		
		TreeSet<Student> ts2 = new TreeSet<>();
		ts2.add(new Student("서연", 20, 100));
		ts2.add(new Student("민지", 22, 90));
		ts2.add(new Student("로운", 21, 30));
		ts2.add(new Student("서연", 10, 100));
		
		System.out.println(ts2);
		
		// TreeSet 의 경우는 hashCode(), equals()를 가지고 중복 판단을 하지 않고
		// compareTo()에 제시한 정렬필드가 같은 경우 동일객체로 판단
		
		// 1. foreach 문으로 출력
		for (Student student : ts2) {
			System.out.println(student);
		}
		
		// 2. ArrayList에 담아서 출력
		ArrayList<Student> a1 = new ArrayList<>(ts2);
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
			
		// 3. Iterator로 출력
		Iterator it = ts2.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		}
	}

}
