package com.sda.weather;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

public class App {
    public static void main(String[] args) {
        String url = "http://api.apixu.com/v1/current.json?key=c2b6f0654d58411aa5c73023181808&q=Bydgoszcz";

        try {
            // System.out.println(IOUtils.toString(new URL(url),Charset.forName("UTF-8")));
            JSONObject json = new JSONObject(IOUtils.toString(new URL(url), Charset.forName("UTF-8")));
            System.out.println(json.getJSONObject("current").get("temp_c"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

