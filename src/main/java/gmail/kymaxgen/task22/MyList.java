package gmail.kymaxgen.task22;

public interface MyList {
    void addFirst(String value);

    void addLast(String value);

    void add(String value, int index);

    String get(int index); // array[index]

    void set(String value, int index);

    String delete(int index);

    int size();
    boolean isEmpty();
}
