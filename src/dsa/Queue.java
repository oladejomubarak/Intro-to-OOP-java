package dsa;

public class Queue {
    private int lengthOfQueue;
    private String item;
    private String[] queue;
    private int size;
    private int count;
    private int i;
    public Queue(int lengthOfQueue){
        this.lengthOfQueue = lengthOfQueue;
        queue = new String[this.lengthOfQueue];
    }

    public boolean isEmpty() {
        return true;
    }

    public int checkSize() {
        return count;
    }

    public void setLengthOfQueue(int lengthOfQueue) {
        this.lengthOfQueue = lengthOfQueue;
    }

    public int getLengthOfQueue() {
        return lengthOfQueue;
    }

    public void push(String item) {
    queue[count] = item;
    count++;
    }

    public String pop() {
        String item = null;
        count--;
        item = queue[i];
        queue[i] = queue[i + 1];
        i = i + 1;
        if (i == lengthOfQueue) lengthOfQueue = 0;
        return item;
    }

    public String peek() {
        if (queue.length == 0) return null;
        return queue[0];
    }
}
