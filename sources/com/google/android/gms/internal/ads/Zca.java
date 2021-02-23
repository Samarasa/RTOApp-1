package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1373bda;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class Zca<T_WRAPPER extends C1373bda<T_ENGINE>, T_ENGINE> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f9558a = Logger.getLogger(Zca.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final List<Provider> f9559b;

    /* renamed from: c  reason: collision with root package name */
    public static final Zca<C1302ada, Cipher> f9560c = new Zca<>(new C1302ada());

    /* renamed from: d  reason: collision with root package name */
    public static final Zca<C1585eda, Mac> f9561d = new Zca<>(new C1585eda());

    /* renamed from: e  reason: collision with root package name */
    private static final Zca<C1727gda, Signature> f9562e = new Zca<>(new C1727gda());

    /* renamed from: f  reason: collision with root package name */
    private static final Zca<C1798hda, MessageDigest> f9563f = new Zca<>(new C1798hda());

    /* renamed from: g  reason: collision with root package name */
    public static final Zca<C1515dda, KeyAgreement> f9564g = new Zca<>(new C1515dda());

    /* renamed from: h  reason: collision with root package name */
    public static final Zca<C1656fda, KeyPairGenerator> f9565h = new Zca<>(new C1656fda());
    public static final Zca<C1444cda, KeyFactory> i = new Zca<>(new C1444cda());
    private T_WRAPPER j;
    private List<Provider> k = f9559b;
    private boolean l = true;

    static {
        if (C2436qda.a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f9558a.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f9559b = arrayList;
        } else {
            f9559b = new ArrayList();
        }
    }

    private Zca(T_WRAPPER t_wrapper) {
        this.j = t_wrapper;
    }

    public final T_ENGINE a(String str) {
        Exception exc = null;
        for (Provider a2 : this.k) {
            try {
                return this.j.a(str, a2);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (this.l) {
            return this.j.a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
