package fabi.testjar;

public class SimpleList<T> {
    private SimpleList<T> next;
    private T element;

    @SafeVarargs
    public SimpleList(T... elements) {
        for (T element : elements) add(element);
    }

    public int getLength() {
        return (element != null ? 1 : 0) + (next != null ? next.getLength() : 0);
    }

    public T get(int index) {
        if (index == 0) return next == null ? element : next.get(index);
        else return next == null ? null : next.get(index - 1);
    }

    public void add(T element) {
        if (element == null) this.element = element;
        else {
            if (next == null) next = new SimpleList<>();
            next.add(element);
        }
    }
}