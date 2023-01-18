import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListEx {



    public void unordered() {

        System.out.println("\n --List keeps the order of inserting, so it is ordered ");
        List nums = new ArrayList();
        nums.add(3);
        nums.add(2);
        nums.add(4);
        nums.add(1);

        System.out.println(nums);
    }

    class ThreadEx extends Thread {

        public ThreadEx(List list) {
            this.nonSyncListToBeAltered = list;
        }

        private List nonSyncListToBeAltered;

        public void run() {
            for (int i = 0; i < 10; i++) {
                nonSyncListToBeAltered.add(i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    private void multiThreadedManipulation(List listEx) {
        ThreadEx t1 = new ThreadEx(listEx);
        ThreadEx t2 = new ThreadEx(listEx);
        ThreadEx t3 = new ThreadEx(listEx);

        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void arrayListnotSyncronized() {
        System.out.println("\n ---List is not sync, corrupted data");
        List listEx = new ArrayList();
        multiThreadedManipulation(listEx);

        System.out.println(listEx);
    }

    public void arrayListVsLinkedList() {
        System.out.println("\n -- ArrayList uses dynamic arrays but LinkedList is a linear data structure where the elements " +
                "are not stored in contiguous " +
                "locations and every element is a separate object with a data part and address part. " +
                "The elements are linked using pointers and addresses. Each element is known as a node. " +
                "Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays,the " +
                "manipulation is fast because no shifting is required.");
    }

    public void vector() {
        System.out.println("\n -- Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However, " +
                "It is synchronized and contains many methods that are not the part of Collection framework.");

        List vectorEx = new Vector();
        multiThreadedManipulation(vectorEx);

        System.out.println(vectorEx);
    }

    public void stack(){
        System.out.println("\n -- The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., " +
                "Stack. The stack contains all of the methods of Vector class and also provides its methods like boolean" +
                " push(), boolean peek(), boolean push(object o), which defines its properties.");
    }

}
