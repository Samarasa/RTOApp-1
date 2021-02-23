package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import c.b.b.b.d.f.Lb.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Lb<MessageType extends Lb<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends Xa<MessageType, BuilderType> {
    private static Map<Object, Lb<?, ?>> zzd = new ConcurrentHashMap();
    protected C0315dd zzb = C0315dd.a();
    private int zzc = -1;

    public static class a<T extends Lb<T, ?>> extends _a<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f4207b;

        public a(T t) {
            this.f4207b = t;
        }
    }

    public static abstract class b<MessageType extends Lb<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends Ya<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f4208a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f4209b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f4210c = false;

        protected b(MessageType messagetype) {
            this.f4208a = messagetype;
            this.f4209b = (Lb) messagetype.a(e.f4214d, (Object) null, (Object) null);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            Fc.a().a(messagetype).b(messagetype, messagetype2);
        }

        private final BuilderType b(byte[] bArr, int i, int i2, C0458yb ybVar) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            try {
                Fc.a().a(this.f4209b).a(this.f4209b, bArr, 0, i2 + 0, new C0313db(ybVar));
                return this;
            } catch (Wb e2) {
                throw e2;
            } catch (IndexOutOfBoundsException unused) {
                throw Wb.a();
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            }
        }

        public final BuilderType a(MessageType messagetype) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            a(this.f4209b, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Ya a(Xa xa) {
            a((Lb) xa);
            return this;
        }

        public final /* synthetic */ Ya a(byte[] bArr, int i, int i2) {
            b(bArr, 0, i2, C0458yb.a());
            return this;
        }

        public final /* synthetic */ Ya a(byte[] bArr, int i, int i2, C0458yb ybVar) {
            b(bArr, 0, i2, ybVar);
            return this;
        }

        public final /* synthetic */ C0445wc a() {
            return this.f4208a;
        }

        public /* synthetic */ Object clone() {
            b bVar = (b) this.f4208a.a(e.f4215e, (Object) null, (Object) null);
            bVar.a((Lb) c());
            return bVar;
        }

        /* access modifiers changed from: protected */
        public void g() {
            MessageType messagetype = (Lb) this.f4209b.a(e.f4214d, (Object) null, (Object) null);
            a(messagetype, this.f4209b);
            this.f4209b = messagetype;
        }

        /* renamed from: h */
        public MessageType c() {
            if (this.f4210c) {
                return this.f4209b;
            }
            MessageType messagetype = this.f4209b;
            Fc.a().a(messagetype).f(messagetype);
            this.f4210c = true;
            return this.f4209b;
        }

        /* renamed from: i */
        public final MessageType j() {
            MessageType messagetype = (Lb) c();
            if (messagetype.j()) {
                return messagetype;
            }
            throw new C0301bd(messagetype);
        }
    }

    static final class c implements Fb<c> {
        public final C0411rd b() {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final boolean e() {
            throw new NoSuchMethodError();
        }

        public final C0432ud l() {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends Lb<MessageType, BuilderType> implements C0459yc {
        protected Db<c> zzc = Db.a();

        /* access modifiers changed from: package-private */
        public final Db<c> o() {
            if (this.zzc.c()) {
                this.zzc = (Db) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* 'enum' modifier removed */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final int f4211a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f4212b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f4213c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f4214d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f4215e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f4216f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f4217g = 7;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ int[] f4218h = {f4211a, f4212b, f4213c, f4214d, f4215e, f4216f, f4217g};
        public static final int i = 1;
        public static final int j = 2;
        private static final /* synthetic */ int[] k = {i, j};
        public static final int l = 1;
        public static final int m = 2;
        private static final /* synthetic */ int[] n = {l, m};

        public static int[] a() {
            return (int[]) f4218h.clone();
        }
    }

    public static class f<ContainingType extends C0445wc, Type> extends C0464zb<ContainingType, Type> {
    }

    static <T extends Lb<?, ?>> T a(Class<T> cls) {
        T t = (Lb) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (Lb) zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (Lb) ((Lb) C0336gd.a(cls)).a(e.f4216f, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <E> Tb<E> a(Tb<E> tb) {
        int size = tb.size();
        return tb.a(size == 0 ? 10 : size << 1);
    }

    protected static Ub a(Ub ub) {
        int size = ub.size();
        return ub.h(size == 0 ? 10 : size << 1);
    }

    protected static Object a(C0445wc wcVar, String str, Object[] objArr) {
        return new Ic(wcVar, str, objArr);
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

    protected static <T extends Lb<?, ?>> void a(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static final <T extends Lb<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(e.f4211a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e2 = Fc.a().a(t).e(t);
        if (z) {
            t.a(e.f4212b, (Object) e2 ? t : null, (Object) null);
        }
        return e2;
    }

    protected static Rb l() {
        return Ob.d();
    }

    protected static Ub m() {
        return C0362kc.d();
    }

    protected static <E> Tb<E> n() {
        return Jc.d();
    }

    public final /* synthetic */ C0445wc a() {
        return (Lb) a(e.f4216f, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        this.zzc = i;
    }

    public final void a(C0437vb vbVar) {
        Fc.a().a(this).a(this, (C0453xd) C0451xb.a(vbVar));
    }

    public final /* synthetic */ C0438vc b() {
        return (b) a(e.f4215e, (Object) null, (Object) null);
    }

    public final /* synthetic */ C0438vc e() {
        b bVar = (b) a(e.f4215e, (Object) null, (Object) null);
        bVar.a(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((Lb) a(e.f4216f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return Fc.a().a(this).a(this, (Lb) obj);
    }

    public final int f() {
        if (this.zzc == -1) {
            this.zzc = Fc.a().a(this).b(this);
        }
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        return this.zzc;
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        this.zza = Fc.a().a(this).c(this);
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends Lb<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType i() {
        return (b) a(e.f4215e, (Object) null, (Object) null);
    }

    public final boolean j() {
        return a(this, Boolean.TRUE.booleanValue());
    }

    public final BuilderType k() {
        BuilderType buildertype = (b) a(e.f4215e, (Object) null, (Object) null);
        buildertype.a(this);
        return buildertype;
    }

    public String toString() {
        return C0452xc.a(this, super.toString());
    }
}
