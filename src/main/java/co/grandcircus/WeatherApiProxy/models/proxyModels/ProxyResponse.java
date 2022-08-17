package co.grandcircus.WeatherApiProxy.models.proxyModels;

import java.util.List;

public class ProxyResponse {
	List<ProxyPeriod> periods;
	Stats stats;
	
	public List<ProxyPeriod> getPeriods() {
		return periods;
	}
	public void setPeriods(List<ProxyPeriod> periods) {
		this.periods = periods;
	}
	public Stats getStats() {
		return stats;
	}
	public void setStats(Stats stats) {
		this.stats = stats;
	}
	
	
}
