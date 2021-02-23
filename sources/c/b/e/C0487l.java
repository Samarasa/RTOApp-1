package c.b.e;

import c.b.e.C0476a;
import c.b.e.C0485j;
import c.b.e.C0487l;
import c.b.e.C0487l.a;
import c.b.e.C0488m;
import c.b.e.M;
import c.b.e.r;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c.b.e.l  reason: case insensitive filesystem */
public abstract class C0487l<MessageType extends C0487l<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends C0476a<MessageType, BuilderType> {

    /* renamed from: b  reason: collision with root package name */
    protected D f5032b = D.b();

    /* renamed from: c  reason: collision with root package name */
    protected int f5033c = -1;

    /* renamed from: c.b.e.l$a */
    public static abstract class a<MessageType extends C0487l<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends C0476a.C0066a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f5034a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f5035b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f5036c = false;

        protected a(MessageType messagetype) {
            this.f5034a = messagetype;
            this.f5035b = (C0487l) messagetype.a(i.NEW_MUTABLE_INSTANCE);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ C0476a.C0066a a(C0476a aVar) {
            a((C0487l) aVar);
            return this;
        }

        /* access modifiers changed from: protected */
        public BuilderType a(MessageType messagetype) {
            b(messagetype);
            return this;
        }

        public MessageType a() {
            return this.f5034a;
        }

        public BuilderType b(MessageType messagetype) {
            c();
            this.f5035b.a((j) h.f5045a, messagetype);
            return this;
        }

        public MessageType b() {
            if (this.f5036c) {
                return this.f5035b;
            }
            this.f5035b.f();
            this.f5036c = true;
            return this.f5035b;
        }

        public final MessageType build() {
            MessageType b2 = b();
            if (b2.isInitialized()) {
                return b2;
            }
            throw C0476a.C0066a.b(b2);
        }

        /* access modifiers changed from: protected */
        public void c() {
            if (this.f5036c) {
                MessageType messagetype = (C0487l) this.f5035b.a(i.NEW_MUTABLE_INSTANCE);
                messagetype.a((j) h.f5045a, this.f5035b);
                this.f5035b = messagetype;
                this.f5036c = false;
            }
        }

        public BuilderType clone() {
            BuilderType g2 = a().g();
            g2.b(b());
            return g2;
        }
    }

    /* renamed from: c.b.e.l$b */
    protected static class b<T extends C0487l<T, ?>> extends C0477b<T> {

        /* renamed from: b  reason: collision with root package name */
        private T f5037b;

        public b(T t) {
            this.f5037b = t;
        }

        public T a(C0481f fVar, C0483h hVar) {
            return C0487l.a(this.f5037b, fVar, hVar);
        }
    }

    /* renamed from: c.b.e.l$c */
    static class c implements j {

        /* renamed from: a  reason: collision with root package name */
        static final c f5038a = new c();

        /* renamed from: b  reason: collision with root package name */
        static final a f5039b = new a();

        /* renamed from: c.b.e.l$c$a */
        static final class a extends RuntimeException {
            a() {
            }
        }

        private c() {
        }

        public int a(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw f5039b;
        }

        public long a(boolean z, long j, boolean z2, long j2) {
            if (z == z2 && j == j2) {
                return j;
            }
            throw f5039b;
        }

        public D a(D d2, D d3) {
            if (d2.equals(d3)) {
                return d2;
            }
            throw f5039b;
        }

        public C0480e a(boolean z, C0480e eVar, boolean z2, C0480e eVar2) {
            if (z == z2 && eVar.equals(eVar2)) {
                return eVar;
            }
            throw f5039b;
        }

        public C0485j<f> a(C0485j<f> jVar, C0485j<f> jVar2) {
            if (jVar.equals(jVar2)) {
                return jVar;
            }
            throw f5039b;
        }

        public <T> C0488m.a<T> a(C0488m.a<T> aVar, C0488m.a<T> aVar2) {
            if (aVar.equals(aVar2)) {
                return aVar;
            }
            throw f5039b;
        }

        public <T extends r> T a(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw f5039b;
            }
            ((C0487l) t).a(this, (r) t2);
            return t;
        }

        public String a(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw f5039b;
        }

