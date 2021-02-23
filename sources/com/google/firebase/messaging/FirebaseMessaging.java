package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import c.b.b.a.g;
import c.b.d.e;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;

public class FirebaseMessaging {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f14623a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: b  reason: collision with root package name */
    static g f14624b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f14625c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseInstanceId f14626d;

    FirebaseMessaging(e eVar, FirebaseInstanceId firebaseInstanceId, g gVar) {
        this.f14625c = eVar.b();
        f14624b = gVar;
        this.f14626d = firebaseInstanceId;
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.a(FirebaseMessaging.class);
        }
        return firebaseMessaging;
    }
}
