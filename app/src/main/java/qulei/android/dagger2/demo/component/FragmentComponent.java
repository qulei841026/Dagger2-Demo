package qulei.android.dagger2.demo.component;


import dagger.Component;
import qulei.android.dagger2.demo.AppComponent;
import qulei.android.dagger2.demo.main.RegisterFragment;

@PreScope
@Component(
        dependencies = AppComponent.class
)
public interface FragmentComponent {

    void inject(RegisterFragment fragment);

    //    void inject(XXXFragment fragment);

}
