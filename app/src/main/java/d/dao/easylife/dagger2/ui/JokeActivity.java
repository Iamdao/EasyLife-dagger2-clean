package d.dao.easylife.dagger2.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import android.view.View;

import d.dao.easylife.dagger2.R;
import d.dao.easylife.dagger2.adapter.SimpleFragmentPagerAdapter;
import d.dao.easylife.dagger2.app.AppComponent;

public class JokeActivity extends BaseToolbarActivity
        implements View.OnClickListener {
    private Context mContext;
    private SimpleFragmentPagerAdapter pagerAdapter;

    private ViewPager viewPager;

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_joke;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {

        mContext = JokeActivity.this;
        super.setHomeTrue();
        pagerAdapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager(), this);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(pagerAdapter);
        tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
//        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListeners() {

    }

    @Override
    public void onClick(View view) {

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
