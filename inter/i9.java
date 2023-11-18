// Searchable interface
interface Searchable {
    void search(String keyword);
}

// Document class implementing Searchable interface
class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void search(String keyword) {
        if (content.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in the document.");
        } else {
            System.out.println("Keyword '" + keyword + "' not found in the document.");
        }
    }
}

// WebPage class implementing Searchable interface
class WebPage implements Searchable {
    private String url;
    private String htmlContent;

    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

    @Override
    public void search(String keyword) {
        if (htmlContent.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found on the webpage " + url + ".");
        } else {
            System.out.println("Keyword '" + keyword + "' not found on the webpage " + url + ".");
        }
    }
}

// Main class to test the Searchable interface and classes
public class i9{
    public static void main(String[] args) {
        // Create instances of Document and WebPage
        Document document = new Document("This is a sample document content.");
        WebPage webPage = new WebPage("https://example.com", "<html><body>Web page content</body></html>");

        // Search for keywords in Document and WebPage
        searchKeyword(document, "sample");
        searchKeyword(webPage, "Web page");
    }

    // Helper method to search for a keyword in any object implementing the Searchable interface
    public static void searchKeyword(Searchable searchable, String keyword) {
        searchable.search(keyword);
    }
}
