package qulei.android.dagger2.demo;

import android.app.Application;

import qulei.android.dagger2.demo.component.ActivityComponent;
import qulei.android.dagger2.demo.component.DaggerActivityComponent;
import qulei.android.dagger2.demo.component.DaggerFragmentComponent;
import qulei.android.dagger2.demo.component.FragmentComponent;


public class MainApplication extends Application {

    private AppComponent appComponent;
    private FragmentComponent fragmentComponent;
    private ActivityComponent activityComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initComponent();
    }

    private void initComponent() {

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this)).build();
        appComponent.inject(this);

        activityComponent = DaggerActivityComponent.builder()
                .appComponent(appComponent).build();

        fragmentComponent = DaggerFragmentComponent.builder()
                .appComponent(appComponent).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }

    public FragmentComponent getFragmentComponent() {
        return fragmentComponent;
    }

}
