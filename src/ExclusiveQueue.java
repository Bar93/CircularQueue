import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class ExclusiveQueue implements java.util.Queue {

    private Stack<Integer> queue;

    public ExclusiveQueue() {
        this.queue = new Stack<>();
    }
    public String toString() {
        return "ExclusiveQueue{" +
                "queue=" + queue +
                '}';
    }

    public boolean add(Integer o) {
        boolean ans;
        int size = this.queue.size();
        Stack<Integer> tempQueue = new Stack<>();
        if (this.queue.isEmpty()){
            this.queue.push(o);
        }
        else {
            while (!this.queue.isEmpty()){
                tempQueue.push(this.queue.pop());
            }
            tempQueue.push(o);
            while (tempQueue.size()>0){
                this.queue.push(tempQueue.pop());
            }
        }
        if (this.queue.size()-size==1){
            ans = true;
        }
        else {ans = false;}
        return ans;
    }

    public boolean isEmpty() {
        boolean ans;
        if (this.queue.size()>0){
            ans = false;
        }
        else {
            ans = true;
        }
        return ans;
    }
    public Object remove() {
        boolean ans;
        if (this.queue == null) {
            ans = false;
        }
        else {
                this.queue.pop();
                ans = true;
            }
        return ans;
    }


    public boolean add(Object o) {
        return false;
    }

    public boolean offer(Object o) {
        return false;
    }


    public Object poll() {
        return null;
    }


    public Object element() {
        return null;
    }


    public Object peek() {
        return null;
    }


    public int size() {
        return 0;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public void clear() {

    }
}
