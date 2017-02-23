package qulei.android.dagger2.annotation.scope;

import javax.inject.Inject;

/**
 * 作用域Demo
 */
public class ScopeMain {

    @Inject
    User user1;

    @Inject
    User user2;

    private ScopeMain() {
        ScopeComponent component = DaggerScopeComponent.builder().build();
        component.inject(this);
    }

    private void run() {
        System.out.println(user1.toString());
        System.out.println(user2.toString());

    }

    public static void main(String[] args) {
        ScopeMain main = new ScopeMain();
        main.run();
    }


}
