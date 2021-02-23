package h;

import java.io.Closeable;
import java.io.Flushable;

public interface v extends Closeable, Flushable {
    void b(e eVar, long j);

    void close();

    void flush();

    y timeout();
}
