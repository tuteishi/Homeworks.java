package homework7Collections;

import java.util.*;

public  class MyArrayList<T> implements MyList <T> {
    private int count = 0;
    private Object [] elements = new Object[10];

    @Override
    public int size(){
        count = 0;
        for (Object object : elements) {
            if (object != null){
                count++;
            }
        }
        if (count == elements.length){
            elements = Arrays.copyOf(elements, (int) Math.round(elements.length * 1.5));
        }
        return count;
    }

    @Override
    public boolean isEmpty(){
        size ();
        if (count > 0){
            return true;
        }else return false;
    }

    @Override
    public boolean contains(Object value){
        count = 0;
        for (Object element : elements) {
            if (Objects.equals(element, value)){
                count++;
            }
        } if (count > 0 ){
            return true;
        }else return false;
    }

    @Override
    public boolean add(T value){
        count = 0;
        if (size() <= 9) {
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == null) {
                    elements[i] = value;
                    count++;
                    break;
                }
            }
        }else {
            for (int i = 10; i < elements.length; i++) {
                if (elements [i] == null) {
                    elements[i] = value;
                    count++;
                    break;
                }
            }
        }
        if(count > 0){
            elements = Arrays.copyOf(elements, size());
            return true;
        }else return false;
    }

    @Override
    public boolean add(int index, T value){
        count = 0;
            for (int i = 0; i < elements.length; i++) {
                if (i == index) {
                    elements = Arrays.copyOf(elements,  elements.length +1);
                    System.arraycopy(elements,i,elements,i+1,elements.length-i-1);
                    elements [i] = value;
                    count++;
                    break;
                }
            }

        if(count > 0){
            elements = Arrays.copyOf(elements, size());
            return true;
        }else return false;
    }

    @Override
    public boolean remove(Object value){
        count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (Objects.equals(elements [i], value)){
                System.arraycopy(elements,i+1,elements,i,elements.length-i-1);
                elements [elements.length-1] = null;
                count ++;
            }
        }
        if(count > 0){
            elements = Arrays.copyOf(elements, size());
            return true;
        }else return false;
    }

    @Override
    public T get(int index){
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                return (T) elements [i];
            }
            elements = Arrays.copyOf(elements, size());

        }
        return null;
    }

    @Override
    public T remove(int index){
        Object a = null;
        for (int i = 0; i < elements.length; i++) {
            if (i == index){
                a = (T) elements [i];
                System.arraycopy(elements,i+1,elements,i,elements.length-i-1);
                elements [elements.length-1] = null;
                break;
            }
        }
        elements = Arrays.copyOf(elements, size());
        return (T) a;
    }

    @Override
    public T set(int index, T value) {
        elements[index] = value;
        elements = Arrays.copyOf(elements, size());
        return (T) elements[index];
    }

    @Override
    public int indexOf(Object value){
        for (int i = 0; i < elements.length; i++) {
            if(elements [i] == value){
                return i;
            }
            elements = Arrays.copyOf(elements, size());
        }
        return -1;
    }

    public MyArrayList() {
    }

    public MyArrayList(int capacity) {
        this.elements = new Object[capacity];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}