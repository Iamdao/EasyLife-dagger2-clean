package d.dao.easylife.dagger2.ui;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.zhy.autolayout.AutoLayoutActivity;

import d.dao.easylife.dagger2.app.AppComponent;
import d.dao.easylife.dagger2.app.EasyLifeApplication;

/**
 * Created by dao on 5/29/16.
 */
public abstract class BaseAppCompatActivity extends AutoLayoutActivity {
    private ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(this.getLayoutId());
        this.setupActivityComponent(EasyLifeApplication.get(this).getAppComponent());
        this.initToolbar(savedInstanceState);
        this.initViews(savedInstanceState);
        this.initData();
        this.initListeners();
    }

    protected abstract void setupActivityComponent(AppComponent appComponent);

    //布局ID
    protected abstract int getLayoutId();

    protected abstract void initToolbar(Bundle savedInstanceState);

    protected abstract void initViews(Bundle savedInstanceState);

    protected abstract void initData();

    protected abstract void initListeners();


    //显示进度框
    protected void showProgressDialog(String title, String content) {
        pd = ProgressDialog.show(this, title, content, false, false);
        pd.show();
    }

    //隐藏进度框
    protected void hiddenProgressDialog() {
        if (pd != null && pd.isShowing()) {
            pd.dismiss();
            pd = null;
        }
    }


}
