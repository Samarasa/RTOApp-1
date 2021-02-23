package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.l;
import java.util.List;

public abstract class w {

    public static abstract class a {
        /* access modifiers changed from: package-private */
        public abstract a a(int i);

        public abstract a a(long j);

        public abstract a a(b bVar);

        public abstract a a(r rVar);

        /* access modifiers changed from: package-private */
        public abstract a a(String str);

        public abstract a a(List<u> list);

        public abstract w a();

        public a b(int i) {
            a(i);
            return this;
        }

        public abstract a b(long j);

        public a b(String str) {
            a(str);
            return this;
        }
    }

    public static a a() {
        l.a aVar = new l.a();
        aVar.a(Integer.MIN_VALUE);
        return aVar;
    }
}
