package org.jsoup.nodes;

import org.jsoup.select.NodeVisitor;

class d implements NodeVisitor {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f15451a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Node f15452b;

    d(Node node, String str) {
        this.f15452b = node;
        this.f15451a = str;
    }

    public void head(Node node, int i) {
        node.f15441e = this.f15451a;
    }

    public void tail(Node node, int i) {
    }
}
