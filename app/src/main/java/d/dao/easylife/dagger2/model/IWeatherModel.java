package d.dao.easylife.dagger2.model;

import d.dao.easylife.dagger2.bean.weather.Weather;
import rx.Observable;

/**
 * Created by dao on 6/3/16.
 *天气
 */
public interface IWeatherModel {

    /**
     * 获取天气情况
     * @param city  城市
     * @param more  几天,不大于2
     * @return
     */
    Observable<Weather> loadWeather(String city,int more);
}
