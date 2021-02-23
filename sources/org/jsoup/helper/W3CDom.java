package org.jsoup.helper;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class W3CDom {

    /* renamed from: a  reason: collision with root package name */
    protected DocumentBuilderFactory f15403a = DocumentBuilderFactory.newInstance();

    protected static class W3CBuilder implements NodeVisitor {

        /* renamed from: a  reason: collision with root package name */
        private final Document f15404a;

        /* renamed from: b  reason: collision with root package name */
        private final HashMap<String, String> f15405b = new HashMap<>();

        /* renamed from: c  reason: collision with root package name */
        private Element f15406c;

        public W3CBuilder(Document document) {
            this.f15404a = document;
        }

        private String a(org.jsoup.nodes.Element element) {
            String str;
            Iterator<Attribute> it = element.attributes().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str = BuildConfig.FLAVOR;
                if (!hasNext) {
                    break;
                }
                Attribute next = it.next();
                String key = next.getKey();
                if (!key.equals("xmlns")) {
                    if (key.startsWith("xmlns:")) {
                        str = key.substring(6);
                    }
                }
                this.f15405b.put(str, next.getValue());
            }
            int indexOf = element.tagName().indexOf(":");
            return indexOf > 0 ? element.tagName().substring(0, indexOf) : str;
        }

        private void a(Node node, Element element) {
            Iterator<Attribute> it = node.attributes().iterator();
            while (it.hasNext()) {
                Attribute next = it.next();
                String replaceAll = next.getKey().replaceAll("[^-a-zA-Z0-9_:.]", BuildConfig.FLAVOR);
                if (replaceAll.matches("[a-zA-Z_:]{1}[-a-zA-Z0-9_:.]*")) {
                    element.setAttribute(replaceAll, next.getValue());
                }
            }
        }

        public void head(Node node, int i) {
            Document document;
            String wholeData;
            org.w3c.dom.Node createComment;
            if (node instanceof org.jsoup.nodes.Element) {
                org.jsoup.nodes.Element element = (org.jsoup.nodes.Element) node;
                String a2 = a(element);
                Element createElementNS = this.f15404a.createElementNS(this.f15405b.get(a2), element.tagName());
                a(element, createElementNS);
                Element element2 = this.f15406c;
                if (element2 == null) {
                    this.f15404a.appendChild(createElementNS);
                } else {
                    element2.appendChild(createElementNS);
                }
                this.f15406c = createElementNS;
                return;
            }
            if (node instanceof TextNode) {
                document = this.f15404a;
                wholeData = ((TextNode) node).getWholeText();
            } else if (node instanceof Comment) {
                createComment = this.f15404a.createComment(((Comment) node).getData());
                this.f15406c.appendChild(createComment);
            } else if (node instanceof DataNode) {
                document = this.f15404a;
                wholeData = ((DataNode) node).getWholeData();
            } else {
                return;
            }
            createComment = document.createTextNode(wholeData);
            this.f15406c.appendChild(createComment);
        }

        public void tail(Node node, int i) {
            if ((node instanceof org.jsoup.nodes.Element) && (this.f15406c.getParentNode() instanceof Element)) {
                this.f15406c = (Element) this.f15406c.getParentNode();
            }
        }
    }

    public String asString(Document document) {
        try {
            DOMSource dOMSource = new DOMSource(document);
            StringWriter stringWriter = new StringWriter();
            TransformerFactory.newInstance().newTransformer().transform(dOMSource, new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (TransformerException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void convert(org.jsoup.nodes.Document document, Document document2) {
        if (!StringUtil.isBlank(document.location())) {
            document2.setDocumentURI(document.location());
        }
        new NodeTraversor(new W3CBuilder(document2)).traverse(document.child(0));
    }

    public Document fromJsoup(org.jsoup.nodes.Document document) {
        Validate.notNull(document);
        try {
            this.f15403a.setNamespaceAware(true);
            Document newDocument = this.f15403a.newDocumentBuilder().newDocument();
            convert(document, newDocument);
            return newDocument;
        } catch (ParserConfigurationException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
