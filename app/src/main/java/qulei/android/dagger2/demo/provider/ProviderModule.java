package qulei.android.dagger2.demo.provider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import qulei.android.dagger2.demo.MainApplication;

@Module
public class ProviderModule {

    @Provides
    public AuthProvider provideAuthProvider(MainApplication application) {
        return new AuthProviderImpl(application);
    }

    @Provides
    @Singleton
    public MessageProvider provideMessageProvider(MainApplication application) {
        return new MessageProviderImpl(application);
    }

}
