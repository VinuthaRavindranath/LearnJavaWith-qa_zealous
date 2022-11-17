package Generics;

class Data<T> {
    private T obj;

    public void setData(T v) {
        obj = v;
    }

    public T getData() {
        return obj;
    }

}

public class Lesson3 {
    public static void main(String[] args) {
        Data<Integer> d = new Data<>();
        d.setData(10);
        System.out.println(d.getData());

        Data<String> s = new Data<>();
        s.setData("Hi");
        System.out.println(s.getData());

        Data<Float> f = new Data<>();
        f.setData(123.7f);
        System.out.println(f.getData());
    }
}
