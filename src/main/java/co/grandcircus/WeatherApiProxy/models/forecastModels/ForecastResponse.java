package co.grandcircus.WeatherApiProxy.models.forecastModels;

import java.util.List;


public class ForecastResponse {

	private String id;


	private List<Properties> properties;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	
	}
	public List<Properties> getProperties() {
		return properties;
	}
	public void setProperties(List<Properties> properties) {
		this.properties = properties;
	}
	
	
}
