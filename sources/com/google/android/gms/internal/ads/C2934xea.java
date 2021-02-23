package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.google.android.gms.internal.ads.C2934xea.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.xea  reason: case insensitive filesystem */
public abstract class C2934xea<MessageType extends C2934xea<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends Cda<MessageType, BuilderType> {
    private static Map<Object, C2934xea<?, ?>> zzinq = new ConcurrentHashMap();
    protected Yfa zzino = Yfa.c();
    private int zzinp = -1;

    /* renamed from: com.google.android.gms.internal.ads.xea$a */
    public static abstract class a<MessageType extends C2934xea<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends Eda<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f12783a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f12784b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f12785c = false;

        protected a(MessageType messagetype) {
            this.f12783a = messagetype;
            this.f12784b = (C2934xea) messagetype.a(f.f12790d, (Object) null, (Object) null);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            C2794vfa.a().a(messagetype).a(messagetype, messagetype2);
        }

        private final BuilderType b(byte[] bArr, int i, int i2, C2012kea kea) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            try {
                C2794vfa.a().a(this.f12784b).a(this.f12784b, bArr, 0, i2, new Kda(kea));
                return this;
            } catch (Iea e2) {
                throw e2;
            } catch (IndexOutOfBoundsException unused) {
                throw Iea.a();
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Eda a(Cda cda) {
            a((C2934xea) cda);
            return this;
        }

        public final /* synthetic */ Eda a(byte[] bArr, int i, int i2, C2012kea kea) {
            b(bArr, 0, i2, kea);
            return this;
        }

        public final /* synthetic */ C1872ifa a() {
            return this.f12783a;
        }

        public final BuilderType a(MessageType messagetype) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            a(this.f12784b, messagetype);
            return this;
        }

        public /* synthetic */ Object clone() {
            a aVar = (a) this.f12783a.a(f.f12791e, (Object) null, (Object) null);
            aVar.a((C2934xea) d());
            return aVar;
        }

        /* access modifiers changed from: protected */
        public void h() {
            MessageType messagetype = (C2934xea) this.f12784b.a(f.f12790d, (Object) null, (Object) null);
            a(messagetype, this.f12784b);
            this.f12784b = messagetype;
        }

        /* renamed from: i */
        public MessageType d() {
            if (this.f12785c) {
                return this.f12784b;
            }
            MessageType messagetype = this.f12784b;
            C2794vfa.a().a(messagetype).b(messagetype);
            this.f12785c = true;
            return this.f12784b;
        }

