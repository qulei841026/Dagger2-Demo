package qulei.android.dagger2.annotation.qualifier;

import dagger.Component;

@Component(modules = UserModule.class)
interface QualifierComponent {
    void inject(QualifierMain main);
}
