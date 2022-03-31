public class Main {

    public static void main(String[] args) {
	// write your code here
        ThreadSafeQueue<Integer> q = new ThreadSafeQueue<>();

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.queue);
        q.remove();
        System.out.println(q.queue);
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
    }
}
