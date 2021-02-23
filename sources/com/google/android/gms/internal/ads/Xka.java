package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class Xka {

    /* renamed from: a  reason: collision with root package name */
    private static final Qka f9274a = Qka.a("OMX.google.raw.decoder");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f9275b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<a, List<Qka>> f9276c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static final SparseIntArray f9277d;

    /* renamed from: e  reason: collision with root package name */
    private static final SparseIntArray f9278e;

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, Integer> f9279f;

    /* renamed from: g  reason: collision with root package name */
    private static int f9280g = -1;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f9281a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9282b;

        public a(String str, boolean z) {
            this.f9281a = str;
            this.f9282b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                return TextUtils.equals(this.f9281a, aVar.f9281a) && this.f9282b == aVar.f9282b;
            }
        }

        public final int hashCode() {
            String str = this.f9281a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f9282b ? 1231 : 1237);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9277d = sparseIntArray;
        sparseIntArray.put(66, 1);
        f9277d.put(77, 2);
        f9277d.put(88, 4);
        f9277d.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f9278e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        f9278e.put(11, 4);
        f9278e.put(12, 8);
        f9278e.put(13, 16);
        f9278e.put(20, 32);
        f9278e.put(21, 64);
        f9278e.put(22, 128);
        f9278e.put(30, 256);
        f9278e.put(31, 512);
        f9278e.put(32, 1024);
        f9278e.put(40, 2048);
        f9278e.put(41, 4096);
        f9278e.put(42, 8192);
        f9278e.put(50, 16384);
        f9278e.put(51, 32768);
        f9278e.put(52, 65536);
        HashMap hashMap = new HashMap();
        f9279f = hashMap;
        hashMap.put("L30", 1);
        f9279f.put("L60", 4);
        f9279f.put("L63", 16);
        f9279f.put("L90", 64);
        f9279f.put("L93", 256);
        f9279f.put("L120", 1024);
        f9279f.put("L123", 4096);
        f9279f.put("L150", 16384);
        f9279f.put("L153", 65536);
        f9279f.put("L156", 262144);
        f9279f.put("L180", 1048576);
        f9279f.put("L183", 4194304);
        f9279f.put("L186", 16777216);
        f9279f.put("H30", 2);
        f9279f.put("H60", 8);
        f9279f.put("H63", 32);
        f9279f.put("H90", 128);
        f9279f.put("H93", 512);
        f9279f.put("H120", 2048);
        f9279f.put("H123", 8192);
        f9279f.put("H150", 32768);
        f9279f.put("H153", 131072);
        f9279f.put("H156", 524288);
        f9279f.put("H180", 2097152);
        f9279f.put("H183", 8388608);
        f9279f.put("H186", 33554432);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r3.equals("hev1") != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r9.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r5) {
                case 3006243: goto L_0x0036;
                case 3006244: goto L_0x002c;
                case 3199032: goto L_0x0023;
                case 3214780: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0040
        L_0x0019:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0023:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0040
            goto L_0x0041
        L_0x002c:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 3
            goto L_0x0041
        L_0x0036:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 2
            goto L_0x0041
        L_0x0040:
            r2 = -1
        L_0x0041:
            if (r2 == 0) goto L_0x004f
            if (r2 == r8) goto L_0x004f
            if (r2 == r7) goto L_0x004a
            if (r2 == r6) goto L_0x004a
            return r0
        L_0x004a:
            android.util.Pair r9 = a((java.lang.String) r9, (java.lang.String[]) r1)
            return r9
        L_0x004f:
            int r2 = r1.length
            r3 = 4
            java.lang.String r4 = "Ignoring malformed HEVC codec string: "
            java.lang.String r5 = "MediaCodecUtil"
            if (r2 >= r3) goto L_0x006f
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r1 = r9.length()
            if (r1 == 0) goto L_0x0066
            java.lang.String r9 = r4.concat(r9)
            goto L_0x006b
        L_0x0066:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r4)
        L_0x006b:
            android.util.Log.w(r5, r9)
            return r0
        L_0x006f:
            java.util.regex.Pattern r2 = f9275b
            r3 = r1[r8]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x0095
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r1 = r9.length()
            if (r1 == 0) goto L_0x008c
            java.lang.String r9 = r4.concat(r9)
            goto L_0x0091
        L_0x008c:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r4)
        L_0x0091:
            android.util.Log.w(r5, r9)
            return r0
        L_0x0095:
            java.lang.String r9 = r2.group(r8)
            java.lang.String r3 = "1"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x00a3
            r7 = 1
            goto L_0x00ab
        L_0x00a3:
            java.lang.String r3 = "2"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x00e0
        L_0x00ab:
            java.util.Map<java.lang.String, java.lang.Integer> r9 = f9279f
            r1 = r1[r6]
            java.lang.Object r9 = r9.get(r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x00d6
            java.lang.String r9 = "Unknown HEVC level string: "
            java.lang.String r1 = r2.group(r8)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x00cc
            java.lang.String r9 = r9.concat(r1)
            goto L_0x00d2
        L_0x00cc:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9)
            r9 = r1
        L_0x00d2:
            android.util.Log.w(r5, r9)
            return r0
        L_0x00d6:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.<init>(r1, r9)
            return r0
        L_0x00e0:
            java.lang.String r1 = "Unknown HEVC profile string: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r2 = r9.length()
            if (r2 == 0) goto L_0x00f1
            java.lang.String r9 = r1.concat(r9)
            goto L_0x00f6
        L_0x00f1:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1)
        L_0x00f6:
            android.util.Log.w(r5, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Xka.a(java.lang.String):android.util.Pair");
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        Integer num;
        Integer num2;
        String valueOf;
        StringBuilder sb;
        String str2;
        if (strArr.length < 2) {
            String valueOf2 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf2) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                Integer valueOf3 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                num2 = valueOf3;
            } else if (strArr.length >= 3) {
                num2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                num = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                String valueOf4 = String.valueOf(str);
                Log.w("MediaCodecUtil", valueOf4.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf4) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            Integer valueOf5 = Integer.valueOf(f9277d.get(num2.intValue()));
            if (valueOf5 == null) {
                valueOf = String.valueOf(num2);
                sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                str2 = "Unknown AVC profile: ";
            } else {
                Integer valueOf6 = Integer.valueOf(f9278e.get(num.intValue()));
                if (valueOf6 != null) {
                    return new Pair<>(valueOf5, valueOf6);
                }
                valueOf = String.valueOf(num);
                sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                str2 = "Unknown AVC level: ";
            }
            sb.append(str2);
            sb.append(valueOf);
            Log.w("MediaCodecUtil", sb.toString());
            return null;
        } catch (NumberFormatException unused) {
            String valueOf7 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf7.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf7) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    public static Qka a() {
        return f9274a;
    }

    public static Qka a(String str, boolean z) {
        List<Qka> b2 = b(str, z);
        if (b2.isEmpty()) {
            return null;
        }
        return b2.get(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01b2 A[Catch:{ Exception -> 0x02ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01fd A[Catch:{ Exception -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x020a A[Catch:{ Exception -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0214 A[Catch:{ Exception -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x023a A[SYNTHETIC, Splitter:B:159:0x023a] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0264 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02a3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.google.android.gms.internal.ads.Qka> a(com.google.android.gms.internal.ads.Xka.a r17, com.google.android.gms.internal.ads.C1318ala r18) {
        /*
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x02ae }
            r3.<init>()     // Catch:{ Exception -> 0x02ae }
            java.lang.String r4 = r1.f9281a     // Catch:{ Exception -> 0x02ae }
            int r5 = r18.b()     // Catch:{ Exception -> 0x02ae }
            boolean r6 = r18.a()     // Catch:{ Exception -> 0x02ae }
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x02ad
            android.media.MediaCodecInfo r9 = r2.a(r8)     // Catch:{ Exception -> 0x02ae }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r9.isEncoder()     // Catch:{ Exception -> 0x02ae }
            java.lang.String r11 = ".secure"
            if (r0 != 0) goto L_0x01af
            if (r6 != 0) goto L_0x0030
            boolean r0 = r10.endsWith(r11)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x0030
            goto L_0x01af
        L_0x0030:
            int r0 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ Exception -> 0x02ae }
            r13 = 21
            if (r0 >= r13) goto L_0x0068
            java.lang.String r0 = "CIPAACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "CIPMP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "CIPVorbisDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "CIPAMRNBDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "AACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "MP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x0068
            goto L_0x01af
        L_0x0068:
            int r0 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ Exception -> 0x02ae }
            r13 = 18
            if (r0 >= r13) goto L_0x0078
            java.lang.String r0 = "OMX.SEC.MP3.Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x0078
            goto L_0x01af
        L_0x0078:
            int r0 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ Exception -> 0x02ae }
            if (r0 >= r13) goto L_0x0090
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "a70"
            java.lang.String r13 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x0090
            goto L_0x01af
        L_0x0090:
            int r0 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ Exception -> 0x02ae }
            r13 = 16
            if (r0 != r13) goto L_0x0118
            java.lang.String r0 = "OMX.qcom.audio.decoder.mp3"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "dlxu"
            java.lang.String r14 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "protou"
            java.lang.String r14 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "ville"
            java.lang.String r14 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "villeplus"
            java.lang.String r14 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "villec2"
            java.lang.String r14 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            java.lang.String r14 = "gee"
            boolean r0 = r0.startsWith(r14)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C6602"
            java.lang.String r14 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C6603"
            java.lang.String r14 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C6606"
            java.lang.String r14 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C6616"
            java.lang.String r14 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "L36h"
            java.lang.String r14 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "SO-02E"
            java.lang.String r14 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x0118
            goto L_0x01af
        L_0x0118:
            int r0 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ Exception -> 0x02ae }
            if (r0 != r13) goto L_0x014d
            java.lang.String r0 = "OMX.qcom.audio.decoder.aac"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "C1504"
            java.lang.String r13 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C1505"
            java.lang.String r13 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C1604"
            java.lang.String r13 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C1605"
            java.lang.String r13 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x014d
            goto L_0x01af
        L_0x014d:
            int r0 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ Exception -> 0x02ae }
            java.lang.String r13 = "jflte"
            r14 = 19
            if (r0 > r14) goto L_0x0198
            java.lang.String r0 = "OMX.SEC.vp8.dec"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "samsung"
            java.lang.String r15 = com.google.android.gms.internal.ads.Tma.f8823c     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.equals(r15)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            java.lang.String r15 = "d2"
            boolean r0 = r0.startsWith(r15)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            java.lang.String r15 = "serrano"
            boolean r0 = r0.startsWith(r15)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            java.lang.String r15 = "santos"
            boolean r0 = r0.startsWith(r15)     // Catch:{ Exception -> 0x02ae }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            java.lang.String r15 = "t0"
            boolean r0 = r0.startsWith(r15)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x0198
            goto L_0x01af
        L_0x0198:
            int r0 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ Exception -> 0x02ae }
            if (r0 > r14) goto L_0x01ad
            java.lang.String r0 = com.google.android.gms.internal.ads.Tma.f8822b     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x01ad
            goto L_0x01af
        L_0x01ad:
            r0 = 1
            goto L_0x01b0
        L_0x01af:
            r0 = 0
        L_0x01b0:
            if (r0 == 0) goto L_0x02a3
            java.lang.String[] r13 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x02ae }
            int r14 = r13.length     // Catch:{ Exception -> 0x02ae }
            r15 = 0
        L_0x01b8:
            if (r15 >= r14) goto L_0x02a3
            r12 = r13[r15]     // Catch:{ Exception -> 0x02ae }
            boolean r0 = r12.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x02ae }
            if (r0 == 0) goto L_0x0299
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r12)     // Catch:{ Exception -> 0x022e }
            boolean r7 = r2.a(r4, r0)     // Catch:{ Exception -> 0x022e }
            int r2 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ Exception -> 0x022e }
            r16 = r5
            r5 = 22
            if (r2 > r5) goto L_0x01fa
            java.lang.String r2 = com.google.android.gms.internal.ads.Tma.f8824d     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r5 = "ODROID-XU3"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x01f8 }
            if (r2 != 0) goto L_0x01e6
            java.lang.String r2 = com.google.android.gms.internal.ads.Tma.f8824d     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r5 = "Nexus 10"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x01f8 }
            if (r2 == 0) goto L_0x01fa
        L_0x01e6:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x01f8 }
            if (r2 != 0) goto L_0x01f6
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x01f8 }
            if (r2 == 0) goto L_0x01fa
        L_0x01f6:
            r2 = 1
            goto L_0x01fb
        L_0x01f8:
            r0 = move-exception
            goto L_0x0231
        L_0x01fa:
            r2 = 0
        L_0x01fb:
            if (r6 == 0) goto L_0x0204
            boolean r5 = r1.f9282b     // Catch:{ Exception -> 0x01f8 }
            if (r5 == r7) goto L_0x0202
            goto L_0x0204
        L_0x0202:
            r5 = 0
            goto L_0x020b
        L_0x0204:
            if (r6 != 0) goto L_0x0214
            boolean r5 = r1.f9282b     // Catch:{ Exception -> 0x01f8 }
            if (r5 != 0) goto L_0x0214
            goto L_0x0202
        L_0x020b:
            com.google.android.gms.internal.ads.Qka r0 = com.google.android.gms.internal.ads.Qka.a(r10, r4, r0, r2, r5)     // Catch:{ Exception -> 0x01f8 }
            r3.add(r0)     // Catch:{ Exception -> 0x01f8 }
            goto L_0x029b
        L_0x0214:
            r5 = 0
            if (r6 != 0) goto L_0x022c
            if (r7 == 0) goto L_0x022c
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r7 = r7.concat(r11)     // Catch:{ Exception -> 0x01f8 }
            r5 = 1
            com.google.android.gms.internal.ads.Qka r0 = com.google.android.gms.internal.ads.Qka.a(r7, r4, r0, r2, r5)     // Catch:{ Exception -> 0x022a }
            r3.add(r0)     // Catch:{ Exception -> 0x022a }
            return r3
        L_0x022a:
            r0 = move-exception
            goto L_0x0232
        L_0x022c:
            r5 = 1
            goto L_0x029b
        L_0x022e:
            r0 = move-exception
            r16 = r5
        L_0x0231:
            r5 = 1
        L_0x0232:
            int r2 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ Exception -> 0x02ae }
            r7 = 23
            java.lang.String r5 = "MediaCodecUtil"
            if (r2 > r7) goto L_0x0264
            boolean r2 = r3.isEmpty()     // Catch:{ Exception -> 0x02ae }
            if (r2 != 0) goto L_0x0264
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x02ae }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02ae }
            int r0 = r0 + 46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ae }
            r2.<init>(r0)     // Catch:{ Exception -> 0x02ae }
            java.lang.String r0 = "Skipping codec "
            r2.append(r0)     // Catch:{ Exception -> 0x02ae }
            r2.append(r10)     // Catch:{ Exception -> 0x02ae }
            java.lang.String r0 = " (failed to query capabilities)"
            r2.append(r0)     // Catch:{ Exception -> 0x02ae }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x02ae }
            android.util.Log.e(r5, r0)     // Catch:{ Exception -> 0x02ae }
            goto L_0x029b
        L_0x0264:
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x02ae }
            int r1 = r1.length()     // Catch:{ Exception -> 0x02ae }
            int r1 = r1 + 25
            java.lang.String r2 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x02ae }
            int r2 = r2.length()     // Catch:{ Exception -> 0x02ae }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ae }
            r2.<init>(r1)     // Catch:{ Exception -> 0x02ae }
            java.lang.String r1 = "Failed to query codec "
            r2.append(r1)     // Catch:{ Exception -> 0x02ae }
            r2.append(r10)     // Catch:{ Exception -> 0x02ae }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x02ae }
            r2.append(r12)     // Catch:{ Exception -> 0x02ae }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x02ae }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x02ae }
            android.util.Log.e(r5, r1)     // Catch:{ Exception -> 0x02ae }
            throw r0     // Catch:{ Exception -> 0x02ae }
        L_0x0299:
            r16 = r5
        L_0x029b:
            int r15 = r15 + 1
            r2 = r18
            r5 = r16
            goto L_0x01b8
        L_0x02a3:
            r16 = r5
            int r8 = r8 + 1
            r2 = r18
            r5 = r16
            goto L_0x0014
        L_0x02ad:
            return r3
        L_0x02ae:
            r0 = move-exception
            com.google.android.gms.internal.ads.Zka r1 = new com.google.android.gms.internal.ads.Zka
            r2 = 0
            r1.<init>(r0)
            goto L_0x02b7
        L_0x02b6:
            throw r1
        L_0x02b7:
            goto L_0x02b6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Xka.a(com.google.android.gms.internal.ads.Xka$a, com.google.android.gms.internal.ads.ala):java.util.List");
    }

    public static int b() {
        int i;
        if (f9280g == -1) {
            int i2 = 0;
            Qka a2 = a("video/avc", false);
            if (a2 != null) {
                MediaCodecInfo.CodecProfileLevel[] a3 = a2.a();
                int length = a3.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = a3[i2].level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, Tma.f8821a >= 21 ? 345600 : 172800);
            }
            f9280g = i2;
        }
        return f9280g;
    }

    private static synchronized List<Qka> b(String str, boolean z) {
        synchronized (Xka.class) {
            a aVar = new a(str, z);
            List<Qka> list = f9276c.get(aVar);
            if (list != null) {
                return list;
            }
            List<Qka> a2 = a(aVar, Tma.f8821a >= 21 ? new C1460cla(z) : new _ka());
            if (z && a2.isEmpty() && 21 <= Tma.f8821a && Tma.f8821a <= 23) {
                a2 = a(aVar, (C1318ala) new _ka());
                if (!a2.isEmpty()) {
                    String str2 = a2.get(0).f8376a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<Qka> unmodifiableList = Collections.unmodifiableList(a2);
            f9276c.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }
}
