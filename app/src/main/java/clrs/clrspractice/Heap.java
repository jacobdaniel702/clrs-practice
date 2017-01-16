package clrs.clrspractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jacob on 1/15/2017.
 */

public class Heap<T extends Comparable> {

    private List<Node<T>> nodeList;
    private int heapSize;
    private int heapLength;

    public Heap(T[] a){
        nodeList = new ArrayList<>();
        for (T item:a) {
            nodeList.add(new Node<T>(item));
        }
        heapSize = a.length;
        BuildMaxHeap();
    }

    public void setHeapSize(int size){
        heapSize = size;
    }

    public int getHeapSize(){
        return heapSize;
    }

    public T getNodeValue(int index){
        return nodeList.get(index).getValue();
    }

    public void setNodeValue(int index, T value){
        nodeList.set(index, new Node<T>(value));
    }

    public void MaxHeapify(int i) {
        int largest;
        int l = nodeList.get(i).Left(i);
        int r = nodeList.get(i).Right(i);
        if(l < heapSize && nodeList.get(l).getValue().compareTo(nodeList.get(i).getValue()) > 0)
            largest = l;
        else largest = i;
        if(r < heapSize && nodeList.get(r).getValue().compareTo(nodeList.get(largest).getValue()) > 0)
            largest = r;
        if(largest != i){
            //exchange A[i] with A[largest]
            T temp = nodeList.get(largest).getValue();
            nodeList.get(largest).setValue(nodeList.get(i).getValue());
            nodeList.get(i).setValue(temp);
            MaxHeapify(largest);
        }
    }

    private void BuildMaxHeap(){
        for(int i = (int) Math.floor(nodeList.size()/2); i >= 0; i--){
            MaxHeapify(i);
        }
    }

    public void Print(){
        for(Node item : nodeList){
            System.out.print(item.getValue()+" ");
        }
        System.out.println();
    }
}
