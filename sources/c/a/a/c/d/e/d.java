package c.a.a.c.d.e;

import android.util.Log;
import c.a.a.c.b.F;
import c.a.a.c.c;
import c.a.a.c.k;
import c.a.a.c.m;
import c.a.a.i.a;
import java.io.File;
import java.io.IOException;

public class d implements m<c> {
    public c a(k kVar) {
        return c.SOURCE;
    }

    public boolean a(F<c> f2, File file, k kVar) {
        try {
            a.a(f2.get().b(), file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            }
            return false;
        }
    }
}
