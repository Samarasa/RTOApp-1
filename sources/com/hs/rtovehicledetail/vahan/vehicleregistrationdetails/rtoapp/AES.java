package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AES {
    private static final String aesEncryptionAlgorithm = "AES";
    private static final String cipherTransformation = "AES/ECB/PKCS5Padding";

    public static String decrypt(String str, String str2) {
        byte[] bArr;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), aesEncryptionAlgorithm);
            Cipher instance = Cipher.getInstance(cipherTransformation);
            instance.init(2, secretKeySpec);
            bArr = instance.doFinal(Base64.decodeBase64(str));
        } catch (Exception e2) {
            System.out.println(e2.toString());
            bArr = null;
        }
        return new String(bArr);
    }

    public static String encrypt(String str, String str2) {
        byte[] bArr;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), aesEncryptionAlgorithm);
            Cipher instance = Cipher.getInstance(cipherTransformation);
            instance.init(1, secretKeySpec);
            bArr = instance.doFinal(str.getBytes());
        } catch (Exception e2) {
            System.out.println(e2.toString());
            bArr = null;
        }
        return new String(Base64.encodeBase64(bArr));
    }
}
