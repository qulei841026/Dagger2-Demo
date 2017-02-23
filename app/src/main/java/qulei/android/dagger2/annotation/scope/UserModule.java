package qulei.android.dagger2.annotation.scope;

import dagger.Module;
import dagger.Provides;

@Module
class UserModule {

    @Provides
    @UserScope
    User providesUser() {
        return new User();
    }

}
