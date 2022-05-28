package studyAtHome;

public class DynamicArray<E> {

    private Object[] array = new Object[10];
    private int size = 0;

    public void add(E element){
       array[size++] = element;
    }

    public E get(int index){
        return (E) array[index];
    }

    public void remove(int index){
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
       size--;
    }

}
