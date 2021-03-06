package com.kh.chap01_before_vs_after.after.model.vo;

public class Tv extends Product {
	private int inch;

	public Tv() {
	}

	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String information() {
		return super.information() + ", inch : " + inch;
	}

}
