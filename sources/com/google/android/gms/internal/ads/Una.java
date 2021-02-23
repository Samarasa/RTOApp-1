package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

public final class Una {

    /* renamed from: a  reason: collision with root package name */
    private final int f8957a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8958b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8959c;

    /* renamed from: d  reason: collision with root package name */
    private final Rna f8960d = new Yna();

    public Una(int i) {
        this.f8958b = i;
        this.f8957a = 6;
        this.f8959c = 0;
    }

    private final String a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return BuildConfig.FLAVOR;
        }
        Wna wna = new Wna();
        PriorityQueue priorityQueue = new PriorityQueue(this.f8958b, new Tna(this));
        for (String a2 : split) {
            String[] a3 = Vna.a(a2, false);
            if (a3.length != 0) {
                _na.a(a3, this.f8958b, this.f8957a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                wna.a(this.f8960d.a(((Zna) it.next()).f9588b));
            } catch (IOException e2) {
                C1018Rk.b("Error while writing hash to byteStream", e2);
            }
        }
        return wna.toString();
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append(10);
        }
        return a(sb.toString());
    }
}
