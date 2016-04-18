package qulei.android.dagger2.demo.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import qulei.android.dagger2.demo.R;
import qulei.android.dagger2.demo.abs.AbsFragment;
import qulei.android.dagger2.demo.component.FragmentComponent;
import qulei.android.dagger2.demo.processor.LoginListener;
import qulei.android.dagger2.demo.processor.LoginModule;
import qulei.android.dagger2.demo.processor.LoginProcessor;


/**
 * 登录LoginFragment
 */
public class LoginFragment extends AbsFragment implements LoginListener {

    @Inject
    LoginProcessor loginProcessor;

    public LoginFragment() {

    }

    public static LoginFragment getInstance() {
        return new LoginFragment();
    }


    @Override
    protected void inject(FragmentComponent fragmentComponent) {
        super.inject(fragmentComponent);
        fragmentComponent.loginComponent(new LoginModule(this)).inject(this);
    }

//    @Override
//    protected void inject(AppComponent appComponent) {
//        DaggerLoginComponent.builder().appComponent(appComponent)
//                .loginModule(new LoginModule(this))
//                .build().inject(this);
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        rootView.findViewById(R.id.btnLoginSignIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginProcessor.login();
            }
        });

        rootView.findViewById(R.id.btnLoginRegister).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .add(getContainerId(), RegisterFragment.getInstance())
                        .addToBackStack(LoginFragment.class.toString())
                        .hide(LoginFragment.this)
                        .commit();
            }
        });
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onSuccess() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            getActivity().finish();
        }
    }


}
