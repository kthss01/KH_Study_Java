package com.kh.chap01_list.part02_list.model.vo;

import java.util.Objects;

public class Music {

	private String title;
	private String artist;

	public Music() {
	}

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public int hashCode() {
		return (title + artist).hashCode();
//		return Objects.hash(title, artist);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Music)) {
			return false;
		}

		Music other = (Music) obj;

		if (title.equals(other.title) && artist.equals(other.artist)) {
			return true;
		} else {
			return false;
		}
	}

}
