package com.douzone.container.videosystem;

public class Avengers implements DigitalVideoDisc {
	private String title = "Avengers";
	private String studio = "MARVEL";
	
	@Override
	public String play() {
		return "playing Move " + studio + "'s " + title;
	}

}
