package qulei.android.dagger2.demo.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import qulei.android.dagger2.demo.R;
import qulei.android.dagger2.demo.abs.AbsFragment;
import qulei.android.dagger2.demo.component.FragmentComponent;
import qulei.android.dagger2.demo.provider.AuthProvider;


/**
 * 登录RegisterFragment
 */
public class RegisterFragment extends AbsFragment implements AuthProvider.OnRegisterMessageListener {

    @Inject
    AuthProvider authProvider;

    public RegisterFragment() {

    }

    @Override
    protected void inject(FragmentComponent fragmentComponent) {
        super.inject(fragmentComponent);
        fragmentComponent.inject(this);
    }

    public static RegisterFragment getInstance() {
        return new RegisterFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_register, container, false);
        final TextView tvRegisterEmail = (TextView) rootView.findViewById(R.id.tvRegisterEmail);
        final TextView tvRegisterPassword = (TextView) rootView.findViewById(R.id.tvRegisterPassword);
        rootView.findViewById(R.id.btnRegisterSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                authProvider.register(tvRegisterEmail.getText().toString(),
                        tvRegisterPassword.getText().toString(), RegisterFragment.this);
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
