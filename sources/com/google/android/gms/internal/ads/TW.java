package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

public final class TW {

    /* renamed from: a  reason: collision with root package name */
    private final String f8785a;

    private TW(String str) {
        C1434cX.a(str);
        this.f8785a = str;
    }

    public static TW a(String str) {
        return new TW(str);
    }

    private static CharSequence a(Object obj) {
        C1434cX.a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final StringBuilder a(StringBuilder sb, Iterator<?> it) {
        try {
            C1434cX.a(sb);
            if (it.hasNext()) {
                CharSequence a2 = a((Object) it.next());
                while (true) {
                    sb.append(a2);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(this.f8785a);
                    a2 = a((Object) it.next());
                }
            }
            return sb;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
