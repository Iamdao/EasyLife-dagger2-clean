package d.dao.easylife.dagger2.presenter.impl;

import d.dao.easylife.dagger2.api.DataManager;
import d.dao.easylife.dagger2.bean.robot.BaseRobotResponseData;
import d.dao.easylife.dagger2.presenter.IRobotPresenter;
import d.dao.easylife.dagger2.ui.view.IRobotView;
import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by dao on 6/4/16.
 * 机器人
 */
public class RobotPresenterImpl implements IRobotPresenter {

    private IRobotView mView;
    private DataManager mDataManager;
    private CompositeSubscription mCompositeSubscription;

    @Override
    public void attachView(IRobotView view) {
        this.mView = view;
        this.mDataManager = DataManager.getInstance();
        this.mCompositeSubscription = new CompositeSubscription();
    }


    @Override
    public void loadRobot(String info, String key) {
        this.mCompositeSubscription.add(this.mDataManager.loadRobot(info, key).subscribe(new Subscriber<BaseRobotResponseData>() {
            @Override
            public void onCompleted() {
                if (mCompositeSubscription != null) {
                    mCompositeSubscription.remove(this);
                }
            }

            @Override
            public void onError(Throwable e) {
                mView.onGetRobotResponseFailure(e);
            }

            @Override
            public void onNext(BaseRobotResponseData baseRobotResponseData) {
                mView.onGetRobotResponseSuccess(baseRobotResponseData);
            }
        }));
    }

    @Override
    public void detachView(IRobotView view) {
        this.mView = null;
        this.mCompositeSubscription.unsubscribe();
        this.mCompositeSubscription = null;
    }
}
