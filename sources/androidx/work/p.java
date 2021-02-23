package androidx.work;

import android.content.Context;
import androidx.work.impl.m;
import java.util.Collections;
import java.util.List;

public abstract class p {
    protected p() {
    }

    public static p a(Context context) {
        return m.a(context);
    }

    public static void a(Context context, b bVar) {
        m.a(context, bVar);
    }

    public final l a(q qVar) {
        return a((List<? extends q>) Collections.singletonList(qVar));
    }

    public abstract l a(String str);

    public abstract l a(List<? extends q> list);
}
