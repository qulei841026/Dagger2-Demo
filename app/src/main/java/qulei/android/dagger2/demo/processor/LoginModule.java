package qulei.android.dagger2.demo.processor;

import dagger.Module;
import dagger.Provides;
import qulei.android.dagger2.demo.MainApplication;
import qulei.android.dagger2.demo.provider.AuthProvider;
import qulei.android.dagger2.demo.provider.MessageProvider;


@Module
public class LoginModule {

    private LoginListener loginListener;

    public LoginModule(LoginListener listener) {
        this.loginListener = listener;
    }

    @Provides
    public LoginListener provideLoginListener() {
        return loginListener;
    }

    @Provides
    public LoginProcessor provideLoginProcessor(MainApplication application,
                                                LoginListener loginListener,
                                                AuthProvider authProvider,
                                                MessageProvider messageProvider) {
        LoginProcessorImpl impl = new LoginProcessorImpl(application, loginListener);
        impl.setAuthProvider(authProvider);
        impl.setMessageProvider(messageProvider);
        return impl;
    }

}
