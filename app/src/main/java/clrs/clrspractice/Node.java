package clrs.clrspractice;

/**
 * Created by jacob on 1/15/2017.
 */

public class Node<T> {

    private T value;

    public Node(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public int Parent(int i){
        return (int) Math.floor((i-1)/2);
    }

    public int Left(int i){
        return 2*i+1;
    }

    public int Right(int i){
        return 2*i+2;
    }
}
