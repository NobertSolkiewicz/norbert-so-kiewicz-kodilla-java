package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Map<String, Double>  averageForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        double result = 0;
        int count = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            count++;
            calculateForecast();
            result = result + temperature.getValue();
            resultMap.put(temperature.getKey(), result/ count);
        }

        return resultMap;
    }

    public Map<String, Double> medianaForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        List<Double> resultList = new ArrayList<>();
        double mediana = 0;
        double temp = 0;
        int count = 0;
        int length = resultList.size();
        Collections.sort(resultList);




        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            if (length % 2 == 0) {
                temp = resultList.get(length / 2) + resultList.get((length / 2) - 1);
                mediana = temp / 2.0;
                resultList.add(mediana);
                resultMap.put(temperature.getKey(), resultList.get(count));
                count++;
            } else {
                mediana = resultMap.get(length / 2);
                resultList.add(mediana);
                resultMap.put(temperature.getKey(), resultList.get(count));
                count++;
            }
        }
        return resultMap;
    }
}
