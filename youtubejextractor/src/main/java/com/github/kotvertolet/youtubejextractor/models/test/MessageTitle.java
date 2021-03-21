package com.github.kotvertolet.youtubejextractor.models.test;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MessageTitle{

	@SerializedName("runs")
	private List<RunsItem> runs;

	public void setRuns(List<RunsItem> runs){
		this.runs = runs;
	}

	public List<RunsItem> getRuns(){
		return runs;
	}
}