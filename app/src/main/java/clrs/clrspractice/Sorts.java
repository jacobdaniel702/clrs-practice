package clrs.clrspractice;

/**
 * Created by jacob on 1/15/2017.
 */

public class Sorts<T extends Comparable> {

    public void HeapSort(Heap<T> heap){
        for(int i = heap.getHeapSize()-1; i >= 1; i--){
            T temp = heap.getNodeValue(0);
            heap.setNodeValue(0, heap.getNodeValue(i));
            heap.setNodeValue(i,temp);
            heap.setHeapSize(heap.getHeapSize()-1);
            heap.MaxHeapify(0);
        }
    }
}
