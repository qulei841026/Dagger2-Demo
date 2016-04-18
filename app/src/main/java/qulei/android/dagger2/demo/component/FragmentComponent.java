package qulei.android.dagger2.demo.component;

import dagger.Component;
import qulei.android.dagger2.demo.AppComponent;
import qulei.android.dagger2.demo.main.RegisterFragment;
import qulei.android.dagger2.demo.processor.LoginModule;

@PreScope
@Component(
        dependencies = AppComponent.class
)
public interface FragmentComponent {

    void inject(RegisterFragment fragment);

    LoginSubComponent loginComponent(LoginModule loginModule);


    //    void inject(XXXFragment fragment);

}
