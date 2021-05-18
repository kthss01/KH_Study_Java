package com.kh.chap02_inherit.controller;

import com.kh.chap02_inherit.model.vo.Vehicle;

public class VehicleController {
	
	private Vehicle[] vc = new Vehicle[3];
	private int count = 0;
	
	public void insert(Vehicle v) {
		vc[count++] = v;
	}
	
	public Vehicle select(int index) {
		return vc[index];
	}
	
	public Vehicle[] selectAll() {
		return vc;
	}
}
