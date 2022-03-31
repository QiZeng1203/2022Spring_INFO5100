import java.util.LinkedList;
import java.util.Queue;

public class ThreadSafeQueue<T> {

    Queue<T> queue;
    public Object obj = new Object();

    public ThreadSafeQueue() {
        queue = new LinkedList<>();
    }

    public void add(T data) {
        synchronized (obj) {
            queue.add(data);
        }
    }

    public T remove() {
        synchronized (obj) {
            return queue.remove();
        }
    }

    public T peek() {
        synchronized (obj) {
            return queue.peek();
        }
    }

    public boolean isEmpty() {
        synchronized (obj) {
            return queue.isEmpty();
        }
    }

}
