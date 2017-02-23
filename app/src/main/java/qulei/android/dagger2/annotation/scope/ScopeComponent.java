package qulei.android.dagger2.annotation.scope;

import dagger.Component;

@UserScope
@Component(modules = UserModule.class)
interface ScopeComponent {
    void inject(ScopeMain main);
}
