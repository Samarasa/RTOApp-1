package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.p;

public final class LM implements JO<MM> {

    /* renamed from: a  reason: collision with root package name */
    private final PY f7665a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7666b;

    public LM(PY py, Context context) {
        this.f7665a = py;
        this.f7666b = context;
    }

    public final LY<MM> a() {
        return this.f7665a.a(new OM(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ MM b() {
        AudioManager audioManager = (AudioManager) this.f7666b.getSystemService("audio");
        return new MM(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), p.h().a(), p.h().b());
    }
}
