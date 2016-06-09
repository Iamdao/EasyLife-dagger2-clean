package d.dao.easylife.dagger2.components;

import d.dao.easylife.dagger2.app.AppComponent;
import d.dao.easylife.dagger2.modules.MainActivityModule;
import d.dao.easylife.dagger2.modules.WeatherActivityModule;
import d.dao.easylife.dagger2.presenter.impl.NewsPresenter;
import d.dao.easylife.dagger2.presenter.impl.WeatherPresenter;
import d.dao.easylife.dagger2.scope.ActivityScope;
import d.dao.easylife.dagger2.ui.MainActivity;
import d.dao.easylife.dagger2.ui.WeatherActivity;
import dagger.Component;

/**
 * Created by dao on 6/9/16.
 */
@ActivityScope
@Component(modules = WeatherActivityModule.class,dependencies = AppComponent.class)
public interface WeatherActivityComponent {

    WeatherActivity inject(WeatherActivity weatherActivity);

    //注入NewsPresenter
    WeatherPresenter getWeatherPresenter();

}
