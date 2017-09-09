package xbt.exp20.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xbt on 2017/9/9.
 *
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }

}
