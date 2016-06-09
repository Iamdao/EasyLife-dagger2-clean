package d.dao.easylife.dagger2.bean.weather;

import java.util.ArrayList;

/**
 * Created by dao on 5/29/16.
 * 天气
 */
public class Weather {

    public String status;
    public String desc;
    public ArrayList<BaseWeatherData> detail;

    @Override
    public String toString() {
        return "Weather{" +
                "status='" + status + '\'' +
                ", desc='" + desc + '\'' +
                ", detail=" + detail +
                '}';
    }
}
