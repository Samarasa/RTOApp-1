package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Cda;
import com.google.android.gms.internal.ads.Eda;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Cda<MessageType extends Cda<MessageType, BuilderType>, BuilderType extends Eda<MessageType, BuilderType>> implements C1872ifa {
    protected int zziij = 0;

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        Aea.a(iterable);
        if (iterable instanceof Pea) {
            List<?> r = ((Pea) iterable).r();
            Pea pea = (Pea) list;
            int size = list.size();
            for (Object next : r) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(pea.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = pea.size() - 1; size2 >= size; size2--) {
                        pea.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof Lda) {
                    pea.a((Lda) next);
                } else {
                    pea.add((String) next);
                }
            }
        } else if (iterable instanceof C2652tfa) {
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

    public final byte[] f() {
        try {
            byte[] bArr = new byte[c()];
            C1658fea a2 = C1658fea.a(bArr);
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

    public final Lda g() {
        try {
            Uda l = Lda.l(c());
            a(l.b());
            return l.a();
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

    /* access modifiers changed from: package-private */
    public int h() {
        throw new UnsupportedOperationException();
    }
}
