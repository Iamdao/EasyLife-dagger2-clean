package d.dao.easylife.dagger2.model.impl;

import d.dao.easylife.dagger2.api.EasyLife;
import d.dao.easylife.dagger2.bean.ip.Ip;
import d.dao.easylife.dagger2.constants.BaseUrl;
import d.dao.easylife.dagger2.model.IQueryIpModel;
import rx.Observable;

/**
 * Created by dao on 6/4/16.
 * 查询ip
 */
public class QueryIpModel implements IQueryIpModel{

    private static QueryIpModel mInstance = new QueryIpModel();

    public static synchronized QueryIpModel getInstance(){
        return mInstance;
    }
    @Override
    public Observable<Ip> queryIp(String ip, String key) {
        return EasyLife.getInstance().getApiService(BaseUrl.IP).queryIp(ip,key);
    }
}
