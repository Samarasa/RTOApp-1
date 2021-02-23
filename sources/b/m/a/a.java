package b.m.a;

import androidx.lifecycle.E;
import androidx.lifecycle.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends k & E> a a(T t) {
        return new b(t, ((E) t).getViewModelStore());
    }

    public abstract void a();

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
