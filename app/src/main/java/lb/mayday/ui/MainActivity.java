package lb.mayday.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;

import lb.mayday.R;
import lb.mayday.ui.concert.ConcertFragment;


public class MainActivity extends BaseActivity {
    //演唱会Fragment
    private ConcertFragment mFtConcert;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControls();
    }

    @Override
    protected void initControls() {
        setDefaultFragment();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
    }

    private void setDefaultFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        mFtConcert = new ConcertFragment();
        transaction.replace(R.id.fl_content,mFtConcert);
        transaction.commit();
    }
}
