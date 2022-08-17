package co.grandcircus.WeatherApiProxy.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.WeatherApiProxy.models.forecastModels.ForecastResponse;
import co.grandcircus.WeatherApiProxy.models.forecastModels.Periods;
import co.grandcircus.WeatherApiProxy.models.gridpointsModels.GridPointsResponse;

@Service
public class WeatherApiService {

	private RestTemplate request = new RestTemplate();
	
	public String getPoints(double lat, double lon) {
		String url = "https://api.weather.gov/points/{lat},{lon}";
		GridPointsResponse response = request.getForObject(url, GridPointsResponse.class, lat, lon);
		return response.getGridPointsProperties().getForecast();
		}
	// test - get rid of this and redo an actual period forecast later
	public List<Periods> getPeriodForecast(double lat, double lon) {
		String url = getPoints(lat, lon);
		ForecastResponse response = request.getForObject(url, ForecastResponse.class);
		return response.getProperties().getPeriods();
		
	}
	
}
