package qulei.android.dagger2.demo.provider;

public interface AuthProvider {

    void login();

    boolean isLogin();

    void register(String email, String password, OnRegisterMessageListener listener);

    interface OnRegisterMessageListener {
        void onSuccess();
    }

}
