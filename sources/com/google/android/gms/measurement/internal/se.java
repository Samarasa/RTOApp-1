package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import c.b.b.b.b.c.c;
import c.b.b.b.b.f;
import c.b.b.b.b.j;
import c.b.b.b.d.f.Hf;
import c.b.b.b.d.f.Le;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class se extends C3249zc {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f13760c = {"firebase_", "google_", "ga_"};

    /* renamed from: d  reason: collision with root package name */
    private SecureRandom f13761d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicLong f13762e = new AtomicLong(0);

    /* renamed from: f  reason: collision with root package name */
    private int f13763f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f13764g = null;

    se(C3144fc fcVar) {
        super(fcVar);
    }

    public static long a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    static long a(byte[] bArr) {
        C0563t.a(bArr);
        int i = 0;
        C0563t.b(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    public static Bundle a(List<re> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (re next : list) {
            String str = next.f13751f;
            if (str != null) {
                bundle.putString(next.f13747b, str);
            } else {
                Long l = next.f13749d;
                if (l != null) {
                    bundle.putLong(next.f13747b, l.longValue());
                } else {
                    Double d2 = next.f13753h;
                    if (d2 != null) {
                        bundle.putDouble(next.f13747b, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private static Object a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return a(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    public static String a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    private static void a(Bundle bundle, Object obj) {
        C0563t.a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    static boolean a(Context context, boolean z) {
        C0563t.a(context);
        return b(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    private static boolean a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    static boolean a(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    static boolean a(String str) {
        C0563t.b(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private final boolean a(String str, String str2, int i, Object obj, boolean z) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                String valueOf = String.valueOf(obj);
                if (valueOf.codePointCount(0, valueOf.length()) > i) {
                    h().y().a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                    return false;
                }
            } else if ((obj instanceof Bundle) && z) {
                return true;
            } else {
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            h().y().a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!(obj2 instanceof Bundle)) {
                            h().y().a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    static boolean a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    static boolean a(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    static byte[] a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    static Bundle[] a(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    public static Bundle b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static ArrayList<Bundle> b(List<Ge> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (Ge next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f13267a);
            bundle.putString("origin", next.f13268b);
            bundle.putLong("creation_timestamp", next.f13270d);
            bundle.putString("name", next.f13269c.f13747b);
            Bc.a(bundle, next.f13269c.a());
            bundle.putBoolean("active", next.f13271e);
            String str = next.f13272f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C3192o oVar = next.f13273g;
            if (oVar != null) {
                bundle.putString("timed_out_event_name", oVar.f13696a);
                C3187n nVar = next.f13273g.f13697b;
                if (nVar != null) {
                    bundle.putBundle("timed_out_event_params", nVar.b());
                }
            }
            bundle.putLong("trigger_timeout", next.f13274h);
            C3192o oVar2 = next.i;
            if (oVar2 != null) {
                bundle.putString("triggered_event_name", oVar2.f13696a);
                C3187n nVar2 = next.i.f13697b;
                if (nVar2 != null) {
                    bundle.putBundle("triggered_event_params", nVar2.b());
                }
            }
            bundle.putLong("triggered_timestamp", next.f13269c.f13748c);
            bundle.putLong("time_to_live", next.j);
            C3192o oVar3 = next.k;
            if (oVar3 != null) {
                bundle.putString("expired_event_name", oVar3.f13696a);
                C3187n nVar3 = next.k.f13697b;
                if (nVar3 != null) {
                    bundle.putBundle("expired_event_params", nVar3.b());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.se.b(android.content.Context, java.lang.String):boolean");
    }

    private final boolean c(Context context, String str) {
        Db db;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b2 = c.a(context).b(str, 64);
            if (b2 == null || b2.signatures == null || b2.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b2.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            e = e2;
            db = h().t();
            str2 = "Error obtaining certificate";
            db.a(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            db = h().t();
            str2 = "Package name not found";
            db.a(str2, e);
            return true;
        }
    }

    static boolean c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    static boolean e(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private static boolean g(String str) {
        C0563t.a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private static int h(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    static MessageDigest v() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public final int a(int i) {
        return f.a().a(f(), (int) j.f3888a);
    }

    /* access modifiers changed from: package-private */
    public final long a(Context context, String str) {
        c();
        C0563t.a(context);
        C0563t.b(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest v = v();
        if (v == null) {
            h().t().a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!c(context, str)) {
                    PackageInfo b2 = c.a(context).b(f().getPackageName(), 64);
                    if (b2.signatures != null && b2.signatures.length > 0) {
                        return a(v.digest(b2.signatures[0].toByteArray()));
                    }
                    h().w().a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                h().t().a("Package name not found", e2);
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            h().w().a("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a2 = a(str, bundle.get(str));
                if (a2 == null) {
                    h().y().a("Param value can't be null", e().b(str));
                } else {
                    a(bundle2, str, a2);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (a("event param", 40, r15) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        if (a("event param", 40, r15) == false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a(java.lang.String r17, java.lang.String r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r19
            r9 = r20
            r10 = 0
            if (r8 == 0) goto L_0x017d
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>(r8)
            com.google.android.gms.measurement.internal.Ie r0 = r16.m()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C3202q.la
            boolean r0 = r0.e(r7, r1)
            if (r0 == 0) goto L_0x0026
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r19.keySet()
            r0.<init>(r1)
            goto L_0x002a
        L_0x0026:
            java.util.Set r0 = r19.keySet()
        L_0x002a:
            java.util.Iterator r12 = r0.iterator()
            r14 = 0
        L_0x002f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r0 = r12.next()
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            r5 = 40
            r0 = 3
            if (r9 == 0) goto L_0x004a
            boolean r1 = r9.contains(r15)
            if (r1 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r1 = 0
            goto L_0x0082
        L_0x004a:
            r1 = 14
            java.lang.String r2 = "event param"
            if (r21 == 0) goto L_0x0068
            boolean r3 = r6.a((java.lang.String) r2, (java.lang.String) r15)
            if (r3 != 0) goto L_0x0058
        L_0x0056:
            r3 = 3
            goto L_0x0069
        L_0x0058:
            boolean r3 = r6.a((java.lang.String) r2, (java.lang.String[]) r10, (java.lang.String) r15)
            if (r3 != 0) goto L_0x0061
            r3 = 14
            goto L_0x0069
        L_0x0061:
            boolean r3 = r6.a((java.lang.String) r2, (int) r5, (java.lang.String) r15)
            if (r3 != 0) goto L_0x0068
            goto L_0x0056
        L_0x0068:
            r3 = 0
        L_0x0069:
            if (r3 != 0) goto L_0x0081
            boolean r3 = r6.b((java.lang.String) r2, (java.lang.String) r15)
            if (r3 != 0) goto L_0x0073
        L_0x0071:
            r1 = 3
            goto L_0x0082
        L_0x0073:
            boolean r3 = r6.a((java.lang.String) r2, (java.lang.String[]) r10, (java.lang.String) r15)
            if (r3 != 0) goto L_0x007a
            goto L_0x0082
        L_0x007a:
            boolean r1 = r6.a((java.lang.String) r2, (int) r5, (java.lang.String) r15)
            if (r1 != 0) goto L_0x0048
            goto L_0x0071
        L_0x0081:
            r1 = r3
        L_0x0082:
            java.lang.String r4 = "_ev"
            r3 = 1
            if (r1 == 0) goto L_0x009b
            boolean r2 = a((android.os.Bundle) r11, (int) r1)
            if (r2 == 0) goto L_0x0176
            java.lang.String r2 = a((java.lang.String) r15, (int) r5, (boolean) r3)
            r11.putString(r4, r2)
            if (r1 != r0) goto L_0x0176
            a((android.os.Bundle) r11, (java.lang.Object) r15)
            goto L_0x0176
        L_0x009b:
            java.lang.Object r2 = r8.get(r15)
            r16.c()
            if (r22 == 0) goto L_0x00da
            boolean r0 = r2 instanceof android.os.Parcelable[]
            if (r0 == 0) goto L_0x00ad
            r0 = r2
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            int r0 = r0.length
            goto L_0x00b8
        L_0x00ad:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x00d1
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
        L_0x00b8:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r1) goto L_0x00d1
            com.google.android.gms.measurement.internal.Bb r1 = r16.h()
            com.google.android.gms.measurement.internal.Db r1 = r1.y()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "param"
            java.lang.String r5 = "Parameter array is too long; discarded. Value kind, name, array length"
            r1.a(r5, r3, r15, r0)
            r0 = 0
            goto L_0x00d2
        L_0x00d1:
            r0 = 1
        L_0x00d2:
            if (r0 != 0) goto L_0x00da
            r0 = 17
            r13 = r4
            r10 = 40
            goto L_0x0118
        L_0x00da:
            com.google.android.gms.measurement.internal.Ie r0 = r16.m()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C3202q.P
            boolean r0 = r0.e(r7, r1)
            if (r0 == 0) goto L_0x00ec
            boolean r0 = e(r18)
            if (r0 != 0) goto L_0x00f2
        L_0x00ec:
            boolean r0 = e(r15)
            if (r0 == 0) goto L_0x0106
        L_0x00f2:
            r3 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = "param"
            r0 = r16
            r5 = r2
            r2 = r15
            r10 = 1
            r13 = r4
            r4 = r5
            r10 = 40
        L_0x00ff:
            r5 = r22
            boolean r0 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.Object) r4, (boolean) r5)
            goto L_0x0113
        L_0x0106:
            r5 = r2
            r13 = r4
            r10 = 40
            r3 = 100
            java.lang.String r1 = "param"
            r0 = r16
            r2 = r15
            r4 = r5
            goto L_0x00ff
        L_0x0113:
            if (r0 == 0) goto L_0x0117
            r0 = 0
            goto L_0x0118
        L_0x0117:
            r0 = 4
        L_0x0118:
            if (r0 == 0) goto L_0x0139
            boolean r1 = r13.equals(r15)
            if (r1 != 0) goto L_0x0139
            boolean r0 = a((android.os.Bundle) r11, (int) r0)
            if (r0 == 0) goto L_0x0176
            r0 = 1
            java.lang.String r0 = a((java.lang.String) r15, (int) r10, (boolean) r0)
            r11.putString(r13, r0)
            java.lang.Object r0 = r8.get(r15)
            a((android.os.Bundle) r11, (java.lang.Object) r0)
            goto L_0x0176
        L_0x0136:
            r10 = 0
            goto L_0x002f
        L_0x0139:
            boolean r0 = a((java.lang.String) r15)
            if (r0 == 0) goto L_0x017a
            int r14 = r14 + 1
            r0 = 25
            if (r14 <= r0) goto L_0x017a
            r0 = 48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Event can't contain more than 25 params"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.measurement.internal.Bb r1 = r16.h()
            com.google.android.gms.measurement.internal.Db r1 = r1.v()
            com.google.android.gms.measurement.internal.zb r2 = r16.e()
            r3 = r18
            java.lang.String r2 = r2.a((java.lang.String) r3)
            com.google.android.gms.measurement.internal.zb r4 = r16.e()
            java.lang.String r4 = r4.a((android.os.Bundle) r8)
            r1.a(r0, r2, r4)
            r0 = 5
            a((android.os.Bundle) r11, (int) r0)
        L_0x0176:
            r11.remove(r15)
            goto L_0x0136
        L_0x017a:
            r3 = r18
            goto L_0x0136
        L_0x017d:
            r11 = 0
        L_0x017e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.se.a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final C3192o a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (b(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            return new C3192o(str2, new C3187n(a(a(str, str2, bundle2, com.google.android.gms.common.util.f.a("_o"), false, false))), str3, j);
        }
        h().t().a("Invalid conditional property event name", e().c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public final Object a(String str, Object obj) {
        boolean z;
        int i = 256;
        if ("_ev".equals(str)) {
            z = true;
        } else {
            if (!e(str)) {
                i = 100;
            }
            z = false;
        }
        return a(i, obj, z);
    }

    public final URL a(long j, String str, String str2, long j2) {
        try {
            C0563t.b(str2);
            C0563t.b(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j), Integer.valueOf(w())}), str2, str, Long.valueOf(j2)});
            if (str.equals(m().v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            h().t().a("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(int i, String str, String str2, int i2) {
        a((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            h().w().a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (str != null) {
                h().y().a("Not putting event parameter. Invalid value type. name, type", e().b(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void a(Hf hf, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            hf.c(bundle);
        } catch (RemoteException e2) {
            this.f13807a.h().w().a("Error returning int value to wrapper", e2);
        }
    }

    public final void a(Hf hf, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            hf.c(bundle);
        } catch (RemoteException e2) {
            this.f13807a.h().w().a("Error returning long value to wrapper", e2);
        }
    }

    public final void a(Hf hf, Bundle bundle) {
        try {
            hf.c(bundle);
        } catch (RemoteException e2) {
            this.f13807a.h().w().a("Error returning bundle value to wrapper", e2);
        }
    }

    public final void a(Hf hf, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            hf.c(bundle);
        } catch (RemoteException e2) {
            this.f13807a.h().w().a("Error returning string value to wrapper", e2);
        }
    }

    public final void a(Hf hf, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            hf.c(bundle);
        } catch (RemoteException e2) {
            this.f13807a.h().w().a("Error returning bundle list to wrapper", e2);
        }
    }

    public final void a(Hf hf, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            hf.c(bundle);
        } catch (RemoteException e2) {
            this.f13807a.h().w().a("Error returning boolean value to wrapper", e2);
        }
    }

    public final void a(Hf hf, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            hf.c(bundle);
        } catch (RemoteException e2) {
            this.f13807a.h().w().a("Error returning byte array to wrapper", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        a(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f13807a.i();
        this.f13807a.u().a("auto", "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    public final boolean a(String str, double d2) {
        try {
            SharedPreferences.Editor edit = f().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d2));
            return edit.commit();
        } catch (Exception e2) {
            h().t().a("Failed to persist Deferred Deep Link. exception", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, int i, String str2) {
        if (str2 == null) {
            h().v().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            h().v().a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2) {
        if (str2 == null) {
            h().v().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            h().v().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                h().v().a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    h().v().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (g(str)) {
                return true;
            }
            if (this.f13807a.y()) {
                h().v().a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", Bb.a(str));
            }
            return false;
        } else if (Le.b() && m().a(C3202q.Fa) && !TextUtils.isEmpty(str3)) {
            return true;
        } else {
            if (TextUtils.isEmpty(str2)) {
                if (this.f13807a.y()) {
                    h().v().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (g(str2)) {
                return true;
            } else {
                h().v().a("Invalid admob_app_id. Analytics disabled.", Bb.a(str2));
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            h().v().a("Name is required and can't be null. Type", str);
            return false;
        }
        C0563t.a(str2);
        String[] strArr2 = f13760c;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            h().v().a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            C0563t.a(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (c(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                h().v().a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int b(String str) {
        if (!b("event", str)) {
            return 2;
        }
        if (!a("event", Ac.f13163a, str)) {
            return 13;
        }
        return !a("event", 40, str) ? 2 : 0;
    }

    /* access modifiers changed from: package-private */
    public final int b(String str, Object obj) {
        return "_ldl".equals(str) ? a("user property referrer", str, h(str), obj, false) : a("user property", str, h(str), obj, false) ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        if (str2 == null) {
            h().v().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            h().v().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        h().v().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            h().v().a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final int c(String str) {
        if (!b("user property", str)) {
            return 6;
        }
        if (!a("user property", Cc.f13202a, str)) {
            return 15;
        }
        return !a("user property", 24, str) ? 6 : 0;
    }

    /* access modifiers changed from: package-private */
    public final Object c(String str, Object obj) {
        int h2;
        boolean z;
        if ("_ldl".equals(str)) {
            h2 = h(str);
            z = true;
        } else {
            h2 = h(str);
            z = false;
        }
        return a(h2, obj, z);
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final boolean d(String str) {
        c();
        if (c.a(f()).a(str) == 0) {
            return true;
        }
        h().A().a("Permission not granted", str);
        return false;
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    /* access modifiers changed from: package-private */
    public final boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = m().u();
        i();
        return u.equals(str);
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

    /* access modifiers changed from: protected */
    public final void n() {
        c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                h().w().a("Utils falling back to Random for random id");
            }
        }
        this.f13762e.set(nextLong);
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return true;
    }

    public final long t() {
        long andIncrement;
        long j;
        if (this.f13762e.get() == 0) {
            synchronized (this.f13762e) {
                long nextLong = new Random(System.nanoTime() ^ j().a()).nextLong();
                int i = this.f13763f + 1;
                this.f13763f = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f13762e) {
            this.f13762e.compareAndSet(-1, 1);
            andIncrement = this.f13762e.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom u() {
        c();
        if (this.f13761d == null) {
            this.f13761d = new SecureRandom();
        }
        return this.f13761d;
    }

    public final int w() {
        if (this.f13764g == null) {
            this.f13764g = Integer.valueOf(f.a().a(f()) / 1000);
        }
        return this.f13764g.intValue();
    }

    /* access modifiers changed from: package-private */
    public final String x() {
        byte[] bArr = new byte[16];
        u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final boolean y() {
        try {
            f().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
