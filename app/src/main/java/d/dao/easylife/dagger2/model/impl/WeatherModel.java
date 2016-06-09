package d.dao.easylife.dagger2.model.impl;

import android.util.Log;

import d.dao.easylife.dagger2.api.EasyLife;
import d.dao.easylife.dagger2.bean.weather.Weather;
import d.dao.easylife.dagger2.constants.BaseUrl;
import d.dao.easylife.dagger2.model.IWeatherModel;
import rx.Observable;

/**
 * Created by dao on 6/3/16.
 * 天气
 */
public class WeatherModel implements IWeatherModel{

    private static WeatherModel mInstance = new WeatherModel();

    public static  synchronized WeatherModel getInstance(){
        return mInstance;
    }
    @Override
    public Observable<Weather> loadWeather(String city,int more) {
        Log.e("model","load");
        return EasyLife.getInstance().getApiService(BaseUrl.NEWS).loadWeather(city,more);
    }
}
