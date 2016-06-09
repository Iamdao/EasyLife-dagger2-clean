package d.dao.easylife.dagger2.model.impl;

import d.dao.easylife.dagger2.api.EasyLife;
import d.dao.easylife.dagger2.bean.robot.RobotResponseMsg;
import d.dao.easylife.dagger2.constants.BaseUrl;
import d.dao.easylife.dagger2.model.IRobotModel;
import rx.Observable;

/**
 * Created by dao on 6/4/16.
 * 机器人
 */
public class RobotModel implements IRobotModel {
    private static RobotModel mInstance = new RobotModel();

    public static synchronized RobotModel getInstance() {
        return mInstance;
    }

    @Override
    public Observable<RobotResponseMsg> loadRobot(String info, String key) {
        return EasyLife.getInstance().getApiService(BaseUrl.ROBOT).loadRobot(info, key);
    }
}
