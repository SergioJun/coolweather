package com.example.coolweather.gson;

/**
 * Created by Jun on 2017/7/10.
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
