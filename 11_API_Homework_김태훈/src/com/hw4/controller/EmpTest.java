package com.hw4.controller;

import java.util.Arrays;
import java.util.Scanner;

import com.hw4.model.vo.Employee;

public class EmpTest {

	private Employee[] empArr;
	
	public EmpTest() {
	}

	public void setEmp() {
		// 크기가 6인 Employee[]를 만들고 위의 사용데이터에 나와있는 순으로 저장
		empArr = new Employee[6];
		int count = 0;
		
		empArr[count++] = new Employee("김문말", 24, 1500000, 1.245);
		empArr[count++] = new Employee("이장소", 40, 2500000, 1.4);
		empArr[count++] = new Employee("박금순", 22, 1780000, 1.3);
		empArr[count++] = new Employee("최봉호", 31, 1950000, 1.365);
		empArr[count++] = new Employee("홍달림", 34, 1650000, 1.212);
		
		// 한 사원에 대한 이름, 나이, 급여, 세율을 입력 받고 저장
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("급여을 입력하세요 : ");
		int salary = sc.nextInt();
		
		System.out.print("세율을 입력하세요 : ");
		double taxRate = sc.nextDouble();
		
		empArr[count++] = new Employee(name, age, salary, taxRate);
	}

	public void printEmp() {
		for (Employee employee : empArr) {
			System.out.println(employee);
		}
	}

	public void nameSortPrint() {
//		Arrays.sort(empArr);
		
		// 선택 정렬
		for (int i = 1; i < empArr.length; i++) {
			for (int j = 0; j < empArr.length; j++) {
				if (empArr[i].getName().equals(empArr[j].getName())) {
					String temp = empArr[i].getName();
					empArr[i].setName(empArr[j].getName());
					empArr[j].setName(temp);
				}
			}
		}
		
		printEmp();
	}
}
