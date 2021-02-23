package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

public final class _ia {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f9690a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f9691b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f9692c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f9693d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f9694e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f9695f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a() {
        return 1536;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f9690a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    public static Lia a(Nma nma, String str, String str2, Lja lja) {
        int i = f9691b[(nma.g() & 192) >> 6];
        int g2 = nma.g();
        int i2 = f9693d[(g2 & 56) >> 3];
        if ((g2 & 4) != 0) {
            i2++;
        }
        return Lia.a(str, "audio/ac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, lja, 0, str2);
    }

    public static Lia b(Nma nma, String str, String str2, Lja lja) {
        Nma nma2 = nma;
        nma.d(2);
        int i = f9691b[(nma.g() & 192) >> 6];
        int g2 = nma.g();
        int i2 = f9693d[(g2 & 14) >> 1];
        if ((g2 & 1) != 0) {
            i2++;
        }
        return Lia.a(str, "audio/eac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, lja, 0, str2);
    }
}
