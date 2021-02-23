package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.j;

public abstract class u {

    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(long j);

        public abstract a a(z zVar);

        /* access modifiers changed from: package-private */
        public abstract a a(String str);

        /* access modifiers changed from: package-private */
        public abstract a a(byte[] bArr);

        public abstract u a();

        public abstract a b(long j);

        public abstract a c(long j);
    }

    public static a a(String str) {
        j.a aVar = new j.a();
        aVar.a(Integer.MIN_VALUE);
        aVar.a(str);
        return aVar;
    }

    public static a a(byte[] bArr) {
        j.a aVar = new j.a();
        aVar.a(Integer.MIN_VALUE);
        aVar.a(bArr);
        return aVar;
    }

    public abstract long a();

    public abstract long b();

    public abstract long c();
}
