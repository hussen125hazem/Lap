/**
 * Created by LENOVO ALMAZEN on 24/01/2022.
 */
public interface stack<E> {
    boolean isempty();
    int size();
    void push(E elment);
    E pop();
    E top();
}
