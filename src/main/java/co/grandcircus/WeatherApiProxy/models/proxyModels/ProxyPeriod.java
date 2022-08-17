package co.grandcircus.WeatherApiProxy.models.proxyModels;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.grandcircus.WeatherApiProxy.models.gridpointsModels.Periods;

public class ProxyPeriod extends Periods {
	
	
	public ProxyPeriod() {
		super();
	
	}
	// part 2 - says round, not truncate...
	int temperatureCelsius;
	
	// extended challenge
	@JsonProperty("windSpeed")
	int maxWindSpeed;
	int rating;
	Integer temperatureChange;
	
}
