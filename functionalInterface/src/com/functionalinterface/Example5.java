package com.functionalinterface;
import java.util.function.Function;

class SensorData{
	private double temperature;
	private double humidity;
	public SensorData(double temperature, double humidity) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	
interface Function<SensorData, Double>{
	Double apply(SensorData Data);
}
}

public class Example5 {

	public static void main(String[] args) {
		Function<SensorData, Double> f = new Function<SensorData, Double>(){
			@Override
			public java.lang.Double apply(SensorData t) {
				return t.getTemperature();
			}
		};
		
		Function<SensorData, Boolean> f1 = new Function<SensorData, Boolean>(){

			@Override
			public java.lang.Boolean apply(SensorData t1) {
				if(t1.getTemperature() > t1.getHumidity()) return true;
				else return false;
			}
		};
		SensorData s1 = new SensorData(34.00, 25.00);
		SensorData s2 = new SensorData(30.00, 25.00);
		SensorData s3 = new SensorData(22.10, 25.00);
		SensorData [] data = {s1,s2,s3};
		for(SensorData d : data) {
			System.out.println("Temperature: " + f.apply(d));
			System.out.println(f1.apply(d));
		}
	}

}
