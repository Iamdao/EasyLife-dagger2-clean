package d.dao.easylife.dagger2.presenter;

import d.dao.easylife.dagger2.ui.view.IMainView;

/**
 * Created by dao on 5/29/16.
 * 新闻
 */
public interface INewsPresenter {

    void attachView(IMainView view);

    /**
     * 刷新时加载
     */
    void loadNews(boolean firstRefresh);

    /**
     * 下拉加载更多
     *
     * @param time 时间戳
     */
    void loadMore(long time);
    void detachView(IMainView view);
}
