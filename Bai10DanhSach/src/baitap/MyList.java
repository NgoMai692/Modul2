package baitap;

import java.util.Arrays;

public class MyList<E>{
   int size = 0;
   static final int DEFAULT_CAPACITY =10;

   Object elements[];

   public MyList(){
       elements = new Object[DEFAULT_CAPACITY];
   }

   public MyList(int capacity){
       elements = new Object[capacity];
   }

   public void  add(E element){
      if (size == elements.length){
         ensureCapacity();
      }
      elements[size++] = element;
   }
//   public boolean add(E element){
//      if(elements[size] == null){
//         return false;
//      } else {
//         elements[size++] = element;
//         return true;
//      }
//   }

   public E remove(int index){

      for (int i = 0; i < size; i++) {
         if (i>= index)
            elements[i] = elements[i+1];
      }
      return (E) elements;
   }

   public int size(){
      return this.size;
   }

   @Override
   public MyList clone(){
      MyList<Object> newElements= new MyList(elements.length);
      for (Object e: elements) {
         newElements.add(e);
      }
      return newElements;
   }



   public boolean contains(E o){
      for (int i = 0; i < size; i++) {
         if(elements[i] == o)
            return true;
      }
      return false;
   }

   public int indexOf(E o){
      int index = -1;
      for (int i = 0; i < size; i++) {
         if(elements[i] == o)
            index = i;
      }
     return index;
   }


   public void ensureCapacity(){
      int newSize = elements.length*2;
      elements = Arrays.copyOf(elements,newSize);
   }

   public E get(int i){
      if(i >= size || i<0){
         throw new IndexOutOfBoundsException("Index: "+ i + ", Size"+ i);
      }
      return (E) elements[i];
   }


   public void clear(){
      for (int i = 0; i < size; i++) {
         elements[i] = null;
      }
   }
}
