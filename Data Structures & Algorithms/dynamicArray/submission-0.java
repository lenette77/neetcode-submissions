class DynamicArray {
    int[] myArray;
    int cap;
    int length;
    public DynamicArray(int capacity) {
        myArray = new int[capacity];
        cap = capacity;
        length = 0;
    }

    public int get(int i) {
        return myArray[i];
    }

    public void set(int i, int n) {
        myArray[i] = n;
    }

    public void pushback(int n) {
        if(length == cap){
            resize();
        }
        myArray[length] = n;
        length++;
    }

    public int popback() {
        length--;
        return myArray[length];
    }

    private void resize() {
        int[] doubleArray = new int[cap*2];
        for(int i=0; i<length; i++){
            doubleArray[i] = myArray[i];
        }
        cap = cap * 2;
        myArray = doubleArray;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return cap;
    }
}
