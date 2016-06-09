package d.dao.easylife.dagger2.app;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;

import com.anupcowkur.reservoir.Reservoir;
import com.zhy.autolayout.config.AutoLayoutConifg;

import d.dao.easylife.dagger2.utils.ACache;

/**
 * Created by dao on 5/29/16.
 */
public class EasyLifeApplication extends Application {

    public static final long ONE_KB = 1024L;
    public static final long ONE_MB = ONE_KB * 1024L;
    public static final long CACHE_DATA_MAX_SIZE = ONE_MB * 3L;

    private AppComponent mAppComponent;

    public static EasyLifeApplication get(Context context) {
        return (EasyLifeApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

        AutoLayoutConifg.getInstance().useDeviceSize();
        this.initReservoir();


    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    @Override
    public AssetManager getAssets() {
        return super.getAssets();
    }


    private void initReservoir() {
        try {
            Reservoir.init(this, CACHE_DATA_MAX_SIZE);
        } catch (Exception e) {
            //failure
            e.printStackTrace();
        }
    }

}
