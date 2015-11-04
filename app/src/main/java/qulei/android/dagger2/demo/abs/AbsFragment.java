package qulei.android.dagger2.demo.abs;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import qulei.android.dagger2.demo.AppComponent;
import qulei.android.dagger2.demo.MainApplication;
import qulei.android.dagger2.demo.component.FragmentComponent;

/**
 * Fragment基础类
 */
public abstract class AbsFragment extends Fragment {

    protected int containerId;  //Fragment所在布局资源ID
    protected AppComponent appComponent;
    protected FragmentComponent fragmentComponent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Activity activity = getActivity();
        if (activity instanceof AbsActivity) {
            containerId = ((AbsActivity) activity).getContainerId();
        }

        Application app = activity.getApplication();
        if (app instanceof MainApplication) {
            MainApplication mainApp = (MainApplication) activity.getApplication();
            appComponent = mainApp.getAppComponent();
            fragmentComponent = mainApp.getFragmentComponent();
        }

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        inject(appComponent);
        inject(fragmentComponent);
    }

    protected void inject(AppComponent appComponent) {

    }

    protected void inject(FragmentComponent fragmentComponent) {

    }

    /**
     * Fragment所在布局资源ID
     */
    protected int getContainerId() {
        return containerId;
    }

    /**
     * 返回
     */
    protected void goBack() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            getActivity().finish();
        }
    }

}
