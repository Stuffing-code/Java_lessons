package basic2.java0.execeptions;

import java.io.Closeable;
import java.io.FileNotFoundException;

public interface SwelfCloasable extends Closeable {
    @Override
    void close() throws FileNotFoundException;
}
