package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yD  reason: case insensitive filesystem */
public final class C2973yD implements C2963xu, C0872Lu, C1900iv, C0795Iv, C0900Mw, C1540dqa {

    /* renamed from: a  reason: collision with root package name */
    private final Soa f12878a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12879b = false;

    public C2973yD(Soa soa, C2845wR wRVar) {
        this.f12878a = soa;
        soa.a(Uoa.AD_REQUEST);
        if (wRVar != null) {
            soa.a(Uoa.REQUEST_IS_PREFETCH);
        }
    }

    public final void H() {
        this.f12878a.a(Uoa.AD_LOADED);
    }

    public final synchronized void I() {
        this.f12878a.a(Uoa.AD_IMPRESSION);
    }

    public final void O() {
        this.f12878a.a(Uoa.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }

    public final void a(OS os) {
        this.f12878a.a((Voa) new BD(os));
    }

    public final void a(C1824hqa hqa) {
        Soa soa;
        Uoa uoa;
        switch (hqa.f10744a) {
            case 1:
                soa = this.f12878a;
                uoa = Uoa.AD_FAILED_TO_LOAD_INVALID_REQUEST;
                break;
            case 2:
                soa = this.f12878a;
                uoa = Uoa.AD_FAILED_TO_LOAD_NETWORK_ERROR;
                break;
            case 3:
                soa = this.f12878a;
                uoa = Uoa.AD_FAILED_TO_LOAD_NO_FILL;
                break;
            case 4:
                soa = this.f12878a;
                uoa = Uoa.AD_FAILED_TO_LOAD_TIMEOUT;
                break;
            case 5:
                soa = this.f12878a;
                uoa = Uoa.AD_FAILED_TO_LOAD_CANCELLED;
                break;
            case 6:
                soa = this.f12878a;
                uoa = Uoa.AD_FAILED_TO_LOAD_NO_ERROR;
                break;
            case 7:
                soa = this.f12878a;
                uoa = Uoa.AD_FAILED_TO_LOAD_NOT_FOUND;
                break;
            default:
                soa = this.f12878a;
                uoa = Uoa.AD_FAILED_TO_LOAD;
                break;
        }
        soa.a(uoa);
    }

    public final void a(C1963jpa jpa) {
        this.f12878a.a((Voa) new CD(jpa));
        this.f12878a.a(Uoa.REQUEST_PREFETCH_INTERCEPTED);
    }

    public final void a(C2515ri riVar) {
    }

    public final void b(C1963jpa jpa) {
        this.f12878a.a((Voa) new DD(jpa));
        this.f12878a.a(Uoa.REQUEST_SAVED_TO_CACHE);
    }

    public final void c(C1963jpa jpa) {
        this.f12878a.a((Voa) new AD(jpa));
        this.f12878a.a(Uoa.REQUEST_LOADED_FROM_CACHE);
    }

    public final void h(boolean z) {
        this.f12878a.a(z ? Uoa.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED : Uoa.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED);
    }

    public final void i(boolean z) {
        this.f12878a.a(z ? Uoa.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED : Uoa.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED);
    }

    public final synchronized void onAdClicked() {
        if (!this.f12879b) {
            this.f12878a.a(Uoa.AD_FIRST_CLICK);
            this.f12879b = true;
            return;
        }
        this.f12878a.a(Uoa.AD_SUBSEQUENT_CLICK);
    }
}
