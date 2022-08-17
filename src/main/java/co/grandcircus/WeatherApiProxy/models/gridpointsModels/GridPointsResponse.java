package co.grandcircus.WeatherApiProxy.models.gridpointsModels;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GridPointsResponse {

	private String id;

	@JsonProperty("properties")
	private GridPointsProperties gridPointsProperties;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	
	}
	public GridPointsProperties getGridPointsProperties() {
		return gridPointsProperties;
	}
	public void setGridPointsProperties(GridPointsProperties gridPointsProperties) {
		this.gridPointsProperties = gridPointsProperties;
	}
	
	
}
