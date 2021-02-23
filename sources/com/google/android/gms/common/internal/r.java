package com.google.android.gms.common.internal;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.concurrent.ConcurrentHashMap;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final C0555k f5988a = new C0555k("LibraryVersion", BuildConfig.FLAVOR);

    /* renamed from: b  reason: collision with root package name */
    private static r f5989b = new r();

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<String, String> f5990c = new ConcurrentHashMap<>();

    protected r() {
    }

    public static r a() {
        return f5989b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1 A[Catch:{ all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6 A[Catch:{ all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.C0563t.a((java.lang.String) r10, (java.lang.Object) r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r9.f5990c
            boolean r2 = r2.containsKey(r10)
            if (r2 == 0) goto L_0x001a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r9.f5990c
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L_0x001a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 0
            java.lang.String r4 = "/%s.properties"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0093 }
            r6 = 0
            r5[r6] = r10     // Catch:{ IOException -> 0x0093 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ IOException -> 0x0093 }
            java.lang.Class<com.google.android.gms.common.internal.r> r5 = com.google.android.gms.common.internal.r.class
            java.io.InputStream r4 = r5.getResourceAsStream(r4)     // Catch:{ IOException -> 0x0093 }
            if (r4 == 0) goto L_0x006a
            r2.load(r4)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            java.lang.String r5 = "version"
            java.lang.String r3 = r2.getProperty(r5, r3)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            com.google.android.gms.common.internal.k r2 = f5988a     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            int r5 = r5.length()     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            int r5 = r5 + 12
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            int r6 = r6.length()     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            r6.append(r10)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            java.lang.String r5 = " version is "
            r6.append(r5)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            r6.append(r3)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            java.lang.String r5 = r6.toString()     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            r2.b(r1, r5)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            goto L_0x0083
        L_0x006a:
            com.google.android.gms.common.internal.k r2 = f5988a     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            int r6 = r5.length()     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            if (r6 == 0) goto L_0x007b
            java.lang.String r5 = r0.concat(r5)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            goto L_0x0080
        L_0x007b:
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
        L_0x0080:
            r2.c(r1, r5)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
        L_0x0083:
            if (r4 == 0) goto L_0x00b5
            com.google.android.gms.common.util.k.a(r4)
            goto L_0x00b5
        L_0x0089:
            r10 = move-exception
            goto L_0x00c6
        L_0x008b:
            r2 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x0095
        L_0x0090:
            r10 = move-exception
            r4 = r3
            goto L_0x00c6
        L_0x0093:
            r2 = move-exception
            r4 = r3
        L_0x0095:
            com.google.android.gms.common.internal.k r5 = f5988a     // Catch:{ all -> 0x0090 }
            java.lang.String r6 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0090 }
            int r7 = r6.length()     // Catch:{ all -> 0x0090 }
            if (r7 == 0) goto L_0x00a6
            java.lang.String r0 = r0.concat(r6)     // Catch:{ all -> 0x0090 }
            goto L_0x00ac
        L_0x00a6:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0090 }
            r6.<init>(r0)     // Catch:{ all -> 0x0090 }
            r0 = r6
        L_0x00ac:
            r5.a(r1, r0, r2)     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x00b4
            com.google.android.gms.common.util.k.a(r3)
        L_0x00b4:
            r3 = r4
        L_0x00b5:
            if (r3 != 0) goto L_0x00c0
            com.google.android.gms.common.internal.k r0 = f5988a
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.a(r1, r2)
            java.lang.String r3 = "UNKNOWN"
        L_0x00c0:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r9.f5990c
            r0.put(r10, r3)
            return r3
        L_0x00c6:
            if (r4 == 0) goto L_0x00cb
            com.google.android.gms.common.util.k.a(r4)
        L_0x00cb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.r.a(java.lang.String):java.lang.String");
    }
}
