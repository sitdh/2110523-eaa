package com.sitdh.master.eaa.main;

import java.util.Vector;

public class X9BangkokRadioStation extends A9RadioStation {
	
	public X9BangkokRadioStation() {
		streamedSongs = new Vector<String>();
		
		streamedSongs.add("รัก");
		streamedSongs.add("Home");
		streamedSongs.add("เจ้าหญิง เจ้าชาย");
		
		streamedLocation = "mms://bkkradio.station.fm";
	}
	
	protected void rerouteStreamingServer() {
		System.out.println("bkk> Rerouting streaming server");
		System.out.println("bkk> Done!");
	}

}
