import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

    public SetEx(){
        System.out.println("\n -----------SET------------");
        System.out.println("\n -- unordered, duplicate elements not allowed, one null at most");
    }

    public void hashSet(){
        System.out.println("\n -- HashSet represents the collection that uses a hash table for storage");
        HashSet<String> set=new HashSet<String>();
        set.add("aliksan");
        set.add("jack sparrow");
        set.add("aliksan");
        set.add("jack sparrow");

        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void linkedHashSet(){
        System.out.println("\n -- LinkedHashSet class represents the LinkedList implementation of Set Interface");
        System.out.println("\n -- TreeSet class implements the Set interface that uses a tree for storage");
    }
}
