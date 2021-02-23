package org.jsoup.examples;

import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public class HtmlToPlainText {

    private class a implements NodeVisitor {

        /* renamed from: a  reason: collision with root package name */
        private int f15378a;

        /* renamed from: b  reason: collision with root package name */
        private StringBuilder f15379b;

        private a() {
            this.f15378a = 0;
            this.f15379b = new StringBuilder();
        }

        private void a(String str) {
            if (str.startsWith("\n")) {
                this.f15378a = 0;
            }
            if (str.equals(" ")) {
                if (this.f15379b.length() != 0) {
                    StringBuilder sb = this.f15379b;
                    if (StringUtil.in(sb.substring(sb.length() - 1), " ", "\n")) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (str.length() + this.f15378a > 80) {
                String[] split = str.split("\\s+");
                int i = 0;
                while (i < split.length) {
                    String str2 = split[i];
                    if (!(i == split.length - 1)) {
                        str2 = str2 + " ";
                    }
                    if (str2.length() + this.f15378a > 80) {
                        StringBuilder sb2 = this.f15379b;
                        sb2.append("\n");
                        sb2.append(str2);
                        this.f15378a = str2.length();
                    } else {
                        this.f15379b.append(str2);
                        this.f15378a += str2.length();
                    }
                    i++;
                }
                return;
            }
            this.f15379b.append(str);
            this.f15378a += str.length();
        }

        public void head(Node node, int i) {
            String str;
            String nodeName = node.nodeName();
            if (node instanceof TextNode) {
                str = ((TextNode) node).text();
            } else if (nodeName.equals("li")) {
                str = "\n * ";
            } else if (nodeName.equals("dt")) {
                str = "  ";
            } else if (StringUtil.in(nodeName, "p", "h1", "h2", "h3", "h4", "h5", "tr")) {
                str = "\n";
            } else {
                return;
            }
            a(str);
        }

        public void tail(Node node, int i) {
            String format;
            String nodeName = node.nodeName();
            if (StringUtil.in(nodeName, "br", "dd", "dt", "p", "h1", "h2", "h3", "h4", "h5")) {
                format = "\n";
            } else if (nodeName.equals("a")) {
                format = String.format(" <%s>", new Object[]{node.absUrl("href")});
            } else {
                return;
            }
            a(format);
        }

        public String toString() {
            return this.f15379b.toString();
        }
    }

    public static void main(String... strArr) {
        Validate.isTrue(strArr.length == 1 || strArr.length == 2, "usage: java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]");
        String str = strArr[0];
        String str2 = strArr.length == 2 ? strArr[1] : null;
        Document document = Jsoup.connect(str).userAgent("Mozilla/5.0 (jsoup)").timeout(5000).get();
        HtmlToPlainText htmlToPlainText = new HtmlToPlainText();
        if (str2 != null) {
            Iterator it = document.select(str2).iterator();
            while (it.hasNext()) {
                System.out.println(htmlToPlainText.getPlainText((Element) it.next()));
            }
            return;
        }
        System.out.println(htmlToPlainText.getPlainText(document));
    }

    public String getPlainText(Element element) {
        a aVar = new a();
        new NodeTraversor(aVar).traverse(element);
        return aVar.toString();
    }
}
