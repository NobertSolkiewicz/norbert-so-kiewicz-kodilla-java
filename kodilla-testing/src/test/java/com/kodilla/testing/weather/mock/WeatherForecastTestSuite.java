package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org. mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Preparing to execute test with Mock");
    }

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecast() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageForecast() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.averageForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testMedianaForecast() {
        //Given
//        Map<String, Double> temperaturesMap = new HashMap<>();
//        List<Double> temperaturesList = new ArrayList<>();
//        temperaturesMap.put("Rzeszow", 25.5);
//        temperaturesMap.put("Krakow", 26.2);
//        temperaturesMap.put("Wroclaw", 24.8);
//        temperaturesMap.put("Warszawa", 25.2);
//        temperaturesMap.put("Gdansk", 26.1);
//        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
//        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
//
//        //When
//        int quantityOfSensors = weatherForecast.medianaForecast().size();
//
//        //Then
//        Assertions.assertEquals(5, quantityOfSensors);
    }

}
