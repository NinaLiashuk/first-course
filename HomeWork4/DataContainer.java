package HomeWork4;
import javax.xml.crypto.Data;
import java.util.*;

public class DataContainer<T> {

    public T getItem() {
        return item;
    }

    public T setItem(T item) {
        return this.item;
    }

    private T item;

    public int index;

    public T[] getData() {
        return data;
    }

    private T[] data;

    public DataContainer(T[] data) {
        if (data == null) {
            throw new IllegalArgumentException("Ошибка");
        }
        this.data = Arrays.copyOf(data, data.length);
    }

    public int add(T item) {
        if (item == null) {
            return -1;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (this.data[i] == null) {
                    this.data[i] = item;
                    return i;
                }
            }
            data = Arrays.copyOf(this.data, this.data.length + 1);
            int index = this.data.length - 1;
            data[index] = item;
            return index;
        }
    }

    public T get(int index) {
        if (index < 0 || index >= data.length) {
            return null;
        }
        return data[index];
    }

    public T[] getItems() {
        return Arrays.copyOf(this.data, this.data.length);
    }

    boolean delete(int index) {
        if (index < 0 || index >= data.length) {
            return false;
        } else {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            this.data = Arrays.copyOf(this.data, this.data.length - 1);
        }
        return true;
    }

    boolean deleteItem(T item) {
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i], item)) {
                for (int j = i; j < data.length - 1; j++) {
                    T n = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = n;
                }
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }
        return false;
    }

    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length - 1; j++) {
                if (comparator.compare(data[i], data[i + 1]) >= 1) {
                    T n = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = n;
                }
            }
        }
    }

    @Override
    public String toString() {
        if (this.data.length == 0) {
            return "DataContainer []";
        }
        StringBuilder result = new StringBuilder();
        boolean needComma = false;
        for (T datum : this.data) {
            if (datum != null) {
                if (!needComma) {
                    needComma = true;
                } else {
                    result.append(", ");
                }
                result.append(datum);
            }
        }
        return "DataContainer [" + result + "]";
    }
}





