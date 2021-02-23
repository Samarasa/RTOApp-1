package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wja  reason: case insensitive filesystem */
class C2873wja extends X509Certificate {

    /* renamed from: a  reason: collision with root package name */
    private final X509Certificate f12668a;

    public C2873wja(X509Certificate x509Certificate) {
        this.f12668a = x509Certificate;
    }

    public void checkValidity() {
        this.f12668a.checkValidity();
    }

    public void checkValidity(Date date) {
        this.f12668a.checkValidity(date);
    }

    public int getBasicConstraints() {
        return this.f12668a.getBasicConstraints();
    }

    public Set<String> getCriticalExtensionOIDs() {
        return this.f12668a.getCriticalExtensionOIDs();
    }

    public byte[] getExtensionValue(String str) {
        return this.f12668a.getExtensionValue(str);
    }

    public Principal getIssuerDN() {
        return this.f12668a.getIssuerDN();
    }

    public boolean[] getIssuerUniqueID() {
        return this.f12668a.getIssuerUniqueID();
    }

    public boolean[] getKeyUsage() {
        return this.f12668a.getKeyUsage();
    }

    public Set<String> getNonCriticalExtensionOIDs() {
        return this.f12668a.getNonCriticalExtensionOIDs();
    }

    public Date getNotAfter() {
        return this.f12668a.getNotAfter();
    }

    public Date getNotBefore() {
        return this.f12668a.getNotBefore();
    }

    public PublicKey getPublicKey() {
        return this.f12668a.getPublicKey();
    }

    public BigInteger getSerialNumber() {
        return this.f12668a.getSerialNumber();
    }

    public String getSigAlgName() {
        return this.f12668a.getSigAlgName();
    }

    public String getSigAlgOID() {
        return this.f12668a.getSigAlgOID();
    }

    public byte[] getSigAlgParams() {
        return this.f12668a.getSigAlgParams();
    }

    public byte[] getSignature() {
        return this.f12668a.getSignature();
    }

    public Principal getSubjectDN() {
        return this.f12668a.getSubjectDN();
    }

    public boolean[] getSubjectUniqueID() {
        return this.f12668a.getSubjectUniqueID();
    }

    public byte[] getTBSCertificate() {
        return this.f12668a.getTBSCertificate();
    }

    public int getVersion() {
        return this.f12668a.getVersion();
    }

    public boolean hasUnsupportedCriticalExtension() {
        return this.f12668a.hasUnsupportedCriticalExtension();
    }

    public String toString() {
        return this.f12668a.toString();
    }

    public void verify(PublicKey publicKey) {
        this.f12668a.verify(publicKey);
    }

    public void verify(PublicKey publicKey, String str) {
        this.f12668a.verify(publicKey, str);
    }
}
