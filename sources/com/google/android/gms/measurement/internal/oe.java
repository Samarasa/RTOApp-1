package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import c.b.b.b.d.f.C;
import c.b.b.b.d.f.C0291aa;
import c.b.b.b.d.f.C0298ba;
import c.b.b.b.d.f.C0438vc;
import c.b.b.b.d.f.C0458yb;
import c.b.b.b.d.f.D;
import c.b.b.b.d.f.E;
import c.b.b.b.d.f.F;
import c.b.b.b.d.f.G;
import c.b.b.b.d.f.Od;
import c.b.b.b.d.f.Q;
import c.b.b.b.d.f.S;
import c.b.b.b.d.f.T;
import c.b.b.b.d.f.V;
import c.b.b.b.d.f.W;
import c.b.b.b.d.f.X;
import c.b.b.b.d.f.Z;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class oe extends C3158he {
    oe(C3176ke keVar) {
        super(keVar);
    }

    static int a(X.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.o(); i++) {
            if (str.equals(aVar.d(i).q())) {
                return i;
            }
        }
        return -1;
    }

    static V a(T t, String str) {
        for (V next : t.o()) {
            if (next.o().equals(str)) {
                return next;
            }
        }
        return null;
    }

    static <Builder extends C0438vc> Builder a(Builder builder, byte[] bArr) {
        C0458yb b2 = C0458yb.b();
        if (b2 != null) {
            builder.a(bArr, b2);
            return builder;
        }
        builder.a(bArr);
        return builder;
    }

    private static String a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List<Long> a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    static void a(T.a aVar, String str, Object obj) {
        List<V> k = aVar.k();
        int i = 0;
        while (true) {
            if (i >= k.size()) {
                i = -1;
                break;
            } else if (str.equals(k.get(i).o())) {
                break;
            } else {
                i++;
            }
        }
        V.a v = V.v();
        v.a(str);
        if (obj instanceof Long) {
            v.a(((Long) obj).longValue());
        } else if (obj instanceof String) {
            v.b((String) obj);
        } else if (obj instanceof Double) {
            v.a(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            aVar.a(i, v);
        } else {
            aVar.a(v);
        }
    }

    private static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private final void a(StringBuilder sb, int i, D d2) {
        if (d2 != null) {
            a(sb, i);
            sb.append("filter {\n");
            if (d2.s()) {
                a(sb, i, "complement", (Object) Boolean.valueOf(d2.t()));
            }
            a(sb, i, "param_name", (Object) e().b(d2.u()));
            int i2 = i + 1;
            G p = d2.p();
            if (p != null) {
                a(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (p.o()) {
                    a(sb, i2, "match_type", (Object) p.p().name());
                }
                a(sb, i2, "expression", (Object) p.r());
                if (p.s()) {
                    a(sb, i2, "case_sensitive", (Object) Boolean.valueOf(p.t()));
                }
                if (p.v() > 0) {
                    a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String append : p.u()) {
                        a(sb, i2 + 2);
                        sb.append(append);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                a(sb, i2);
                sb.append("}\n");
            }
            a(sb, i2, "number_filter", d2.r());
            a(sb, i);
            sb.append("}\n");
        }
    }

    private final void a(StringBuilder sb, int i, String str, E e2) {
        if (e2 != null) {
            a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (e2.o()) {
                a(sb, i, "comparison_type", (Object) e2.p().name());
            }
            if (e2.q()) {
                a(sb, i, "match_as_float", (Object) Boolean.valueOf(e2.r()));
            }
            a(sb, i, "comparison_value", (Object) e2.t());
            a(sb, i, "min_comparison_value", (Object) e2.v());
            a(sb, i, "max_comparison_value", (Object) e2.x());
            a(sb, i);
            sb.append("}\n");
        }
    }

    private static void a(StringBuilder sb, int i, String str, Z z, String str2) {
        if (z != null) {
            a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (z.r() != 0) {
                a(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long next : z.q()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (z.p() != 0) {
                a(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long next2 : z.o()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (z.t() != 0) {
                a(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (S next3 : z.s()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next3.o() ? Integer.valueOf(next3.p()) : null);
                    sb.append(":");
                    sb.append(next3.q() ? Long.valueOf(next3.r()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (z.v() != 0) {
                a(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C0291aa next4 : z.u()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next4.o() ? Integer.valueOf(next4.p()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : next4.q()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            a(sb, 3);
            sb.append("}\n");
        }
    }

    private static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    static boolean a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean a(List<Long> list, int i) {
        if (i >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
    }

    static Object b(T t, String str) {
        V a2 = a(t, str);
        if (a2 == null) {
            return null;
        }
        if (a2.p()) {
            return a2.q();
        }
        if (a2.r()) {
            return Long.valueOf(a2.s());
        }
        if (a2.t()) {
            return Double.valueOf(a2.u());
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final long a(byte[] bArr) {
        C0563t.a(bArr);
        k().c();
        MessageDigest v = se.v();
        if (v != null) {
            return se.a(v.digest(bArr));
        }
        h().t().a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        h().t().a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.Bb r5 = r4.h()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.Db r5 = r5.t()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.oe.a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    public final String a(C c2) {
        if (c2 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (c2.o()) {
            a(sb, 0, "filter_id", (Object) Integer.valueOf(c2.p()));
        }
        a(sb, 0, "event_name", (Object) e().a(c2.q()));
        String a2 = a(c2.v(), c2.w(), c2.y());
        if (!a2.isEmpty()) {
            a(sb, 0, "filter_type", (Object) a2);
        }
        a(sb, 1, "event_count_filter", c2.u());
        sb.append("  filters {\n");
        for (D a3 : c2.r()) {
            a(sb, 2, a3);
        }
        a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String a(F f2) {
        if (f2 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (f2.o()) {
            a(sb, 0, "filter_id", (Object) Integer.valueOf(f2.p()));
        }
        a(sb, 0, "property_name", (Object) e().c(f2.q()));
        String a2 = a(f2.s(), f2.t(), f2.v());
        if (!a2.isEmpty()) {
            a(sb, 0, "filter_type", (Object) a2);
        }
        a(sb, 1, f2.r());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String a(W w) {
        List<V> o;
        if (w == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (X next : w.o()) {
            if (next != null) {
                a(sb, 1);
                sb.append("bundle {\n");
                if (next.o()) {
                    a(sb, 1, "protocol_version", (Object) Integer.valueOf(next.P()));
                }
                a(sb, 1, "platform", (Object) next.la());
                if (next.ta()) {
                    a(sb, 1, "gmp_version", (Object) Long.valueOf(next.p()));
                }
                if (next.q()) {
                    a(sb, 1, "uploading_gmp_version", (Object) Long.valueOf(next.r()));
                }
                if (next.S()) {
                    a(sb, 1, "dynamite_version", (Object) Long.valueOf(next.T()));
                }
                if (next.J()) {
                    a(sb, 1, "config_version", (Object) Long.valueOf(next.K()));
                }
                a(sb, 1, "gmp_app_id", (Object) next.B());
                a(sb, 1, "admob_app_id", (Object) next.R());
                a(sb, 1, "app_id", (Object) next.ra());
                a(sb, 1, "app_version", (Object) next.sa());
                if (next.G()) {
                    a(sb, 1, "app_version_major", (Object) Integer.valueOf(next.H()));
                }
                a(sb, 1, "firebase_instance_id", (Object) next.F());
                if (next.w()) {
                    a(sb, 1, "dev_cert_hash", (Object) Long.valueOf(next.x()));
                }
                a(sb, 1, "app_store", (Object) next.qa());
                if (next.ba()) {
                    a(sb, 1, "upload_timestamp_millis", (Object) Long.valueOf(next.ca()));
                }
                if (next.da()) {
                    a(sb, 1, "start_timestamp_millis", (Object) Long.valueOf(next.ea()));
                }
                if (next.fa()) {
                    a(sb, 1, "end_timestamp_millis", (Object) Long.valueOf(next.ga()));
                }
                if (next.ha()) {
                    a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) Long.valueOf(next.ia()));
                }
                if (next.ja()) {
                    a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) Long.valueOf(next.ka()));
                }
                a(sb, 1, "app_instance_id", (Object) next.v());
                a(sb, 1, "resettable_device_id", (Object) next.s());
                a(sb, 1, "device_id", (Object) next.I());
                a(sb, 1, "ds_id", (Object) next.N());
                if (next.t()) {
                    a(sb, 1, "limited_ad_tracking", (Object) Boolean.valueOf(next.u()));
                }
                a(sb, 1, "os_version", (Object) next.ma());
                a(sb, 1, "device_model", (Object) next.na());
                a(sb, 1, "user_default_language", (Object) next.c());
                if (next.oa()) {
                    a(sb, 1, "time_zone_offset_minutes", (Object) Integer.valueOf(next.pa()));
                }
                if (next.y()) {
                    a(sb, 1, "bundle_sequential_index", (Object) Integer.valueOf(next.z()));
                }
                if (next.C()) {
                    a(sb, 1, "service_upload", (Object) Boolean.valueOf(next.D()));
                }
                a(sb, 1, "health_monitor", (Object) next.A());
                if (next.L() && next.M() != 0) {
                    a(sb, 1, "android_id", (Object) Long.valueOf(next.M()));
                }
                if (next.O()) {
                    a(sb, 1, "retry_counter", (Object) Integer.valueOf(next.Q()));
                }
                List<C0298ba> Z = next.Z();
                if (Z != null) {
                    for (C0298ba next2 : Z) {
                        if (next2 != null) {
                            a(sb, 2);
                            sb.append("user_property {\n");
                            a(sb, 2, "set_timestamp_millis", (Object) next2.o() ? Long.valueOf(next2.p()) : null);
                            a(sb, 2, "name", (Object) e().c(next2.q()));
                            a(sb, 2, "string_value", (Object) next2.s());
                            a(sb, 2, "int_value", (Object) next2.t() ? Long.valueOf(next2.u()) : null);
                            a(sb, 2, "double_value", (Object) next2.v() ? Double.valueOf(next2.w()) : null);
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<Q> E = next.E();
                String ra = next.ra();
                if (E != null) {
                    for (Q next3 : E) {
                        if (next3 != null) {
                            a(sb, 2);
                            sb.append("audience_membership {\n");
                            if (next3.o()) {
                                a(sb, 2, "audience_id", (Object) Integer.valueOf(next3.p()));
                            }
                            if (next3.t()) {
                                a(sb, 2, "new_audience", (Object) Boolean.valueOf(next3.u()));
                            }
                            a(sb, 2, "current_data", next3.q(), ra);
                            a(sb, 2, "previous_data", next3.s(), ra);
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<T> X = next.X();
                if (X != null) {
                    for (T next4 : X) {
                        if (next4 != null) {
                            a(sb, 2);
                            sb.append("event {\n");
                            a(sb, 2, "name", (Object) e().a(next4.q()));
                            if (next4.r()) {
                                a(sb, 2, "timestamp_millis", (Object) Long.valueOf(next4.s()));
                            }
                            if (next4.t()) {
                                a(sb, 2, "previous_timestamp_millis", (Object) Long.valueOf(next4.u()));
                            }
                            if (next4.v()) {
                                a(sb, 2, "count", (Object) Integer.valueOf(next4.w()));
                            }
                            if (!(next4.p() == 0 || (o = next4.o()) == null)) {
                                for (V next5 : o) {
                                    if (next5 != null) {
                                        a(sb, 3);
                                        sb.append("param {\n");
                                        a(sb, 3, "name", (Object) e().b(next5.o()));
                                        a(sb, 3, "string_value", (Object) next5.q());
                                        a(sb, 3, "int_value", (Object) next5.r() ? Long.valueOf(next5.s()) : null);
                                        a(sb, 3, "double_value", (Object) next5.t() ? Double.valueOf(next5.u()) : null);
                                        a(sb, 3);
                                        sb.append("}\n");
                                    }
                                }
                            }
                            a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                a(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final List<Long> a(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                h().w().a("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    h().w().a("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (next.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    public final void a(V.a aVar, Object obj) {
        C0563t.a(obj);
        aVar.k();
        aVar.l();
        aVar.m();
        if (obj instanceof String) {
            aVar.b((String) obj);
        } else if (obj instanceof Long) {
            aVar.a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else {
            h().t().a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(C0298ba.a aVar, Object obj) {
        C0563t.a(obj);
        aVar.k();
        aVar.l();
        aVar.m();
        if (obj instanceof String) {
            aVar.b((String) obj);
        } else if (obj instanceof Long) {
            aVar.b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else {
            h().t().a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(j().a() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(C3192o oVar, xe xeVar) {
        C0563t.a(oVar);
        C0563t.a(xeVar);
        if (Od.b() && m().a(C3202q.Ma)) {
            return !TextUtils.isEmpty(xeVar.f13823b) || !TextUtils.isEmpty(xeVar.r);
        }
        if (!TextUtils.isEmpty(xeVar.f13823b) || !TextUtils.isEmpty(xeVar.r)) {
            return true;
        }
        i();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final byte[] b(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e2) {
            h().t().a("Failed to ungzip content", e2);
            throw e2;
        }
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* access modifiers changed from: package-private */
    public final byte[] c(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            h().t().a("Failed to gzip content", e2);
            throw e2;
        }
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Bb h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ He i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ e j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ se k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Lb l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Ie m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ oe n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C3129d o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ _b p() {
        return super.p();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final List<Integer> u() {
        Map<String, String> a2 = C3202q.a(this.f13609b.f());
        if (a2 == null || a2.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = C3202q.O.a(null).intValue();
        Iterator<Map.Entry<String, String>> it = a2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            h().w().a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e2) {
                    h().w().a("Experiment ID NumberFormatException", e2);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }
}
