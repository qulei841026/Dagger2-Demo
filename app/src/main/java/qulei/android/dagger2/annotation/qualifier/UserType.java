package qulei.android.dagger2.annotation.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;


@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@interface UserType {

    String value() default "";

    /**
     *  same as {@link javax.inject.Named }
     */
}
