import java.util.Iterator;
import java.util.ListIterator;

public class GenericList<T> implements Iterable<T> {
    public T[] items =(T[]) new Object[10];
    private int count;
    public void  add(T item){items[count++]=item;
    }
    public T get(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator <T>{
       private GenericList<T> list;
       private int index;

        public ListIterator(Iterable<T> ts) {
            System.out.println("Some things to Look in to here...");
        }

        //        public void ListIterator(GenericList<T> list){
//    this.list = list;
//       }
        @Override
        public boolean hasNext() {
            return (index <list.count);
        }

        @Override
        public T next() {
            return (list.items[index++]) ;
        }
    }
}
