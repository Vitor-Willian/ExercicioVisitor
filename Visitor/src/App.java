import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<GenRelatorio> relatorios = new ArrayList<>();
        relatorios.add(new RelA());
        relatorios.add(new RelB());
        relatorios.add(new RelC());

        Visitor visitor_pdf = new GerarPDF();
        Visitor visitor_xml = new GerarXML();
        Visitor visitor_html = new GerarHTML();

        for (GenRelatorio rel : relatorios) {
            rel.aceitar(visitor_pdf);
            rel.aceitar(visitor_xml);
            rel.aceitar(visitor_html);
            System.out.println("\n");
        }
    }
}
