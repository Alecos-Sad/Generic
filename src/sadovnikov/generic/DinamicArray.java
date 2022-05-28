package sadovnikov.generic;

public class DinamicArray<E> {

    private Object[] array = new Object[10];
    private int size = 0;

    public void add(E element) {
        if (array.length == size) {
            Object[] temp = new Object[++size];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            temp[size] = element;
            array = temp;
        } else {
            array[size++] = element;
        }
        array[size++] = element;
    }

    public E get(int index) {
        return (E) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void trimToSize() {
        Object[] temp = new Object[size];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
}
