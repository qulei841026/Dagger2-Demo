package qulei.android.dagger2.demo.component;


import dagger.Component;
import qulei.android.dagger2.demo.AppComponent;
import qulei.android.dagger2.demo.main.LoginFragment;
import qulei.android.dagger2.demo.processor.LoginModule;

@PreScope
@Component(
        dependencies = AppComponent.class,  //依赖的桥梁
        modules = LoginModule.class          //关联的依赖
)
public interface LoginComponent {

    void inject(LoginFragment fragment); //使用依赖的类

}
