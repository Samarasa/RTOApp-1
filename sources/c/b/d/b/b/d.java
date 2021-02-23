package c.b.d.b.b;

import c.b.d.b.f;
import c.b.d.b.g;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class d implements c.b.d.b.a.a<d> {

    /* renamed from: a  reason: collision with root package name */
    private static final f<String> f4910a = a.a();

    /* renamed from: b  reason: collision with root package name */
    private static final f<Boolean> f4911b = b.a();

    /* renamed from: c  reason: collision with root package name */
    private static final a f4912c = new a((c) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, c.b.d.b.d<?>> f4913d = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f4914e = new HashMap();

    private static final class a implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f4915a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);

        static {
            f4915a.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private a() {
        }

        /* synthetic */ a(c cVar) {
            this();
        }

        public void a(Date date, g gVar) {
            gVar.a(f4915a.format(date));
        }
    }

    public d() {
        a(String.class, f4910a);
        a(Boolean.class, f4911b);
        a(Date.class, f4912c);
    }

    public c.b.d.b.a a() {
        return new c(this);
    }

    public <T> d a(Class<T> cls, c.b.d.b.d<? super T> dVar) {
        if (!this.f4913d.containsKey(cls)) {
            this.f4913d.put(cls, dVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }

    public <T> d a(Class<T> cls, f<? super T> fVar) {
        if (!this.f4914e.containsKey(cls)) {
            this.f4914e.put(cls, fVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }
}
