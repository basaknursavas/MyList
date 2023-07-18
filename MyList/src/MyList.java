import java.util.Arrays;
public class MyList<T> {
     int capacity;
    T[] list ;
     int size = 0;

    public MyList() {
        this.capacity = 10;
        this.list = (T[]) new Object[capacity];
    }
    public MyList(int capacity) {
        this.capacity = capacity;
        this.list = (T[]) new Object[capacity];
    }
    public int getCapacity() {
        return capacity;
    }
    public int size() {
        return size;
    }

    public void add(T data) {
        if(size == capacity){

            int newCapacity = capacity * 2;
            list = Arrays.copyOf(list, newCapacity);
            capacity = newCapacity;
        }
        list[size++] = data;
    }

    public T get(int index) {
        if(index < 0 || index >= size) {
            return null;
        }
        return list[index];
    }

    public T remove(int index) {
        if(index < 0 || index >= size)  {
            return null;
        }

        T removed = list[index];
        list[index] = null;
        for (int i = index + 1; i < size; i++) {
            if(list[i] != null) {
                list[i-1] = list[i];
                list[i] = null;
            }
        }
        size--;
        return removed;
    }

    public T set(int index,T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        list[index] = data;
        return data;

    }
    public String toString() {
        String str="";
        for (int i = 0; i < this.list.length ; i++) {
            if(list[i]!=null){
                str=str+this.list[i]+",";
            }
        }
        return str;
    }

    public int indexOf(T data) {
        for (int i = 0; i < list.length; i++) {
            if(data.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = list.length - 1; i >= 0 ; i--) {
            if(data.equals(list[i]))  {
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        int count =0;
        for (int i = 0; i < list.length ; i++) {
            if(list[i]==null){
                count++;
            }
        }
        if(count == list.length){
            return true;
        }
        else{
            return false;
        }
    }

    public T[] toArray() {
        T[] arrayList =(T[]) new Object[getCapacity()];
        for (int i = 0; i < this.list.length; i++) {
            arrayList[i] = list[i];
        }
        return arrayList;
    }

    public void clear() {
        Arrays.fill(list,null);
        size = 0;
    }

    public MyList<T> subList(int start, int finish){
        MyList<T> subList = new MyList<>();
        int index1 = 0;
        for (int index = start; index <= finish; index++) {
            if (index >= 0 && index < list.length) {
                if (list[index] != null) {
                    subList.list[index1] = list[index];
                    index1++;
                }
            }
        }
        return subList;
    }
    public boolean contains(T data) {
        for (Object obj : list) {
            if (data == obj) {
                return true;
            }
        }
        return false;
    }




}
