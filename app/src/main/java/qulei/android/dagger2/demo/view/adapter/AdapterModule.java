package qulei.android.dagger2.demo.view.adapter;

import dagger.Module;
import dagger.Provides;
import qulei.android.dagger2.demo.MainApplication;

@Module
public class AdapterModule {

    @Provides
    public MessageAdapter provideMessageAdapter(MainApplication application) {
        return new MessageAdapter(application);
    }

}
