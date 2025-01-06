import java.util.*;
import java.util.function.Predicate;

public class DataPool <T> {
    private List<T> items;

    // Конструктор
    public DataPool() {
        items  = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    // get all elements
    public List<T> getAllItems() {
        return items;
    }

    // filtring
    public List<T> filterItems(Predicate<T> predicate) {
        List<T> filteredItems = new ArrayList<>();
        for (T item : items) {
            if (predicate.test(item)) {
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }

    // sort
    public void sortItems(Comparator<T> comparator) {
        items.sort(comparator);
    }

    // search
    public T findItem(Predicate<T> predicate) {
        for (T item : items) {
            if (predicate.test(item)) {
                return item;
            }
        }
        return null;  // Если элемент не найден
    }
}
