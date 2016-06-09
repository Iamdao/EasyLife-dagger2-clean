package d.dao.easylife.dagger2.components;

import d.dao.easylife.dagger2.app.AppComponent;
import d.dao.easylife.dagger2.modules.MainActivityModule;
import d.dao.easylife.dagger2.presenter.impl.NewsPresenter;
import d.dao.easylife.dagger2.scope.ActivityScope;
import d.dao.easylife.dagger2.ui.MainActivity;
import d.dao.easylife.dagger2.utils.ToastUtil;
import dagger.Component;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by dao on 6/9/16.
 */
@ActivityScope
@Component(modules = MainActivityModule.class,dependencies = AppComponent.class)
public interface MainActivityComponent {

    MainActivity inject(MainActivity mainActivity);

    //注入NewsPresenter
    NewsPresenter getNewsPresenter();

}
