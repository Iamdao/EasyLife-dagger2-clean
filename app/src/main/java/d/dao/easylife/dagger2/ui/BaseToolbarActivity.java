package d.dao.easylife.dagger2.ui;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;

import d.dao.easylife.dagger2.R;
import d.dao.easylife.dagger2.app.AppComponent;
import d.dao.easylife.dagger2.app.EasyLifeApplication;


/**
 * Created by dao on 5/29/16.
 */
public abstract class BaseToolbarActivity extends BaseAppCompatActivity {

    protected Toolbar mToolbar;
    protected AppBarLayout mAppBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    protected abstract  void setupActivityComponent(AppComponent appComponent);

    @Override
    protected void initToolbar(Bundle savedInstanceState) {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mAppBarLayout = (AppBarLayout) findViewById(R.id.app_bar_layout);
        this.setSupportActionBar(this.mToolbar);

    }
    protected void setHomeTrue(){
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

}
