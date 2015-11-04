package qulei.android.dagger2.demo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private MainApplication app;

    public AppModule(MainApplication app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public MainApplication provideApp() {
        return app;
    }

}
