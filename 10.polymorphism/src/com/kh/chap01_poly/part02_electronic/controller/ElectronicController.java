package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicController {

	private Desktop desk;
	private NoteBook note;
	private Tablet tab;

	public void insert(Desktop d) {
		desk = d;
	}

	public void insert(NoteBook n) {
		note = n;
	}

	public void insert(Tablet t) {
		tab = t;
	}
	
	

	public Desktop selectDesktop() {
		return desk;
	}

	public NoteBook selectNoteBook() {
		return note;
	}

	public Tablet selectTablet() {
		return tab;
	}
}
