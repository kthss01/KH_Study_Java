package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.controller.VehicleController;
import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {
		
		Car c = new Car("벤틀리", 12.5, "sedan", 4);
		
		Airplane a = new Airplane("비행기", 0.021, "제트기", 16, 5);
		
		Ship s = new Ship("낚시배", 3, "어선", 1);
		
		System.out.println(c.information());
		System.out.println(a.information());
		System.out.println(s.information());
		
		c.howToMove();
		a.howToMove();
		s.howToMove();
		
		// 다형성적용하고 howToMove 찍어보기
		
//		VehicleController vc = new VehicleController();
//		
//		vc.insert(new Car("벤틀리", 12.5, "sedan", 4));
//		vc.insert(new Airplane("비행기", 0.021, "제트기", 16, 5));
//		vc.insert(new Ship("낚시배", 3, "어선", 1));
//		
//		Vehicle[] vcs = vc.selectAll();
//
//		for (Vehicle v : vcs) {
//			System.out.println(v);
//		}
//		
//		for (Vehicle v : vcs) {
//			v.howToMove();
//		}
		
		Vehicle[] arr = new Vehicle[3];
		arr[0] = new Car("벤틀리", 12.5, "sedan", 4);
		arr[1] = new Airplane("비행기", 0.021, "제트기", 16, 5);
		arr[2] = new Ship("낚시배", 3, "어선", 1);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].howToMove();
		}
	}

}
