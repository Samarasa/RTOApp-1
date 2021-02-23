package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class r extends s {

    /* renamed from: a  reason: collision with root package name */
    private final List<e<?>> f14472a;

    public r(List<e<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f14472a = list;
    }
}
