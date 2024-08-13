import java.util.ArrayList;

public interface InterfaceDao <T> {
    public void create(T t);
    public T readById(int id);
    public ArrayList<T> readAll();
    public void update(T t, int id);
    public void deleteById(int id);
}
