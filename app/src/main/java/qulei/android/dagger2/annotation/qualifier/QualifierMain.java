package qulei.android.dagger2.annotation.qualifier;

import javax.inject.Inject;


/**
 * 作用域Demo
 */
public class QualifierMain {

    @Inject
    @UserType("Lucy")
    User user1;

    @Inject
    @UserType("Jack")
    User user2;

    private QualifierMain() {
        QualifierComponent component = DaggerQualifierComponent.builder().build();
        component.inject(this);
    }

    private void run() {
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }

    public static void main(String[] args) {
        new QualifierMain().run();
    }


}
