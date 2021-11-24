package chapterOne.access_modifiers.interfaces;

public class TestIF implements StaticIface {
    public static void main(String[] args) {
        System.out.println(StaticIface.m1());

        new TestIF().go();
//        System.out.println(m1());

    }

    void go() {
        System.out.println(StaticIface.m1());
    }
}
