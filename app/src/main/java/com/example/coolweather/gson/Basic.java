package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jun on 2017/7/10.
 */
public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
