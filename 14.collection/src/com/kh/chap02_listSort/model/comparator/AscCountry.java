package com.kh.chap02_listSort.model.comparator;

import java.util.Comparator;

import com.kh.chap02_listSort.model.vo.Travel;

public class AscCountry implements Comparator<Travel> {

	@Override
	public int compare(Travel o1, Travel o2) {
		return o1.getCountry().compareTo(o2.getCountry());
	}

}
