package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.internal.ads.jsa;

public class MobileAdsInitProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    private final jsa f5346a = new jsa();

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f5346a.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f5346a.delete(uri, str, strArr);
    }

    public String getType(Uri uri) {
        return this.f5346a.getType(uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return this.f5346a.insert(uri, contentValues);
    }

    public boolean onCreate() {
        return this.f5346a.onCreate();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f5346a.query(uri, strArr, str, strArr2, str2);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f5346a.update(uri, contentValues, str, strArr);
    }
}
