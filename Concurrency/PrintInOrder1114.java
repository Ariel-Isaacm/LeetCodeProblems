package Concurrency;

public class PrintInOrder1114 {
    class Foo {
        private int flag = 1;

        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {
            printFirst.run();
            flag = 2;
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (flag != 2) { }
            printSecond.run();
            flag = 3;
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (flag != 3) { }
            printThird.run();
        }
    }
}
