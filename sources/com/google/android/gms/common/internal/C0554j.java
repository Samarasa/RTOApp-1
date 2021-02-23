package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.internal.j  reason: case insensitive filesystem */
public abstract class C0554j {

    /* renamed from: a  reason: collision with root package name */
    private static int f5974a = 129;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f5975b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static C0554j f5976c;

    /* renamed from: com.google.android.gms.common.internal.j$a */
    protected static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Uri f5977a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

        /* renamed from: b  reason: collision with root package name */
        private final String f5978b;

        /* renamed from: c  reason: collision with root package name */
        private final String f5979c;

        /* renamed from: d  reason: collision with root package name */
        private final ComponentName f5980d = null;

        /* renamed from: e  reason: collision with root package name */
        private final int f5981e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f5982f;

        public a(String str, String str2, int i, boolean z) {
            C0563t.b(str);
            this.f5978b = str;
            C0563t.b(str2);
            this.f5979c = str2;
            this.f5981e = i;
            this.f5982f = z;
        }

        /* JADX WARNING: type inference failed for: r6v6, types: [android.os.Parcelable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final android.content.Intent b(android.content.Context r6) {
            /*
                r5 = this;
                java.lang.String r0 = "ConnectionStatusConfig"
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.lang.String r2 = r5.f5978b
                java.lang.String r3 = "serviceActionBundleKey"
                r1.putString(r3, r2)
                r2 = 0
                android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x001c }
                android.net.Uri r3 = f5977a     // Catch:{ IllegalArgumentException -> 0x001c }
                java.lang.String r4 = "serviceIntentCall"
                android.os.Bundle r6 = r6.call(r3, r4, r2, r1)     // Catch:{ IllegalArgumentException -> 0x001c }
                goto L_0x0040
            L_0x001c:
                r6 = move-exception
                java.lang.String r6 = java.lang.String.valueOf(r6)
                java.lang.String r1 = java.lang.String.valueOf(r6)
                int r1 = r1.length()
                int r1 = r1 + 34
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r1)
                java.lang.String r1 = "Dynamic intent resolution failed: "
                r3.append(r1)
                r3.append(r6)
                java.lang.String r6 = r3.toString()
                android.util.Log.w(r0, r6)
                r6 = r2
            L_0x0040:
                if (r6 != 0) goto L_0x0043
                goto L_0x004c
            L_0x0043:
                java.lang.String r1 = "serviceResponseIntentKey"
                android.os.Parcelable r6 = r6.getParcelable(r1)
                r2 = r6
                android.content.Intent r2 = (android.content.Intent) r2
            L_0x004c:
                if (r2 != 0) goto L_0x006a
                java.lang.String r6 = "Dynamic lookup for intent failed for action: "
                java.lang.String r1 = r5.f5978b
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r3 = r1.length()
                if (r3 == 0) goto L_0x0061
                java.lang.String r6 = r6.concat(r1)
                goto L_0x0067
            L_0x0061:
                java.lang.String r1 = new java.lang.String
                r1.<init>(r6)
                r6 = r1
            L_0x0067:
                android.util.Log.w(r0, r6)
            L_0x006a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0554j.a.b(android.content.Context):android.content.Intent");
        }

        public final Intent a(Context context) {
            if (this.f5978b == null) {
                return new Intent().setComponent(this.f5980d);
            }
            Intent b2 = this.f5982f ? b(context) : null;
            return b2 == null ? new Intent(this.f5978b).setPackage(this.f5979c) : b2;
        }

        public final String a() {
            return this.f5979c;
        }

        public final ComponentName b() {
            return this.f5980d;
        }

        public final int c() {
            return this.f5981e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C0562s.a(this.f5978b, aVar.f5978b) && C0562s.a(this.f5979c, aVar.f5979c) && C0562s.a(this.f5980d, aVar.f5980d) && this.f5981e == aVar.f5981e && this.f5982f == aVar.f5982f;
        }

        public final int hashCode() {
            return C0562s.a(this.f5978b, this.f5979c, this.f5980d, Integer.valueOf(this.f5981e), Boolean.valueOf(this.f5982f));
        }

        public final String toString() {
            String str = this.f5978b;
            if (str != null) {
                return str;
            }
            C0563t.a(this.f5980d);
            return this.f5980d.flattenToString();
        }
    }

    public static int a() {
        return f5974a;
    }

    public static C0554j a(Context context) {
        synchronized (f5975b) {
            if (f5976c == null) {
                f5976c = new H(context.getApplicationContext());
            }
        }
        return f5976c;
    }

    public final void a(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        b(new a(str, str2, i, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void b(a aVar, ServiceConnection serviceConnection, String str);
}
