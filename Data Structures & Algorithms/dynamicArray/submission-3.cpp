class DynamicArray {
private: 
    int* arr;
    int length; 
    int cap;

public:
    DynamicArray(int capacity) : cap(capacity), length(0){
        arr = new int[capacity];
    }

    int get(int i) {
        return arr[i]; 
    }

    void set(int i, int n) {
        arr[i] = n;
    }

    void pushback(int n) {
        if(length == cap) {
            resize(); 
        }

        arr[length] = n; 
        length++; 
    }

    int popback() {
        if(length > 0) {
            length--; 
            return arr[length]; 
        }
    }

    void resize() {
        cap *= 2; 
        int* temp = new int[cap]; 

        for(int i = 0; i < length; i++) {
            temp[i] = arr[i]; 
        }

        delete[] arr;
        arr = temp;
    }

    int getSize() {
        return length; 
    }

    int getCapacity() {
        return cap; 
    }
};
