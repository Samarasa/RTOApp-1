package com.google.android.material.picker;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

final class c implements Comparable<c>, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleDateFormat f14127a = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault());

    /* renamed from: b  reason: collision with root package name */
    private final Calendar f14128b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14129c = f14127a.format(this.f14128b.getTime());

    /* renamed from: d  reason: collision with root package name */
    final int f14130d;

    /* renamed from: e  reason: collision with root package name */
    final int f14131e;

    /* renamed from: f  reason: collision with root package name */
    final int f14132f = this.f14128b.getMaximum(7);

    /* renamed from: g  reason: collision with root package name */
    final int f14133g = this.f14128b.getActualMaximum(5);

    private c(Calendar calendar) {
        this.f14128b = calendar;
        this.f14128b.set(5, 1);
        this.f14130d = calendar.get(2);
        this.f14131e = calendar.get(1);
    }

    static c a(int i, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.set(1, i);
        instance.set(2, i2);
        return new c(instance);
    }

    /* access modifiers changed from: package-private */
    public int a() {
        int firstDayOfWeek = this.f14128b.get(7) - this.f14128b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f14132f : firstDayOfWeek;
    }

    /* renamed from: a */
    public int compareTo(c cVar) {
        return this.f14128b.compareTo(cVar.f14128b);
    }

    /* access modifiers changed from: package-private */
    public Calendar a(int i) {
        Calendar calendar = (Calendar) this.f14128b.clone();
        calendar.set(5, i);
        return calendar;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14130d == cVar.f14130d && this.f14131e == cVar.f14131e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14130d), Integer.valueOf(this.f14131e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14131e);
        parcel.writeInt(this.f14130d);
    }
}
