package d.dao.easylife.dagger2.app;

import android.app.Application;

import javax.inject.Singleton;

import d.dao.easylife.dagger2.api.ApiService;
import d.dao.easylife.dagger2.api.ApiServiceModule;
import d.dao.easylife.dagger2.modules.AppServiceModule;
import d.dao.easylife.dagger2.utils.ACache;
import d.dao.easylife.dagger2.utils.ReservoirUtils;
import d.dao.easylife.dagger2.utils.ToastUtil;
import dagger.Component;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by dao on 6/9/16.
 */
@Singleton
@Component(modules = {AppModule.class, ApiServiceModule.class, AppServiceModule.class})
public interface AppComponent {

    //    Application getApplication();
    ToastUtil getToastUtil();

    ACache getACache();

    ApiService getApiService();

    CompositeSubscription getCompositeSubscription();

    ReservoirUtils getReservoirUtils();
}
