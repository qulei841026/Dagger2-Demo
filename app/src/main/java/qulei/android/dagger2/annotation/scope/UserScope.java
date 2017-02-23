package qulei.android.dagger2.annotation.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;


@Scope
@Retention(RetentionPolicy.RUNTIME)
@interface UserScope {

    /**
     *  same as {@link javax.inject.Singleton }
     */
}
