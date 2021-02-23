package c.b.e;

import c.b.e.C0476a;
import c.b.e.C0476a.C0066a;
import c.b.e.r;

/* renamed from: c.b.e.a  reason: case insensitive filesystem */
public abstract class C0476a<MessageType extends C0476a<MessageType, BuilderType>, BuilderType extends C0066a<MessageType, BuilderType>> implements r {

    /* renamed from: a  reason: collision with root package name */
    protected int f5001a = 0;

    /* renamed from: c.b.e.a$a  reason: collision with other inner class name */
    public static abstract class C0066a<MessageType extends C0476a<MessageType, BuilderType>, BuilderType extends C0066a<MessageType, BuilderType>> implements r.a {
        protected static C b(r rVar) {
            return new C(rVar);
        }

        /* access modifiers changed from: protected */
        public abstract BuilderType a(MessageType messagetype);

        public BuilderType a(r rVar) {
            if (a().getClass().isInstance(rVar)) {
                a((C0476a) rVar);
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* access modifiers changed from: package-private */
    public C d() {
        return new C(this);
    }
}
