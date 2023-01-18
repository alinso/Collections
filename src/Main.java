public class Main {


    public static void main(String[] args) {
        ListEx listEx = new ListEx();

        listEx.unordered();
        listEx.arrayListnotSyncronized();
        listEx.arrayListVsLinkedList();
        listEx.vector();
        listEx.stack();

        QueueEx queueEx = new QueueEx();
        queueEx.priorityQueue();
        queueEx.arrayDeQueue();

        SetEx setEx = new SetEx();
        setEx.hashSet();
        setEx.linkedHashSet();

    }
}
