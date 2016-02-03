package com.sitdh.master.eaa.main;

import java.util.Vector;

public class A9RadioStation {

	public Vector<String> streamedSongs;
	
	protected String streamedLocation;
	
	public A9RadioStation() {
		streamedSongs = new Vector<String>();
	}
	
	protected String stationHardware() {
		return this.streamedLocation;
	}
	
	protected void changeStreamLocation(String streamLocation) {
		this.streamedLocation = streamLocation;
	}
	
	protected void rerouteStreamingServer() {
		System.out.println("station> Rerouting stream server.");
	}
}
