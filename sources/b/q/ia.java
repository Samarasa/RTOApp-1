package b.q;

import android.os.IBinder;

class ia implements ka {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f2760a;

    ia(IBinder iBinder) {
        this.f2760a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ia) && ((ia) obj).f2760a.equals(this.f2760a);
    }

    public int hashCode() {
        return this.f2760a.hashCode();
    }
}
