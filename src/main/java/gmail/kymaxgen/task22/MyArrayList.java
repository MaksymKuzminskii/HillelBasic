package gmail.kymaxgen.task22;

public class MyArrayList implements MyList {

    private static final int INITIAL_CAPACITY = 16;
    private String[] elements = new String[INITIAL_CAPACITY]; // {"qwer", null, null, ... , null}
    private int size = 0;


    @Override
    public void addFirst(String value) {
        resize();
        System.arraycopy(elements, 0, elements, 1, size);
        elements[0] = value;
        size++;
    }

    @Override
    public void addLast(String value) {
        resize();
        elements[size] = value;
        size++;
    }

    private void resize() {
        if(size < elements.length) {
            return;
        }
        String[] tmp = new String[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;

    }

    @Override
    public void add(String value, int index) {
        resize();
        String[] tmp = new String[size - index + 1];
        System.arraycopy(elements, index, tmp, 0, tmp.length);
        elements[index] = value;
        System.arraycopy(tmp, 0, elements, index + 1, tmp.length);
        size++;
    }

    @Override
    public String get(int index) {
        validateIndex(index);
        return elements[index];
    }

    @Override
    public void set(String value, int index) {
        validateIndex(index);
        elements[index] = value;
    }

    private void validateIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Wrong index");
        }
    }

    @Override
    public String delete(int index) {
        String[] tmp = new String[size - index];
        System.arraycopy(elements, index + 1, tmp, 0, tmp.length);
        String deletedValue = elements[index];
        elements[index] = null;
        System.arraycopy(tmp, 0, elements, index, tmp.length);
        size--;
        return deletedValue;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (elements.length == 0) {
            return true;
        }
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += elements[i] + ", ";
        }
        return result;
    }
}
