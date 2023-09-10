package metier;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IMetier <T>{

    public void add(T o);
    public List<T> getAll() throws Exception;
    public T finfById(long id);
    public void delete(long id);
    public void saveAll() throws Exception;

}
