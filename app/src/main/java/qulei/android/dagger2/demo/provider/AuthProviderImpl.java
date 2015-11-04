package qulei.android.dagger2.demo.provider;

import android.content.Context;

class AuthProviderImpl implements AuthProvider {

    Context mContext;

    public AuthProviderImpl(Context context) {
        this.mContext = context;
    }


    @Override
    public void login() {

    }

    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public void register(String email, String password, OnRegisterMessageListener listener) {
        if (listener != null) {
            listener.onSuccess();
        }

    }
}
