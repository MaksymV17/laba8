package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherData {
    private List<String> time;

    @JsonProperty("Середня температура:")
    private List<Double> temperature2mMean;

    @JsonProperty("Всього осадків:")
    private List<Double> precipitationSum;

    @JsonProperty("Швидкість вітру:")
    private List<Double> windSpeed10mMax;

    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }

    public List<Double> getTemperature2mMean() {
        return temperature2mMean;
    }

    public void setTemperature2mMean(List<Double> temperature2mMean) {
        this.temperature2mMean = temperature2mMean;
    }

    public List<Double> getPrecipitationSum() {
        return precipitationSum;
    }

    public void setPrecipitationSum(List<Double> precipitationSum) {
        this.precipitationSum = precipitationSum;
    }

    public List<Double> getWindSpeed10mMax() {
        return windSpeed10mMax;
    }

    public void setWindSpeed10mMax(List<Double> windSpeed10mMax) {
        this.windSpeed10mMax = windSpeed10mMax;
    }

    @Override
    public String toString() {
        return "Погодні данні кожного дня{" +
                "час=" + time +
                ", температура середня=" + temperature2mMean +
                ", сума опадів=" + precipitationSum +
                ", швидкість вітру=" + windSpeed10mMax +
                '}';
    }
}