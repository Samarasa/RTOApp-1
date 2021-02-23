package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1796hca;
import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class DZ {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f6566a = Logger.getLogger(DZ.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentMap<String, a> f6567b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap<String, b> f6568c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f6569d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentMap<String, C1861iZ<?>> f6570e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, CZ<?>> f6571f = new ConcurrentHashMap();

    interface a {
        <P> C2073lZ<P> a(Class<P> cls);

        Class<?> a();

        C2073lZ<?> b();

        Class<?> c();

        Set<Class<?>> d();
    }

    interface b {
    }

    private DZ() {
    }

    public static <P> AZ<P> a(C2640tZ tZVar, C2073lZ<P> lZVar, Class<P> cls) {
        a(cls);
        Class cls2 = cls;
        KZ.b(tZVar.a());
        AZ<P> a2 = AZ.a(cls2);
        for (C1796hca.a next : tZVar.a().p()) {
            if (next.o() == C1371bca.ENABLED) {
                C3066zZ<P> a3 = a2.a(a(next.r().o(), next.r().p(), cls2), next);
                if (next.s() == tZVar.a().o()) {
                    a2.a(a3);
                }
            }
        }
        return a2;
    }

    private static <KeyProtoT extends C1872ifa> a a(C2569sZ<KeyProtoT> sZVar) {
        return new FZ(sZVar);
    }

    public static synchronized Yba a(C1513dca dca) {
        Yba a2;
        synchronized (DZ.class) {
            C2073lZ<?> c2 = c(dca.o());
            if (((Boolean) f6569d.get(dca.o())).booleanValue()) {
                a2 = c2.a(dca.p());
            } else {
                String valueOf = String.valueOf(dca.o());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return a2;
    }

    @Deprecated
    public static C1861iZ<?> a(String str) {
        String str2;
        String str3;
        if (str != null) {
            C1861iZ<?> iZVar = (C1861iZ) f6570e.get(str.toLowerCase(Locale.US));
            if (iZVar != null) {
                return iZVar;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase(Locale.US).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call DeterministicAeadConfig.register().";
            } else if (str.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call StreamingAeadConfig.register().";
            } else if (str.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call HybridConfig.register().";
            } else if (str.toLowerCase(Locale.US).startsWith("tinkmac")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call MacConfig.register().";
            } else if (str.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call SignatureConfig.register().";
            } else {
                if (str.toLowerCase(Locale.US).startsWith("tink")) {
                    str2 = String.valueOf(format);
                    str3 = "Maybe call TinkConfig.register().";
                }
                throw new GeneralSecurityException(format);
            }
            format = str2.concat(str3);
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    private static <P> C2073lZ<P> a(String str, Class<P> cls) {
        a b2 = b(str);
        if (cls == null) {
            return b2.b();
        }
        if (b2.d().contains(cls)) {
            return b2.a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(b2.a());
        Set<Class<?>> d2 = b2.d();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : d2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    public static <P> P a(AZ<P> az) {
        CZ cz = (CZ) f6571f.get(az.a());
        if (cz != null) {
            return cz.a(az);
        }
        String valueOf = String.valueOf(az.a().getName());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
    }

    private static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    private static <P> P a(String str, Lda lda, Class<P> cls) {
        return a(str, cls).c(lda);
    }

    public static <P> P a(String str, C1872ifa ifa, Class<P> cls) {
        a(cls);
        return a(str, cls).a(ifa);
    }

    public static <P> P a(String str, byte[] bArr, Class<P> cls) {
        Lda a2 = Lda.a(bArr);
        a(cls);
        return a(str, a2, cls);
    }

    public static synchronized <P> void a(CZ<P> cz) {
        synchronized (DZ.class) {
            if (cz != null) {
                Class<P> a2 = cz.a();
                if (f6571f.containsKey(a2)) {
                    CZ cz2 = (CZ) f6571f.get(a2);
                    if (!cz.getClass().equals(cz2.getClass())) {
                        Logger logger = f6566a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(a2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
                        sb.append("Attempted overwrite of a registered SetWrapper for type ");
                        sb.append(valueOf);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{a2.getName(), cz2.getClass().getName(), cz.getClass().getName()}));
                    }
                }
                f6571f.put(a2, cz);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    public static synchronized <KeyProtoT extends C1872ifa, PublicKeyProtoT extends C1872ifa> void a(EZ<KeyProtoT, PublicKeyProtoT> ez, C2569sZ<PublicKeyProtoT> sZVar, boolean z) {
        Class<?> c2;
        synchronized (DZ.class) {
            String a2 = ez.a();
            String a3 = sZVar.a();
            a(a2, ez.getClass(), true);
            a(a3, sZVar.getClass(), false);
            if (!a2.equals(a3)) {
                if (f6567b.containsKey(a2) && (c2 = ((a) f6567b.get(a2)).c()) != null) {
                    if (!c2.equals(sZVar.getClass())) {
                        Logger logger = f6566a;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 96 + String.valueOf(a3).length());
                        sb.append("Attempted overwrite of a registered key manager for key type ");
                        sb.append(a2);
                        sb.append(" with inconsistent public key type ");
                        sb.append(a3);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{ez.getClass().getName(), c2.getName(), sZVar.getClass().getName()}));
                    }
                }
                if (!f6567b.containsKey(a2) || ((a) f6567b.get(a2)).c() == null) {
                    f6567b.put(a2, new IZ(ez, sZVar));
                    f6568c.put(a2, b(ez));
                }
                f6569d.put(a2, true);
                if (!f6567b.containsKey(a3)) {
                    f6567b.put(a3, a(sZVar));
                }
                f6569d.put(a3, false);
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    public static synchronized <P> void a(C2073lZ<P> lZVar, boolean z) {
        synchronized (DZ.class) {
            if (lZVar != null) {
                String b2 = lZVar.b();
                a(b2, lZVar.getClass(), z);
                f6567b.putIfAbsent(b2, new GZ(lZVar));
                f6569d.put(b2, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <KeyProtoT extends C1872ifa> void a(C2569sZ<KeyProtoT> sZVar, boolean z) {
        synchronized (DZ.class) {
            String a2 = sZVar.a();
            a(a2, sZVar.getClass(), true);
            if (!f6567b.containsKey(a2)) {
                f6567b.put(a2, a(sZVar));
                f6568c.put(a2, b(sZVar));
            }
            f6569d.put(a2, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(java.lang.String r8, java.lang.Class<?> r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.DZ> r0 = com.google.android.gms.internal.ads.DZ.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.internal.ads.DZ$a> r1 = f6567b     // Catch:{ all -> 0x0093 }
            boolean r1 = r1.containsKey(r8)     // Catch:{ all -> 0x0093 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.internal.ads.DZ$a> r1 = f6567b     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x0093 }
            com.google.android.gms.internal.ads.DZ$a r1 = (com.google.android.gms.internal.ads.DZ.a) r1     // Catch:{ all -> 0x0093 }
            java.lang.Class r2 = r1.a()     // Catch:{ all -> 0x0093 }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0093 }
            if (r2 != 0) goto L_0x0065
            java.util.logging.Logger r10 = f6566a     // Catch:{ all -> 0x0093 }
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "com.google.crypto.tink.Registry"
            java.lang.String r4 = "ensureKeyManagerInsertable"
            java.lang.String r5 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0093 }
            int r7 = r6.length()     // Catch:{ all -> 0x0093 }
            if (r7 == 0) goto L_0x0038
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x0093 }
            goto L_0x003e
        L_0x0038:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0093 }
            r6.<init>(r5)     // Catch:{ all -> 0x0093 }
            r5 = r6
        L_0x003e:
            r10.logp(r2, r3, r4, r5)     // Catch:{ all -> 0x0093 }
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0093 }
            r4 = 0
            r3[r4] = r8     // Catch:{ all -> 0x0093 }
            r8 = 1
            java.lang.Class r1 = r1.a()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0093 }
            r3[r8] = r1     // Catch:{ all -> 0x0093 }
            r8 = 2
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0093 }
            r3[r8] = r9     // Catch:{ all -> 0x0093 }
            java.lang.String r8 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0093 }
            r10.<init>(r8)     // Catch:{ all -> 0x0093 }
            throw r10     // Catch:{ all -> 0x0093 }
        L_0x0065:
            if (r10 == 0) goto L_0x0091
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r9 = f6569d     // Catch:{ all -> 0x0093 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x0093 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0093 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0093 }
            if (r9 != 0) goto L_0x0091
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0093 }
            java.lang.String r10 = "New keys are already disallowed for key type "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0093 }
            int r1 = r8.length()     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x0088
            java.lang.String r8 = r10.concat(r8)     // Catch:{ all -> 0x0093 }
            goto L_0x008d
        L_0x0088:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x0093 }
            r8.<init>(r10)     // Catch:{ all -> 0x0093 }
        L_0x008d:
            r9.<init>(r8)     // Catch:{ all -> 0x0093 }
            throw r9     // Catch:{ all -> 0x0093 }
        L_0x0091:
            monitor-exit(r0)
            return
        L_0x0093:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DZ.a(java.lang.String, java.lang.Class, boolean):void");
    }

    private static synchronized a b(String str) {
        a aVar;
        synchronized (DZ.class) {
            if (!f6567b.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            aVar = (a) f6567b.get(str);
        }
        return aVar;
    }

    private static <KeyProtoT extends C1872ifa> b b(C2569sZ<KeyProtoT> sZVar) {
        return new HZ(sZVar);
    }

    public static synchronized C1872ifa b(C1513dca dca) {
        C1872ifa b2;
        synchronized (DZ.class) {
            C2073lZ<?> c2 = c(dca.o());
            if (((Boolean) f6569d.get(dca.o())).booleanValue()) {
                b2 = c2.b(dca.p());
            } else {
                String valueOf = String.valueOf(dca.o());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return b2;
    }

    private static C2073lZ<?> c(String str) {
        return b(str).b();
    }
}
