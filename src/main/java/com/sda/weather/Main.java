package com.sda.weather;



import model.Weather;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json",
                "d48c0d5e40054b6a9e571834181808");

        Weather weather = weatherService.getCityWeather("Torun");

        System.out.println(weatherService.getCityWeather("Torun"));
        String url = "http://maps.googleapis.com/maps/api/staticmap?center=54.35,18.67&size=400x400&zoom=10";
        try(InputStream input = new URL(url).openStream()){
            Files.copy(input, Paths.get("plik.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}