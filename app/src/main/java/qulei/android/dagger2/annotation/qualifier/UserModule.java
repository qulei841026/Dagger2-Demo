package qulei.android.dagger2.annotation.qualifier;

import dagger.Module;
import dagger.Provides;

@Module
class UserModule {

    @Provides
    @UserType("Jack")
    User provideJack() {
        return new User(1, "Jack");
    }

    @Provides
    @UserType("Lucy")
    User providesLucy() {
        return new User(2, "Lucy");
    }

}
