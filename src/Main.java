public class Main {

    public static void main(String[] args) {
        ExclusiveQueue queue = new ExclusiveQueue();
        System.out.println(queue.isEmpty());
        queue.add(1);
        System.out.println(queue.isEmpty());
        System.out.println(queue.toString());
        queue.add(2);
        queue.add(3);
        System.out.println(queue.toString());
        queue.remove();
        System.out.println(queue.toString());
        queue.add(4);
        System.out.println(queue.toString());
        queue.remove();
        System.out.println(queue.toString());


    }
}
