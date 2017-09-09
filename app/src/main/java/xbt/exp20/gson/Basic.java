package xbt.exp20.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xbt on 2017/9/9.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
