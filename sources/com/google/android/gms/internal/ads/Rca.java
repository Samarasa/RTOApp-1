package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Rca {

    /* renamed from: a  reason: collision with root package name */
    private static Cipher f8487a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f8488b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f8489c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final SecureRandom f8490d = null;

    public Rca(SecureRandom secureRandom) {
    }

    private static Cipher a() {
        Cipher cipher;
        synchronized (f8489c) {
            if (f8487a == null) {
                f8487a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f8487a;
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f8488b) {
                    a().init(1, secretKeySpec, (SecureRandom) null);
                    doFinal = a().doFinal(bArr2);
                    iv = a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return C2695uJ.a(bArr3, false);
            } catch (NoSuchAlgorithmException e2) {
                throw new C2438qea(this, e2);
            } catch (InvalidKeyException e3) {
                throw new C2438qea(this, e3);
            } catch (IllegalBlockSizeException e4) {
                throw new C2438qea(this, e4);
            } catch (NoSuchPaddingException e5) {
                throw new C2438qea(this, e5);
            } catch (BadPaddingException e6) {
                throw new C2438qea(this, e6);
            }
        } else {
            throw new C2438qea(this);
        }
    }

    public final byte[] a(String str) {
        try {
            byte[] a2 = C2695uJ.a(str, false);
            if (a2.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(a2, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new C2438qea(this);
        } catch (IllegalArgumentException e2) {
            throw new C2438qea(this, e2);
        }
    }

    public final byte[] a(byte[] bArr, String str) {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] a2 = C2695uJ.a(str, false);
                if (a2.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(a2.length);
                    allocate.put(a2);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(a2.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f8488b) {
                        a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new C2438qea(this);
            } catch (NoSuchAlgorithmException e2) {
                throw new C2438qea(this, e2);
            } catch (InvalidKeyException e3) {
                throw new C2438qea(this, e3);
            } catch (IllegalBlockSizeException e4) {
                throw new C2438qea(this, e4);
            } catch (NoSuchPaddingException e5) {
                throw new C2438qea(this, e5);
            } catch (BadPaddingException e6) {
                throw new C2438qea(this, e6);
            } catch (InvalidAlgorithmParameterException e7) {
                throw new C2438qea(this, e7);
            } catch (IllegalArgumentException e8) {
                throw new C2438qea(this, e8);
            }
        } else {
            throw new C2438qea(this);
        }
    }
}
