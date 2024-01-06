package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WeatherDataTest {

    @Test
    void testWeatherDataParsing() {
        String json = "{ \"time\": [\"2024-01-01\", \"2024-01-02\"], " +
                "\"averageTemperature\": [10.5, 15.0], " +
                "\"totalPrecipitation\": [5.0, 0.0], " +
                "\"windSpeed\": [20.0, 25.0] }";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            WeatherData weatherData = objectMapper.readValue(json, WeatherData.class);

            assertNotNull(weatherData);
            assertEquals(Arrays.asList("2024-01-01", "2024-01-02"), weatherData.getTime());
            assertEquals(Arrays.asList(10.5, 15.0), weatherData.getTemperature2mMean());
            assertEquals(Arrays.asList(5.0, 0.0), weatherData.getPrecipitationSum());
            assertEquals(Arrays.asList(20.0, 25.0), weatherData.getWindSpeed10mMax());

        } catch (IOException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}

class WeatherHourTest {

    @Test
    void testWeatherHourParsing() {
        String json = "{ \"time\": [\"00:00\", \"01:00\"], " +
                "\"humidity\": [80, 85] }";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            WeatherHour weatherHour = objectMapper.readValue(json, WeatherHour.class);

            assertNotNull(weatherHour);
            assertEquals(Arrays.asList("00:00", "01:00"), weatherHour.getTime());
            assertEquals(Arrays.asList(80, 85), weatherHour.getRelativeHumidity2m());

        } catch (IOException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}