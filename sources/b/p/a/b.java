package b.p.a;

import android.database.Cursor;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

public interface b extends Closeable {
    Cursor a(e eVar);

    void b(String str);

    f c(String str);

    Cursor d(String str);

    String getPath();

    boolean isOpen();

    void k();

    List<Pair<String, String>> m();

    void o();

    void p();

    boolean q();
}
