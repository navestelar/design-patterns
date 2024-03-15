package builder;

public class HtmlBuilder {
    private StringBuilder html = new StringBuilder();

    public HtmlBuilder openTag(String tag) {
        html.append("<").append(tag).append(">");
        return this;
    }

    public HtmlBuilder closeTag(String tag) {
        html.append("</").append(tag).append(">");
        return this;
    }

    public HtmlBuilder text(String text) {
        html.append(text);
        return this;
    }

    public String build() {
        return html.toString();
    }
}