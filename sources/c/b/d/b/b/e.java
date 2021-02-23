package c.b.d.b.b;

import android.util.Base64;
import android.util.JsonWriter;
import c.b.d.b.c;
import c.b.d.b.d;
import c.b.d.b.f;
import c.b.d.b.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

final class e implements c.b.d.b.e, g {

    /* renamed from: a  reason: collision with root package name */
    private e f4916a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4917b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f4918c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, d<?>> f4919d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f4920e;

    e(Writer writer, Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2) {
        this.f4918c = new JsonWriter(writer);
        this.f4919d = map;
        this.f4920e = map2;
    }

    private void b() {
        if (this.f4917b) {
            e eVar = this.f4916a;
            if (eVar != null) {
                eVar.b();
                this.f4916a.f4917b = false;
                this.f4916a = null;
                this.f4918c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    public e a(int i) {
        b();
        this.f4918c.value((long) i);
        return this;
    }

    public e a(long j) {
        b();
        this.f4918c.value(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    public e a(Object obj) {
        if (obj == null) {
            this.f4918c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f4918c.value((Number) obj);
            return this;
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    a((byte[]) obj);
                    return this;
                }
                this.f4918c.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        this.f4918c.value((long) iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        a(jArr[i]);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        this.f4918c.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        this.f4918c.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i < length5) {
                        a((Object) numberArr[i]);
                        i++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i < length6) {
                        a(objArr[i]);
                        i++;
                    }
                }
                this.f4918c.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f4918c.beginArray();
                for (Object a2 : (Collection) obj) {
                    a(a2);
                }
                this.f4918c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f4918c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        a((String) key, entry.getValue());
                    } catch (ClassCastException e2) {
                        throw new c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                    }
                }
                this.f4918c.endObject();
                return this;
            } else {
                d dVar = this.f4919d.get(obj.getClass());
                if (dVar != null) {
                    this.f4918c.beginObject();
                    dVar.a(obj, this);
                    this.f4918c.endObject();
                    return this;
                }
                f fVar = this.f4920e.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    a(((Enum) obj).name());
                    return this;
                } else {
                    throw new c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
                }
            }
        }
    }

    public e a(String str) {
        b();
        this.f4918c.value(str);
        return this;
    }

    public e a(String str, int i) {
        b();
        this.f4918c.name(str);
        a(i);
        return this;
    }

    public e a(String str, long j) {
        b();
        this.f4918c.name(str);
        a(j);
        return this;
    }

    public e a(String str, Object obj) {
        b();
        this.f4918c.name(str);
        if (obj == null) {
            this.f4918c.nullValue();
            return this;
        }
        a(obj);
        return this;
    }

    public e a(boolean z) {
        b();
        this.f4918c.value(z);
        return this;
    }

    public e a(byte[] bArr) {
        b();
        if (bArr == null) {
            this.f4918c.nullValue();
        } else {
            this.f4918c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        b();
        this.f4918c.flush();
    }
}
