package b.h.i;

import android.util.Log;
import java.io.Writer;

public class b extends Writer {

    /* renamed from: a  reason: collision with root package name */
    private final String f2513a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f2514b = new StringBuilder(128);

    public b(String str) {
        this.f2513a = str;
    }

    private void a() {
        if (this.f2514b.length() > 0) {
            Log.d(this.f2513a, this.f2514b.toString());
            StringBuilder sb = this.f2514b;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == 10) {
                a();
            } else {
                this.f2514b.append(c2);
            }
        }
    }
}
