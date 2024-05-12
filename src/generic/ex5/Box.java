package generic.ex5;

public class Box<T> {
    private T vlaue;

    public void set(T value){
        this.vlaue=value;
    }

    public T get(){
        return vlaue;
    }
}
