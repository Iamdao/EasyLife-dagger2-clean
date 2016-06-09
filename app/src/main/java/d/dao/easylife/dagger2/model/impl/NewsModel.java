package d.dao.easylife.dagger2.model.impl;

import d.dao.easylife.dagger2.api.EasyLife;
import d.dao.easylife.dagger2.bean.news.News;
import d.dao.easylife.dagger2.constants.BaseUrl;
import d.dao.easylife.dagger2.model.INewsModel;
import rx.Observable;

/**
 * Created by dao on 5/29/16.
 * 新闻IModel实现
 */
public class NewsModel implements INewsModel {

    private static NewsModel mInstance;

    public synchronized static NewsModel getInstance() {
        if (mInstance == null) {
            mInstance = new NewsModel();
        }
        return mInstance;
    }


    /**
     * 获取新闻
     *
     * @param time
     * @param pageSize
     * @return
     */
    @Override
    public Observable<News> loadNews(long time, int pageSize) {
        return EasyLife.getInstance().getApiService(BaseUrl.NEWS).loadNews(time, pageSize);
    }
}
