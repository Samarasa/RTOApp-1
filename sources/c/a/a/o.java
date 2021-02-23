package c.a.a;

import c.a.a.g.b.a;
import c.a.a.g.b.c;
import c.a.a.o;

public abstract class o<CHILD extends o<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private c<? super TranscodeType> f3683a = a.a();

    /* access modifiers changed from: package-private */
    public final c<? super TranscodeType> a() {
        return this.f3683a;
    }

    public final CHILD clone() {
        try {
            return (o) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }
}
