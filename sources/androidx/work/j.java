package androidx.work;

import android.os.Build;
import androidx.work.q;

public final class j extends q {

    public static final class a extends q.a<a, j> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f2047c.f1893f = OverwritingInputMerger.class.getName();
        }

        /* access modifiers changed from: package-private */
        public j b() {
            if (!this.f2045a || Build.VERSION.SDK_INT < 23 || !this.f2047c.l.h()) {
                return new j(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* access modifiers changed from: package-private */
        public a c() {
            return this;
        }
    }

    j(a aVar) {
        super(aVar.f2046b, aVar.f2047c, aVar.f2048d);
    }
}
