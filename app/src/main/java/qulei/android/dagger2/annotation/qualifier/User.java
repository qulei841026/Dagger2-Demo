package qulei.android.dagger2.annotation.qualifier;

class User {

    public int id;
    public String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}' + " / " + super.toString();
    }
}
