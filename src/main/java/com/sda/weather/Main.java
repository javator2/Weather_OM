package com.sda.weather;

import Model.Weather;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Weather weather = new Weather();
        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json",
                "65a4823656d3421593273051181808");

        System.out.println(weatherService.getCityWeather("Gdansk"));



    }
}