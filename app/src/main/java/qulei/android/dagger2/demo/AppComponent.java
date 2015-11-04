package qulei.android.dagger2.demo;

import javax.inject.Singleton;

import dagger.Component;
import qulei.android.dagger2.demo.provider.ProviderCage;
import qulei.android.dagger2.demo.provider.ProviderModule;
import qulei.android.dagger2.demo.view.adapter.AdapterCage;
import qulei.android.dagger2.demo.view.adapter.AdapterModule;

@Singleton
@Component(
        modules = {
                AppModule.class,
                ProviderModule.class,
                AdapterModule.class
        }
)
public interface AppComponent extends ProviderCage, AdapterCage {

    void inject(MainApplication app);

    MainApplication getApp();

}