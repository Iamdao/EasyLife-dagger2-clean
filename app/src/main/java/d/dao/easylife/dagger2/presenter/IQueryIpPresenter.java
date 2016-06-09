package d.dao.easylife.dagger2.presenter;

import d.dao.easylife.dagger2.ui.view.IQueryIpView;

/**
 * Created by dao on 6/4/16.
 * 查询ip
 */
public interface IQueryIpPresenter {

    void attachView(IQueryIpView view);

    /**
     *
     * @param ip   www.baidu.com
     * @param key  聚合数据key
     */
    void queryIp(String ip,String key);

    void detachView(IQueryIpView view);

}
