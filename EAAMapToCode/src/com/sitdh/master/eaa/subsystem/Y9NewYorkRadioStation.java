package com.sitdh.master.eaa.subsystem;

import java.util.Vector;

import com.sitdh.master.eaa.main.A9RadioStation;
import com.sitdh.master.eaa.main.X9BangkokRadioStation;

public class Y9NewYorkRadioStation extends A9RadioStation {
	
	private X9BangkokRadioStation streamingRadioStation;
	
	public Y9NewYorkRadioStation() {
		
	}

	public void startLiveStreamingFromAnoterStation(X9BangkokRadioStation streamingRadioStation) {
		this.streamingRadioStation = streamingRadioStation;
	}
	
	public Vector<String> getStreaming() {
		return streamingRadioStation.streamedSongs;
	}

	public Object getCurrentStreamingLocation() {
		// TODO Auto-generated method stub
		// return streamingRadioStation.streamedLocation;
		return null;
	}
	
	public void rerouteStreamingServer() {
		System.out.println("ny> Going to reroute BKK Station's stream server.");
		// streamingRadioStation.rerouteStreamingServer();
		System.out.println("ny> Routing timeout, please try again later");
	}

}
