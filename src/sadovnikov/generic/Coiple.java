package sadovnikov.generic;

public class Coiple<K, V> {

   private static class Entry<K, V>{

       private Entry[] array = new Entry[10];
       public int size = 0;


       private void put(K key, V value){

       }
       private K key;
       private V value;

       public K getKey() {
           return key;
       }

       public V getValue() {
           return value;
       }

       public void setKey(K key) {
           this.key = key;
       }

       public void setValue(V value) {
           this.value = value;
       }
   }


}
