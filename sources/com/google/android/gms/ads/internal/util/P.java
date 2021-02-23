package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, Bitmap> f5546a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f5547b = new AtomicInteger(0);

    public final Bitmap a(Integer num) {
        return this.f5546a.get(num);
    }
}
