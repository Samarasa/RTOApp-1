package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.PriorityQueue;

public final class _na {
    private static long a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        return (i % 2 == 0 ? a((j * j) % 1073807359, i / 2) : j * (a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }

    private static String a(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            C1018Rk.b("Unable to construct shingle");
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    private static void a(int i, long j, String str, int i2, PriorityQueue<Zna> priorityQueue) {
        Zna zna = new Zna(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().f9589c <= zna.f9589c && priorityQueue.peek().f9587a <= zna.f9587a)) && !priorityQueue.contains(zna)) {
            priorityQueue.add(zna);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void a(String[] strArr, int i, int i2, PriorityQueue<Zna> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            a(i, b(strArr2, 0, strArr2.length), a(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long b2 = b(strArr2, 0, i3);
        a(i, b2, a(strArr2, 0, i3), i2, priorityQueue);
        long a2 = a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            long j = b2 + 1073807359;
            b2 = (((((j - ((((((long) Vna.a(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * a2) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) Vna.a(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            a(i, b2, a(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }

    private static long b(String[] strArr, int i, int i2) {
        long a2 = (((long) Vna.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a2 = (((a2 * 16785407) % 1073807359) + ((((long) Vna.a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a2;
    }
}
