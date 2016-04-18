package qulei.android.dagger2.demo.component;

import dagger.Subcomponent;
import qulei.android.dagger2.demo.main.LoginFragment;
import qulei.android.dagger2.demo.processor.LoginModule;

@Subcomponent(
        modules = LoginModule.class          //关联的依赖
)
public interface LoginSubComponent {

    void inject(LoginFragment fragment); //使用依赖的类

}
