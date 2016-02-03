package com.sitdh.master.eaa.subsystem;

import java.util.Vector;

import com.sitdh.master.eaa.main.A9RadioStation;
import com.sitdh.master.eaa.main.X9BangkokRadioStation;

public class Y9NewYorkRadioStation extends A9RadioStation {
	
	private X9BangkokRadioStation streamingRadioStation;

	public void startLiveStreamingFromAnoterStation(X9BangkokRadioStation streamingRadioStation) {
		this.streamingRadioStation = streamingRadioStation;
	}
	
	public Vector<String> getStreaming() {
		return streamingRadioStation.streamedSongs;
	}

}
