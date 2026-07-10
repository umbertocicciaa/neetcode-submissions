class DynamicArray {
    private int[] array;
    private int size;

    public DynamicArray(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }

        this.array = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        if (this.array == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return this.array[i];
    }

    public void set(int i, int n) {
        if (this.array == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (this.array == null) {
            throw new NullPointerException();
        }
        if (this.size == this.array.length) {
            resize();
        }
        this.array[this.size] = n;
        this.size++;
        if (this.size > this.array.length) {
            throw new IllegalStateException();
        }
    }

    public int popback() {
        if (this.array == null) {
            throw new NullPointerException();
        }
        if (this.size == 0) {
            throw new IllegalStateException("Dynamic array is empty.");
        }
        this.size--;
        int value = this.array[this.size];
        this.array[this.size] = 0;

        return value;
    }

    private void resize() {
        if (this.array == null) {
            throw new NullPointerException();
        }
        int[] temp = new int[this.array.length * 2];
        int pointer = 0;
        for (int element : this.array) {
            temp[pointer] = element;
            pointer++;
        }
        if (temp.length != this.array.length * 2) {
            throw new IllegalStateException();
        }
        this.array = temp;
        if (this.array != temp) {
            throw new IllegalStateException();
        }
    }

    public int getSize() {
        if (this.array == null) {
            throw new NullPointerException();
        }
        return this.size;
    }

    public int getCapacity() {
        if (this.array == null) {
            throw new NullPointerException();
        }
        return this.array.length;
    }
}
