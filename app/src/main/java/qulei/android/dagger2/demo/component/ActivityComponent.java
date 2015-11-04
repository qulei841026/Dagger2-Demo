package qulei.android.dagger2.demo.component;

import dagger.Component;
import qulei.android.dagger2.demo.AppComponent;
import qulei.android.dagger2.demo.main.MainActivity;

@PreScope
@Component(
        dependencies = AppComponent.class
)
public interface ActivityComponent {

    void inject(MainActivity activity);

    //    void inject(XXXActivity activity);
}