        public boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw f5039b;
        }
    }

    /* renamed from: c.b.e.l$d */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends C0487l<MessageType, BuilderType> implements e<MessageType, BuilderType> {

        /* renamed from: d  reason: collision with root package name */
        protected C0485j<f> f5040d = C0485j.d();

        public /* bridge */ /* synthetic */ r a() {
            return C0487l.super.a();
        }

        /* access modifiers changed from: package-private */
        public final void a(j jVar, MessageType messagetype) {
            C0487l.super.a(jVar, messagetype);
            this.f5040d = jVar.a(this.f5040d, messagetype.f5040d);
        }

        public /* bridge */ /* synthetic */ r.a b() {
            return C0487l.super.b();
        }

        /* access modifiers changed from: protected */
        public final void f() {
            C0487l.super.f();
            this.f5040d.c();
        }
    }

    /* renamed from: c.b.e.l$e */
    public interface e<MessageType extends d<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends s {
    }

    /* renamed from: c.b.e.l$f */
    static final class f implements C0485j.a<f> {

        /* renamed from: a  reason: collision with root package name */
        final int f5041a;

        /* renamed from: b  reason: collision with root package name */
        final M.a f5042b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f5043c;

        public int a() {
            return this.f5041a;
        }

        /* renamed from: a */
        public int compareTo(f fVar) {
            return this.f5041a - fVar.f5041a;
        }

        public r.a a(r.a aVar, r rVar) {
            a aVar2 = (a) aVar;
            aVar2.b((C0487l) rVar);
            return aVar2;
        }

        public boolean f() {
            return this.f5043c;
        }

        public M.a g() {
            return this.f5042b;
        }

        public M.b j() {
            return this.f5042b.a();
        }
    }

    /* renamed from: c.b.e.l$g */
    private static class g implements j {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f5044a;

        private g() {
            this.f5044a = 0;
        }

        /* synthetic */ g(C0486k kVar) {
            this();
        }

        public int a(boolean z, int i, boolean z2, int i2) {
            this.f5044a = (this.f5044a * 53) + i;
            return i;
        }

        public long a(boolean z, long j, boolean z2, long j2) {
            this.f5044a = (this.f5044a * 53) + C0488m.a(j);
            return j;
        }

        public D a(D d2, D d3) {
            this.f5044a = (this.f5044a * 53) + d2.hashCode();
            return d2;
        }

        public C0480e a(boolean z, C0480e eVar, boolean z2, C0480e eVar2) {
            this.f5044a = (this.f5044a * 53) + eVar.hashCode();
            return eVar;
        }

        public C0485j<f> a(C0485j<f> jVar, C0485j<f> jVar2) {
            this.f5044a = (this.f5044a * 53) + jVar.hashCode();
            return jVar;
        }

        public <T> C0488m.a<T> a(C0488m.a<T> aVar, C0488m.a<T> aVar2) {
            this.f5044a = (this.f5044a * 53) + aVar.hashCode();
            return aVar;
        }

        public <T extends r> T a(T t, T t2) {
            this.f5044a = (this.f5044a * 53) + (t != null ? t instanceof C0487l ? ((C0487l) t).a(this) : t.hashCode() : 37);
            return t;
        }

        public String a(boolean z, String str, boolean z2, String str2) {
            this.f5044a = (this.f5044a * 53) + str.hashCode();
            return str;
        }

        public boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f5044a = (this.f5044a * 53) + C0488m.a(z2);
            return z2;
        }
    }

    /* renamed from: c.b.e.l$h */
    protected static class h implements j {

        /* renamed from: a  reason: collision with root package name */
        public static final h f5045a = new h();

        private h() {
        }

        public int a(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        public long a(boolean z, long j, boolean z2, long j2) {
            return z2 ? j2 : j;
        }

        public D a(D d2, D d3) {
            return d3 == D.b() ? d2 : D.a(d2, d3);
        }

        public C0480e a(boolean z, C0480e eVar, boolean z2, C0480e eVar2) {
            return z2 ? eVar2 : eVar;
        }

        public C0485j<f> a(C0485j<f> jVar, C0485j<f> jVar2) {
            if (jVar.a()) {
                jVar = jVar.clone();
            }
            jVar.a(jVar2);
            return jVar;
        }

        public <T> C0488m.a<T> a(C0488m.a<T> aVar, C0488m.a<T> aVar2) {
            int size = aVar.size();
            int size2 = aVar2.size();
            if (size > 0 && size2 > 0) {
                if (!aVar.q()) {
                    aVar = aVar.d(size2 + size);
                }
                aVar.addAll(aVar2);
            }
            return size > 0 ? aVar : aVar2;
        }

        public <T extends r> T a(T t, T t2) {
            if (t == null || t2 == null) {
                return t != null ? t : t2;
            }
            r.a b2 = t.b();
            b2.a(t2);
            return b2.build();
        }

        public String a(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        public boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }
    }

    /* renamed from: c.b.e.l$i */
    public enum i {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: c.b.e.l$j */
    protected interface j {
        int a(boolean z, int i, boolean z2, int i2);

        long a(boolean z, long j, boolean z2, long j2);

        D a(D d2, D d3);

        C0480e a(boolean z, C0480e eVar, boolean z2, C0480e eVar2);

        C0485j<f> a(C0485j<f> jVar, C0485j<f> jVar2);

        <T> C0488m.a<T> a(C0488m.a<T> aVar, C0488m.a<T> aVar2);

        <T extends r> T a(T t, T t2);

        String a(boolean z, String str, boolean z2, String str2);

        boolean a(boolean z, boolean z2, boolean z3, boolean z4);
    }

    private static <T extends C0487l<T, ?>> T a(T t) {
        if (t == null || t.isInitialized()) {
            return t;
        }
        n a2 = t.d().a();
        a2.a(t);
        throw a2;
    }

    static <T extends C0487l<T, ?>> T a(T t, C0481f fVar, C0483h hVar) {
        T t2 = (C0487l) t.a(i.NEW_MUTABLE_INSTANCE);
        try {
            t2.a(i.MERGE_FROM_STREAM, (Object) fVar, (Object) hVar);
            t2.f();
            return t2;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof n) {
                throw ((n) e2.getCause());
            }
            throw e2;
        }
    }

    protected static <T extends C0487l<T, ?>> T a(T t, InputStream inputStream) {
        T a2 = a(t, C0481f.a(inputStream), C0483h.a());
        a(a2);
        return a2;
    }

    protected static <T extends C0487l<T, ?>> T a(T t, byte[] bArr) {
        T a2 = a(t, bArr, C0483h.a());
        a(a2);
        return a2;
    }

    private static <T extends C0487l<T, ?>> T a(T t, byte[] bArr, C0483h hVar) {
        T a2;
        try {
            C0481f a3 = C0481f.a(bArr);
            a2 = a(t, a3, hVar);
            a3.a(0);
            return a2;
        } catch (n e2) {
            e2.a(a2);
            throw e2;
        } catch (n e3) {
            throw e3;
        }
    }

    protected static <E> C0488m.a<E> a(C0488m.a<E> aVar) {
        int size = aVar.size();
        return aVar.d(size == 0 ? 10 : size * 2);
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

    protected static <E> C0488m.a<E> e() {
        return v.d();
    }

    private final void h() {
        if (this.f5032b == D.b()) {
            this.f5032b = D.d();
        }
    }

    /* access modifiers changed from: package-private */
    public int a(g gVar) {
        if (this.f5001a == 0) {
            int a2 = gVar.f5044a;
            int unused = gVar.f5044a = 0;
            a((j) gVar, this);
            this.f5001a = gVar.f5044a;
            int unused2 = gVar.f5044a = a2;
        }
        return this.f5001a;
    }

    public final MessageType a() {
        return (C0487l) a(i.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: protected */
    public Object a(i iVar) {
        return a(iVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object a(i iVar, Object obj) {
        return a(iVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object a(i iVar, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public void a(j jVar, MessageType messagetype) {
        a(i.VISIT, (Object) jVar, (Object) messagetype);
        this.f5032b = jVar.a(this.f5032b, messagetype.f5032b);
    }

    /* access modifiers changed from: protected */
    public boolean a(int i2, C0481f fVar) {
        if (M.b(i2) == 4) {
            return false;
        }
        h();
        return this.f5032b.a(i2, fVar);
    }

    /* access modifiers changed from: package-private */
    public boolean a(c cVar, r rVar) {
        if (this == rVar) {
            return true;
        }
        if (!a().getClass().isInstance(rVar)) {
            return false;
        }
        a((j) cVar, (C0487l) rVar);
        return true;
    }

    public final BuilderType b() {
        BuilderType buildertype = (a) a(i.NEW_BUILDER);
        buildertype.b(this);
        return buildertype;
    }

    public final u<MessageType> c() {
        return (u) a(i.GET_PARSER);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a().getClass().isInstance(obj)) {
            return false;
        }
        try {
            a((j) c.f5038a, (C0487l) obj);
            return true;
        } catch (c.a unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void f() {
        a(i.MAKE_IMMUTABLE);
        this.f5032b.c();
    }

    public final BuilderType g() {
        return (a) a(i.NEW_BUILDER);
    }

    public int hashCode() {
        if (this.f5001a == 0) {
            g gVar = new g((C0486k) null);
            a((j) gVar, this);
            this.f5001a = gVar.f5044a;
        }
        return this.f5001a;
    }

    public final boolean isInitialized() {
        return a(i.IS_INITIALIZED, (Object) Boolean.TRUE) != null;
    }

    public String toString() {
        return t.a(this, super.toString());
    }
}
