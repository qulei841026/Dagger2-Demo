package qulei.android.dagger2.demo.main;

import android.os.Bundle;

import qulei.android.dagger2.demo.R;
import qulei.android.dagger2.demo.abs.AbsActivity;

/**
 * 登录LoginActivity
 */
public class LoginActivity extends AbsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(getContainerId(), LoginFragment.getInstance())
                    .commit();
        }
    }

    @Override
    public int getContainerId() {
        return R.id.layoutLoginContainer;
    }

}