        /* renamed from: j */
        public final MessageType k() {
            MessageType messagetype = (C2934xea) d();
            if (messagetype.i()) {
                return messagetype;
            }
            throw new Wfa(messagetype);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.xea$b */
    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends C2934xea<MessageType, BuilderType> implements C2014kfa {
        protected C2225nea<e> zzinr = C2225nea.f();

        /* access modifiers changed from: package-private */
        public final C2225nea<e> o() {
            if (this.zzinr.b()) {
                this.zzinr = (C2225nea) this.zzinr.clone();
            }
            return this.zzinr;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.xea$c */
    public static class c<T extends C2934xea<T, ?>> extends Gda<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f12786b;

        public c(T t) {
            this.f12786b = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.xea$d */
    public static class d<ContainingType extends C1872ifa, Type> extends C1871iea<ContainingType, Type> {
    }

    /* renamed from: com.google.android.gms.internal.ads.xea$e */
    static final class e implements C2367pea<e> {
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final C2087lga h() {
            throw new NoSuchMethodError();
        }

        public final C2300oga i() {
            throw new NoSuchMethodError();
        }

        public final boolean k() {
            throw new NoSuchMethodError();
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.ads.xea$f */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static final int f12787a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f12788b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f12789c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f12790d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f12791e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f12792f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f12793g = 7;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ int[] f12794h = {f12787a, f12788b, f12789c, f12790d, f12791e, f12792f, f12793g};

        public static int[] a() {
            return (int[]) f12794h.clone();
        }
    }

    protected static Eea a(Eea eea) {
        int size = eea.size();
        return eea.f(size == 0 ? 10 : size << 1);
    }

    protected static <E> Fea<E> a(Fea<E> fea) {
        int size = fea.size();
        return fea.c(size == 0 ? 10 : size << 1);
    }

    private static <T extends C2934xea<T, ?>> T a(T t) {
        if (t == null || t.i()) {
            return t;
        }
        Iea iea = new Iea(new Wfa(t).getMessage());
        iea.a(t);
        throw iea;
    }

    protected static <T extends C2934xea<T, ?>> T a(T t, Lda lda) {
        T b2 = b(t, lda, C2012kea.a());
        a(b2);
        a(b2);
        return b2;
    }

    protected static <T extends C2934xea<T, ?>> T a(T t, Lda lda, C2012kea kea) {
        T b2 = b(t, lda, kea);
        a(b2);
        return b2;
    }

    private static <T extends C2934xea<T, ?>> T a(T t, C1304aea aea, C2012kea kea) {
        T t2 = (C2934xea) t.a(f.f12790d, (Object) null, (Object) null);
        try {
            Cfa a2 = C2794vfa.a().a(t2);
            a2.a(t2, C1517dea.a(aea), kea);
            a2.b(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof Iea) {
                throw ((Iea) e2.getCause());
            }
            Iea iea = new Iea(e2.getMessage());
            iea.a(t2);
            throw iea;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof Iea) {
                throw ((Iea) e3.getCause());
            }
            throw e3;
        }
    }

    protected static <T extends C2934xea<T, ?>> T a(T t, byte[] bArr) {
        T a2 = a(t, bArr, 0, bArr.length, C2012kea.a());
        a(a2);
        return a2;
    }

    private static <T extends C2934xea<T, ?>> T a(T t, byte[] bArr, int i, int i2, C2012kea kea) {
        T t2 = (C2934xea) t.a(f.f12790d, (Object) null, (Object) null);
        try {
            Cfa a2 = C2794vfa.a().a(t2);
            a2.a(t2, bArr, 0, i2, new Kda(kea));
            a2.b(t2);
            if (t2.zziij == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof Iea) {
                throw ((Iea) e2.getCause());
            }
            Iea iea = new Iea(e2.getMessage());
            iea.a(t2);
            throw iea;
        } catch (IndexOutOfBoundsException unused) {
            Iea a3 = Iea.a();
            a3.a(t2);
            throw a3;
        }
    }

    protected static <T extends C2934xea<T, ?>> T a(T t, byte[] bArr, C2012kea kea) {
        T a2 = a(t, bArr, 0, bArr.length, kea);
        a(a2);
        return a2;
    }

    static <T extends C2934xea<?, ?>> T a(Class<T> cls) {
        T t = (C2934xea) zzinq.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C2934xea) zzinq.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (C2934xea) ((C2934xea) C1308aga.a(cls)).a(f.f12792f, (Object) null, (Object) null);
            if (t != null) {
                zzinq.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static Object a(C1872ifa ifa, String str, Object[] objArr) {
        return new C2936xfa(ifa, str, objArr);
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static <T extends C2934xea<?, ?>> void a(Class<T> cls, T t) {
        zzinq.put(cls, t);
    }

    protected static final <T extends C2934xea<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(f.f12787a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean a2 = C2794vfa.a().a(t).a(t);
        if (z) {
            t.a(f.f12788b, (Object) a2 ? t : null, (Object) null);
        }
        return a2;
    }

    private static <T extends C2934xea<T, ?>> T b(T t, Lda lda, C2012kea kea) {
        T a2;
        try {
            C1304aea g2 = lda.g();
            a2 = a(t, g2, kea);
            g2.a(0);
            return a2;
        } catch (Iea e2) {
            e2.a(a2);
            throw e2;
        } catch (Iea e3) {
            throw e3;
        }
    }

    protected static Eea l() {
        return C3005yea.d();
    }

    protected static Gea m() {
        return Xea.d();
    }

    protected static <E> Fea<E> n() {
        return C2723ufa.d();
    }

    public final /* synthetic */ C1872ifa a() {
        return (C2934xea) a(f.f12792f, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        this.zzinp = i;
    }

    public final void a(C1658fea fea) {
        C2794vfa.a().a(this).a(this, (C2583sga) C1800hea.a(fea));
    }

    public final /* synthetic */ C1802hfa b() {
        a aVar = (a) a(f.f12791e, (Object) null, (Object) null);
        aVar.a(this);
        return aVar;
    }

    public final int c() {
        if (this.zzinp == -1) {
            this.zzinp = C2794vfa.a().a(this).c(this);
        }
        return this.zzinp;
    }

    public final /* synthetic */ C1802hfa e() {
        return (a) a(f.f12791e, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C2794vfa.a().a(this).b(this, (C2934xea) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        return this.zzinp;
    }

    public int hashCode() {
        int i = this.zziij;
        if (i != 0) {
            return i;
        }
        this.zziij = C2794vfa.a().a(this).d(this);
        return this.zziij;
    }

    public final boolean i() {
        return a(this, Boolean.TRUE.booleanValue());
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends C2934xea<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType j() {
        return (a) a(f.f12791e, (Object) null, (Object) null);
    }

    public final BuilderType k() {
        BuilderType buildertype = (a) a(f.f12791e, (Object) null, (Object) null);
        buildertype.a(this);
        return buildertype;
    }

    public String toString() {
        return C1943jfa.a(this, super.toString());
    }
}
