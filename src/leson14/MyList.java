package leson14;

class MyArrayList {
    private int[] elements;
    private int size;
    private int index;
    private static final int DEFAULT_CAPACITY = 16;

    public MyArrayList() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void add(int value) {
        if (index == elements.length) growArray();
        elements[index] = value;
        index++;
        size++;
    }

    public Object get(int index) {
        checkIndex(index);
        return elements[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.index) throw new IllegalArgumentException();
    }

    private void growArray() {
        int[] newArray = new int[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, index - 1);
        elements = newArray;
    }

    public int size() {
        return size;
    }

    public int indexOf(int value) {
        int result = -1;
        for (int i = 0; i < index; i++) {
            if (elements[i] == value) {
                result = i;
                break;
            }
        }
        return result;
    }

    public Object remove(int index) {
        checkIndex(index);
        System.arraycopy(elements, index + 1, elements, index, this.index - index);
        size--;
        this.index--;

        return null;
    }

    public void clear() {
        size = 0;
    }

    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(1);
        myList.add(3);
        myList.add(8);
        myList.add(9);
        System.out.println(myList.size());
        System.out.println(myList.indexOf(1));
        System.out.println(myList.remove(1));
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        myList.clear();
        System.out.println(myList.size);
    }
}
