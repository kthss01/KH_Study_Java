package com.kh.chap01_list.part02_list.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part02_list.model.vo.Music;

public class Run {

	public static void main(String[] args) {
		// 제네릭스<> 사용 이유
		// 1. 명시된 타입의 객체만 저장하도록 제한을 두기 위해
		// 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 형변환 하는 절차를 없애기 위해
		
		// E -> Element : 리스트에 담길 요소 (객체)
		ArrayList<Music> list = new ArrayList<Music>(3);
		
		// 1. add(E e) : 리스트의 끝에 인스턴스 데이터를 추가하는 메소드
		// (내부적으로 사이즈 검사한 후 수용 가능한 범위이면 추가되고 넘어가면 알아서 사이즈를 늘려줌)
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("가을아침", "아이유"));
		list.add(new Music("Butter", "방탄"));
//		list.add("끝"); // 제네릭스<> 사용으로 여기서는 명시된 객체만
		
		System.out.println(list);
//		System.out.println(list.toString());
		
		// 2. add(int index, E e) : 인덱스를 지정하여 해당 인데그에 인스턴스 추가하는 메소드
		list.add(1, new Music("체념", "정상동기")); // 크기 제약이 없이 추가됨
		System.out.println(list);
		
		// 3. set(int index, E e) : 해당 인덱스의 값을 E로 변경
		list.set(0, new Music("상상더하기", "MSG"));
		System.out.println(list);
		
		// 4. size() : 리스트안에 몇개의 데이터가 있는지
		System.out.println(list.size());
		
		// 5. remove(int index) : 해당 인덱스의 인스턴스 삭제 (알아서 크기 줄어들고 앞으로 땡겨줌)
//		list.remove(1);
		list.remove(new Music("체념", "정상동기")); // 그냥은 안지워짐
		// -> equals랑 hashcode 오버라이딩 해줘야함
		System.out.println("remove : " + list);
		System.out.println(list.size());
		
		// 6. get(int index) : 해당 인덱스의 인스턴스 가져오기
		System.out.println(list.get(0));
		System.out.println(list.get(0).getTitle());
		
		// 7. subList(int index1, int index2) : 추출해서 새로운 List로 반환
		List sub = list.subList(0, 2); // toindex는 exclusive
		System.out.println(sub);
		
		// 8. addAll (Collection c) : 컬렉션을 통째로 뒤에 추가하는 메소드
		list.addAll(sub);
		System.out.println(list);
		System.out.println(list.size());
	}

}
