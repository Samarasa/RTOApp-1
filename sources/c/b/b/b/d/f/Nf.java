package c.b.b.b.d.f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.c.a;

public final class Nf extends C0290a implements C0338gf {
    Nf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel Db = Db();
        Db.writeString(str);
        Db.writeLong(j);
        b(23, Db);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel Db = Db();
        Db.writeString(str);
        Db.writeString(str2);
        r.a(Db, (Parcelable) bundle);
        b(9, Db);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel Db = Db();
        Db.writeString(str);
        Db.writeLong(j);
        b(24, Db);
    }

    public final void generateEventId(Hf hf) {
        Parcel Db = Db();
        r.a(Db, (IInterface) hf);
        b(22, Db);
    }

    public final void getCachedAppInstanceId(Hf hf) {
        Parcel Db = Db();
        r.a(Db, (IInterface) hf);
        b(19, Db);
    }

    public final void getConditionalUserProperties(String str, String str2, Hf hf) {
        Parcel Db = Db();
        Db.writeString(str);
        Db.writeString(str2);
        r.a(Db, (IInterface) hf);
        b(10, Db);
    }

    public final void getCurrentScreenClass(Hf hf) {
        Parcel Db = Db();
        r.a(Db, (IInterface) hf);
        b(17, Db);
    }

    public final void getCurrentScreenName(Hf hf) {
        Parcel Db = Db();
        r.a(Db, (IInterface) hf);
        b(16, Db);
    }

    public final void getGmpAppId(Hf hf) {
        Parcel Db = Db();
        r.a(Db, (IInterface) hf);
        b(21, Db);
    }

    public final void getMaxUserProperties(String str, Hf hf) {
        Parcel Db = Db();
        Db.writeString(str);
        r.a(Db, (IInterface) hf);
        b(6, Db);
    }

    public final void getUserProperties(String str, String str2, boolean z, Hf hf) {
        Parcel Db = Db();
        Db.writeString(str);
        Db.writeString(str2);
        r.a(Db, z);
        r.a(Db, (IInterface) hf);
        b(5, Db);
    }

    public final void initialize(a aVar, Tf tf, long j) {
        Parcel Db = Db();
        r.a(Db, (IInterface) aVar);
        r.a(Db, (Parcelable) tf);
        Db.writeLong(j);
        b(1, Db);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel Db = Db();
        Db.writeString(str);
        Db.writeString(str2);
        r.a(Db, (Parcelable) bundle);
        r.a(Db, z);
        r.a(Db, z2);
        Db.writeLong(j);
        b(2, Db);
    }

    public final void logHealthData(int i, String str, a aVar, a aVar2, a aVar3) {
        Parcel Db = Db();
        Db.writeInt(i);
        Db.writeString(str);
        r.a(Db, (IInterface) aVar);
        r.a(Db, (IInterface) aVar2);
        r.a(Db, (IInterface) aVar3);
        b(33, Db);
    }

    public final void onActivityCreated(a aVar, Bundle bundle, long j) {
        Parcel Db = Db();
        r.a(Db, (IInterface) aVar);
        r.a(Db, (Parcelable) bundle);
        Db.writeLong(j);
        b(27, Db);
    }

    public final void onActivityDestroyed(a aVar, long j) {
        Parcel Db = Db();
        r.a(Db, (IInterface) aVar);
        Db.writeLong(j);
        b(28, Db);
    }

    public final void onActivityPaused(a aVar, long j) {
        Parcel Db = Db();
        r.a(Db, (IInterface) aVar);
        Db.writeLong(j);
        b(29, Db);
    }

    public final void onActivityResumed(a aVar, long j) {
        Parcel Db = Db();
        r.a(Db, (IInterface) aVar);
        Db.writeLong(j);
        b(30, Db);
    }

    public final void onActivitySaveInstanceState(a aVar, Hf hf, long j) {
        Parcel Db = Db();
        r.a(Db, (IInterface) aVar);
        r.a(Db, (IInterface) hf);
        Db.writeLong(j);
        b(31, Db);
    }

    public final void onActivityStarted(a aVar, long j) {
        Parcel Db = Db();
        r.a(Db, (IInterface) aVar);
        Db.writeLong(j);
        b(25, Db);
    }

    public final void onActivityStopped(a aVar, long j) {
        Parcel Db = Db();
        r.a(Db, (IInterface) aVar);
        Db.writeLong(j);
        b(26, Db);
    }

    public final void performAction(Bundle bundle, Hf hf, long j) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) bundle);
        r.a(Db, (IInterface) hf);
        Db.writeLong(j);
        b(32, Db);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) bundle);
        Db.writeLong(j);
        b(8, Db);
    }

    public final void setCurrentScreen(a aVar, String str, String str2, long j) {
        Parcel Db = Db();
        r.a(Db, (IInterface) aVar);
        Db.writeString(str);
        Db.writeString(str2);
        Db.writeLong(j);
        b(15, Db);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel Db = Db();
        r.a(Db, z);
        b(39, Db);
    }

    public final void setUserProperty(String str, String str2, a aVar, boolean z, long j) {
        Parcel Db = Db();
        Db.writeString(str);
        Db.writeString(str2);
        r.a(Db, (IInterface) aVar);
        r.a(Db, z);
        Db.writeLong(j);
        b(4, Db);
    }
}
