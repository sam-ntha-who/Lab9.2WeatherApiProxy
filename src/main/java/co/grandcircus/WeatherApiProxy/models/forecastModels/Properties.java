package co.grandcircus.WeatherApiProxy.models.forecastModels;

import java.util.List;

public class Properties {
	
	private List<Periods> periods;

	public List<Periods> getPeriods() {
		return periods;
	}

	public void setPeriods(List<Periods> periods) {
		this.periods = periods;
	}
	
}
