package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.h;

public abstract class r {

    public static abstract class a {
        public abstract a a(C0489a aVar);

        public abstract a a(b bVar);

        public abstract r a();
    }

    public enum b {
        UNKNOWN(0),
        ANDROID(4);

        static {
            UNKNOWN = new b("UNKNOWN", 0, 0);
            ANDROID = new b("ANDROID", 1, 4);
            b[] bVarArr = {UNKNOWN, ANDROID};
        }

        private b(int i) {
        }
    }

    public static a a() {
        return new h.a();
    }
}
