package qulei.android.dagger2.demo.abs;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import qulei.android.dagger2.demo.AppComponent;
import qulei.android.dagger2.demo.MainApplication;
import qulei.android.dagger2.demo.component.ActivityComponent;

/**
 * Activity基础类
 */
public abstract class AbsActivity extends AppCompatActivity {

    protected AppComponent appComponent;
    protected ActivityComponent activityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application app = getApplication();
        if (app instanceof MainApplication) {
            MainApplication mainApp = (MainApplication) getApplication();
            appComponent = mainApp.getAppComponent();
            activityComponent = mainApp.getActivityComponent();
            inject(appComponent);
            inject(activityComponent);
        }
    }

    public int getContainerId() {
        return -1;
    }

    protected void inject(ActivityComponent activityComponent) {

    }

    protected void inject(AppComponent appComponent) {

    }

}
