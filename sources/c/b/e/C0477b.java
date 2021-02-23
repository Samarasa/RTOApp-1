package c.b.e;

import c.b.e.r;

/* renamed from: c.b.e.b  reason: case insensitive filesystem */
public abstract class C0477b<MessageType extends r> implements u<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final C0483h f5002a = C0483h.a();

    private MessageType a(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        n a2 = b(messagetype).a();
        a2.a(messagetype);
        throw a2;
    }

    private C b(MessageType messagetype) {
        return messagetype instanceof C0476a ? ((C0476a) messagetype).d() : new C(messagetype);
    }

    public MessageType a(C0480e eVar, C0483h hVar) {
        MessageType b2 = b(eVar, hVar);
        a(b2);
        return b2;
    }

    public MessageType b(C0480e eVar, C0483h hVar) {
        MessageType messagetype;
        try {
            C0481f c2 = eVar.c();
            messagetype = (r) a(c2, hVar);
            c2.a(0);
            return messagetype;
        } catch (n e2) {
            e2.a(messagetype);
            throw e2;
        } catch (n e3) {
            throw e3;
        }
    }
}
