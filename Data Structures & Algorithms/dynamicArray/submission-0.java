class DynamicArray {
    private int[] arr; 
    private boolean[] filled; 
    private int capacity; 

    public DynamicArray(int capacity) {
        this.arr = new int[capacity]; 
        this.filled = new boolean[capacity]; 
        this.capacity = capacity; 
    }

    public int get(int i) {
        return arr[i]; 
    }

    public void set(int i, int n) {
        arr[i] = n;
        filled[i] = true; 
    }

    public void pushback(int n) {
        int i = 0; 
        
        if(filled[capacity-1]) {
            //full array, resize and call method again
            this.resize(); 
        }

        while(i < capacity && filled[i]) {
            i++; 
        }

        arr[i] = n; 
        filled[i] = true;
    }

    public int popback() {
        int i = 0; 

        while(i < capacity && filled[i]) {
            i++; 
        }

        filled[i-1] = false;

        return arr[i - 1]; 
    }

    private void resize() {
        int[] newArray = new int[capacity * 2]; 
        boolean[] newFilled = new boolean[capacity * 2]; 

        for(int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
            newFilled[i] = filled[i];  
        }

        this.arr = newArray;
        this.filled = newFilled;
        this.capacity = capacity * 2; 
    }

    public int getSize() {
        int count = 0;

        while(count < capacity && filled[count]) {
            count++;
        }

        return count;
    }

    public int getCapacity() {
        return capacity; 
    }
}
