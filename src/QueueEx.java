public class QueueEx {


    public QueueEx(){
        System.out.println("\n -----------QUEUE------------");
        System.out.println("\n first in-first out, ordered");
    }


    public void priorityQueue(){
        System.out.println("\n -- PriorityQueue implements the Queue interface. " +
                "It holds the elements by their priorities. PriorityQueue doesn't allow null values to be stored in the queue.");
    }

    public void arrayDeQueue(){
        System.out.println("\n -- ArrayDeque class implements the Deque interface. Unlike queue, we can add or delete the elements from both the ends.\n" +
                "ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.");
    }

}
