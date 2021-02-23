package c.b.b.b.d.f;

import c.b.b.b.d.f.Xa;
import c.b.b.b.d.f.Ya;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Xa<MessageType extends Xa<MessageType, BuilderType>, BuilderType extends Ya<MessageType, BuilderType>> implements C0445wc {
    protected int zza = 0;

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        Nb.a(iterable);
        if (iterable instanceof C0307cc) {
            List<?> b2 = ((C0307cc) iterable).b();
            C0307cc ccVar = (C0307cc) list;
            int size = list.size();
            for (Object next : b2) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(ccVar.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = ccVar.size() - 1; size2 >= size; size2--) {
                        ccVar.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof C0320eb) {
                    ccVar.a((C0320eb) next);
                } else {
                    ccVar.add((String) next);
                }
            }
        } else if (iterable instanceof Hc) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    public final C0320eb d() {
        try {
            C0375mb h2 = C0320eb.h(f());
            a(h2.b());
            return h2.a();
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public final byte[] g() {
        try {
            byte[] bArr = new byte[f()];
            C0437vb a2 = C0437vb.a(bArr);
            a(a2);
            a2.b();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public int h() {
        throw new UnsupportedOperationException();
    }
}
