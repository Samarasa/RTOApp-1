package c.a.a.c.b;

import c.a.a.c.b.b.a;
import c.a.a.c.d;
import c.a.a.c.k;
import java.io.File;

/* renamed from: c.a.a.c.b.f  reason: case insensitive filesystem */
class C0234f<DataType> implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final d<DataType> f3145a;

    /* renamed from: b  reason: collision with root package name */
    private final DataType f3146b;

    /* renamed from: c  reason: collision with root package name */
    private final k f3147c;

    C0234f(d<DataType> dVar, DataType datatype, k kVar) {
        this.f3145a = dVar;
        this.f3146b = datatype;
        this.f3147c = kVar;
    }

    public boolean a(File file) {
        return this.f3145a.a(this.f3146b, file, this.f3147c);
    }
}
