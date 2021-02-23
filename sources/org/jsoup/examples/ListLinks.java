package org.jsoup.examples;

import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ListLinks {
    private static String a(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i - 1) + ".";
    }

    private static void a(String str, Object... objArr) {
        System.out.println(String.format(str, objArr));
    }

    public static void main(String[] strArr) {
        Validate.isTrue(strArr.length == 1, "usage: supply url to fetch");
        String str = strArr[0];
        a("Fetching %s...", str);
        Document document = Jsoup.connect(str).get();
        Elements select = document.select("a[href]");
        Elements select2 = document.select("[src]");
        Elements select3 = document.select("link[href]");
        a("\nMedia: (%d)", Integer.valueOf(select2.size()));
        Iterator it = select2.iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.tagName().equals("img")) {
                a(" * %s: <%s> %sx%s (%s)", element.tagName(), element.attr("abs:src"), element.attr("width"), element.attr("height"), a(element.attr("alt"), 20));
            } else {
                a(" * %s: <%s>", element.tagName(), element.attr("abs:src"));
            }
        }
        a("\nImports: (%d)", Integer.valueOf(select3.size()));
        Iterator it2 = select3.iterator();
        while (it2.hasNext()) {
            Element element2 = (Element) it2.next();
            a(" * %s <%s> (%s)", element2.tagName(), element2.attr("abs:href"), element2.attr("rel"));
        }
        a("\nLinks: (%d)", Integer.valueOf(select.size()));
        Iterator it3 = select.iterator();
        while (it3.hasNext()) {
            Element element3 = (Element) it3.next();
            a(" * a: <%s>  (%s)", element3.attr("abs:href"), a(element3.text(), 35));
        }
    }
}
