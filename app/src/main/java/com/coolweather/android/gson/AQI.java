package com.coolweather.android.gson;

/**
 * Created by chencc on 2018/5/22.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
