package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.s  reason: case insensitive filesystem */
public final class C0562s {

    /* renamed from: com.google.android.gms.common.internal.s$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f5991a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f5992b;

        private a(Object obj) {
            C0563t.a(obj);
            this.f5992b = obj;
            this.f5991a = new ArrayList();
        }

        public final a a(String str, Object obj) {
            List<String> list = this.f5991a;
            C0563t.a(str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f5992b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f5991a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f5991a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a a(Object obj) {
        return new a(obj);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
