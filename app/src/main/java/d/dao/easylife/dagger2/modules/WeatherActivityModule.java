package d.dao.easylife.dagger2.modules;

import javax.inject.Singleton;

import d.dao.easylife.dagger2.api.ApiService;
import d.dao.easylife.dagger2.presenter.impl.WeatherPresenter;
import d.dao.easylife.dagger2.scope.ActivityScope;
import d.dao.easylife.dagger2.ui.WeatherActivity;
import d.dao.easylife.dagger2.utils.ReservoirUtils;
import dagger.Module;
import dagger.Provides;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by dao on 6/10/16.
 */
@Module
public class WeatherActivityModule {
    private WeatherActivity mWeatherActivity;
    public WeatherActivityModule(WeatherActivity weatherActivity){
        this.mWeatherActivity = weatherActivity;
    }

    @Provides
    @ActivityScope
    WeatherActivity provideWeatherActivity(){
        return this.mWeatherActivity;
    }

    @Provides
    @ActivityScope
    WeatherPresenter provideWeatherPresenter(WeatherActivity weatherActivity,
                                             ApiService apiService,
                                             CompositeSubscription compositeSubscription
                                             ){
        return new WeatherPresenter(weatherActivity,apiService,compositeSubscription
                                    );
    }

}
