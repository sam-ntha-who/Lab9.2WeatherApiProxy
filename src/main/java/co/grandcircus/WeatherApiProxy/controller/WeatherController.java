package co.grandcircus.WeatherApiProxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.WeatherApiProxy.models.forecastModels.Periods;
import co.grandcircus.WeatherApiProxy.service.WeatherApiService;

@Controller
public class WeatherController {

	@Autowired
	WeatherApiService apiService;
	
	@GetMapping("/points")
	public String getGridPoints(@RequestParam double lat, @RequestParam double lon) {
		return apiService.getPoints(lat, lon);
	}
	// using this as a test - delete later and replace with appropriate method
	@GetMapping("/forecast")
	public List<Periods> getPeriodForecast(@RequestParam double lat, @RequestParam double lon){
		return apiService.getPeriodForecast(lat, lon);
	}
	
}


