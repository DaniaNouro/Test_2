package src;
import java.util.*;

class ComponentNode {
    String selector;
    HtmlNode htmlNode;
    CssNode cssNode;
    Map<String, String> properties; // اسم الخاصية وقيمتها
    List<String> methods; // أسماء الدوال

    public ComponentNode(String selector) {
        this.selector = selector;
        this.properties = new HashMap<>();
        this.methods = new ArrayList<>();
    }
}

class HtmlNode {
    String tagName;
    Map<String, String> attributes; // مثل [class], (click), *ngFor
    List<HtmlNode> children;

    public HtmlNode(String tagName) {
        this.tagName = tagName;
        this.attributes = new HashMap<>();
        this.children = new ArrayList<>();
    }
}

class CssNode {
    String selector;
    Map<String, String> styles; // اسم الخاصية وقيمتها

    public CssNode(String selector) {
        this.selector = selector;
        this.styles = new HashMap<>();
    }
}

public class Main {
    public static void main(String[] args) {
        // إنشاء شجرة مكون (TypeScript)
        ComponentNode component = new ComponentNode("app-root");

        // إنشاء عقدة HTML وربطها بالمكون
        HtmlNode htmlRoot = new HtmlNode("div");
        htmlRoot.attributes.put("class", "container");

        HtmlNode productGrid = new HtmlNode("div");
        productGrid.attributes.put("class", "product-grid");
        htmlRoot.children.add(productGrid);

        component.htmlNode = htmlRoot;

        // إنشاء عقدة CSS وربطها بالمكون
        CssNode cssRule = new CssNode(".container");
        cssRule.styles.put("display", "flex");
        cssRule.styles.put("flex-direction", "row-reverse");
        component.cssNode = cssRule;

        // عرض الشجرة
        System.out.println("Component: " + component.selector);
        System.out.println("HTML Root: " + component.htmlNode.tagName);
        System.out.println("CSS Styles: " + component.cssNode.styles);
    }
}

