package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public final class VT implements WT {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f9050a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VT(com.google.android.gms.internal.ads.C2249nqa r3, java.lang.String r4, int r5, java.lang.String r6, com.google.android.gms.internal.ads.C3100zqa r7) {
        /*
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = ","
            java.lang.String[] r1 = r6.split(r1)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r6)
            r1.add(r4)
            java.lang.String r4 = "networkType"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x002c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r1.add(r4)
        L_0x002c:
            java.lang.String r4 = "birthday"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x003d
            long r4 = r3.f11535b
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.add(r4)
        L_0x003d:
            java.lang.String r4 = "extras"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x004f
            android.os.Bundle r4 = r3.f11536c
            java.lang.String r4 = a(r4)
        L_0x004b:
            r1.add(r4)
            goto L_0x005e
        L_0x004f:
            java.lang.String r4 = "npa"
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L_0x005e
            android.os.Bundle r5 = r3.f11536c
            java.lang.String r4 = r5.getString(r4)
            goto L_0x004b
        L_0x005e:
            java.lang.String r4 = "gender"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x006f
            int r4 = r3.f11537d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L_0x006f:
            java.lang.String r4 = "keywords"
            boolean r4 = r0.contains(r4)
            r5 = 0
            if (r4 == 0) goto L_0x0087
            java.util.List<java.lang.String> r4 = r3.f11538e
            if (r4 == 0) goto L_0x0084
            java.lang.String r4 = r4.toString()
            r1.add(r4)
            goto L_0x0087
        L_0x0084:
            r1.add(r5)
        L_0x0087:
            java.lang.String r4 = "isTestDevice"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0098
            boolean r4 = r3.f11539f
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.add(r4)
        L_0x0098:
            java.lang.String r4 = "tagForChildDirectedTreatment"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00a9
            int r4 = r3.f11540g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L_0x00a9:
            java.lang.String r4 = "manualImpressionsEnabled"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00ba
            boolean r4 = r3.f11541h
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.add(r4)
        L_0x00ba:
            java.lang.String r4 = "publisherProvidedId"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00c7
            java.lang.String r4 = r3.i
            r1.add(r4)
        L_0x00c7:
            java.lang.String r4 = "location"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00de
            android.location.Location r4 = r3.k
            if (r4 == 0) goto L_0x00db
            java.lang.String r4 = r4.toString()
            r1.add(r4)
            goto L_0x00de
        L_0x00db:
            r1.add(r5)
        L_0x00de:
            java.lang.String r4 = "contentUrl"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00eb
            java.lang.String r4 = r3.l
            r1.add(r4)
        L_0x00eb:
            java.lang.String r4 = "networkExtras"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00fc
            android.os.Bundle r4 = r3.m
            java.lang.String r4 = a(r4)
            r1.add(r4)
        L_0x00fc:
            java.lang.String r4 = "customTargeting"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x010d
            android.os.Bundle r4 = r3.n
            java.lang.String r4 = a(r4)
            r1.add(r4)
        L_0x010d:
            java.lang.String r4 = "categoryExclusions"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0124
            java.util.List<java.lang.String> r4 = r3.o
            if (r4 == 0) goto L_0x0121
            java.lang.String r4 = r4.toString()
            r1.add(r4)
            goto L_0x0124
        L_0x0121:
            r1.add(r5)
        L_0x0124:
            java.lang.String r4 = "requestAgent"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0131
            java.lang.String r4 = r3.p
            r1.add(r4)
        L_0x0131:
            java.lang.String r4 = "requestPackage"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x013e
            java.lang.String r4 = r3.q
            r1.add(r4)
        L_0x013e:
            java.lang.String r4 = "isDesignedForFamilies"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x014f
            boolean r4 = r3.r
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.add(r4)
        L_0x014f:
            java.lang.String r4 = "tagForUnderAgeOfConsent"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0160
            int r4 = r3.t
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L_0x0160:
            java.lang.String r4 = "maxAdContentRating"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x016d
            java.lang.String r3 = r3.u
            r1.add(r3)
        L_0x016d:
            java.lang.String r3 = "orientation"
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x0184
            if (r7 == 0) goto L_0x0181
            int r3 = r7.f13127a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            goto L_0x0184
        L_0x0181:
            r1.add(r5)
        L_0x0184:
            java.lang.Object[] r3 = r1.toArray()
            r2.f9050a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.VT.<init>(com.google.android.gms.internal.ads.nqa, java.lang.String, int, java.lang.String, com.google.android.gms.internal.ads.zqa):void");
    }

    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VT)) {
            return false;
        }
        return Arrays.equals(this.f9050a, ((VT) obj).f9050a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9050a);
    }

    public final String toString() {
        int hashCode = hashCode();
        String arrays = Arrays.toString(this.f9050a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
