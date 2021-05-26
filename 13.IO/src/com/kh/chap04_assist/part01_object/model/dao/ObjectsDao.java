package com.kh.chap04_assist.part01_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.chap04_assist.part01_object.model.vo.Phone;

public class ObjectsDao {

	public void fileSave() {
//		Phone[] arr = new Phone[3];
//
//		arr[0] = new Phone("엘지", 10000);
//		arr[1] = new Phone("엘지1", 20000);
//		arr[2] = new Phone("엘지2", 30000);

		// 객체 배열이 아닌 컬렉션 이용
		// 제네릭스<> 사용 이유
		// 1. 명시된 타입의 객체만 저장하도록 제한을 두기 위해
		// 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 형변환 하는 절차를 없애기 위해

		ArrayList<Phone> phoneList = new ArrayList<Phone>();
		phoneList.add(new Phone("엘지", 10000));
		phoneList.add(new Phone("엘지1", 20000));
		phoneList.add(new Phone("엘지2", 30000));

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone1.txt"))) {

			for (int i = 0; i < phoneList.size(); i++) {
				oos.writeObject(phoneList.get(i));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileOpen() {

		ArrayList<Phone> phoneList = new ArrayList<Phone>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone1.txt"))) {

			int i = 0;
			while (true) {
				phoneList.add((Phone) ois.readObject());

				System.out.println(phoneList.get(i));
				i++;
			}

		} catch (EOFException e) {
			
			// 파일에 더이상 읽을 내용이 없을 때 발생하는 Exception
			// 발생할 수 밖에 없는 예외이기 때문에 처리 로직을 작성해줘야 한다.
			
			System.out.println("파일 읽기 완료");
			return;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
