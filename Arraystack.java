import java.util.IllegalFormatCodePointException;

/**
 * Created by LENOVO ALMAZEN on 24/01/2022.
 */
public class Arraystack<E> implements stack<E> {

    E data[];
    static final int CAPACITY=100;
    int t=-1;

    public Arraystack(int c) {
        data=(E[])new Object[c];
    }





    public Arraystack(){
        this(CAPACITY);
    }

    @Override
    public boolean isempty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E elment) {
if (size()==data.length)
    throw new IllegalStateException("stack is full");
        data[++t]=elment;

    }

    @Override
    public E pop() {
      if(isempty())  return null;
        E x=data[t];
        data[t]=null;
        t--;
        return x;
    }

    @Override
    public E top() {
        if(isempty())  return null;
        return data[t];
    }
}
