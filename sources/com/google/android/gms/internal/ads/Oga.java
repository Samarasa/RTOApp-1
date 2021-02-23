package com.google.android.gms.internal.ads;

public abstract class Oga {
    public static Oga a(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new Lga(cls.getSimpleName()) : new Nga(cls.getSimpleName());
    }

    public abstract void a(String str);
}
