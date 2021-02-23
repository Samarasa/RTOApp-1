package androidx.work;

import android.annotation.SuppressLint;

public interface l {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a  reason: collision with root package name */
    public static final a.c f2032a = new a.c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final a.b f2033b = new a.b();

    public static abstract class a {

        /* renamed from: androidx.work.l$a$a  reason: collision with other inner class name */
        public static final class C0025a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f2034a;

            public C0025a(Throwable th) {
                this.f2034a = th;
            }

            public Throwable a() {
                return this.f2034a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f2034a.getMessage()});
            }
        }

        public static final class b extends a {
            private b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends a {
            private c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        a() {
        }
    }
}
