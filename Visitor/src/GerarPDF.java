public class GerarPDF implements Visitor {
    @Override
    public void visitRelatorioA(RelA relatorio) {
        System.out.println("Gerando PDF do Relatório tipo A");
    }

    @Override
    public void visitRelatorioB(RelB relatorio) {
        System.out.println("Gerando PDF do Relatório tipo B");
    }

    @Override
    public void visitRelatorioC(RelC relatorio) {
        System.out.println("Gerando PDF do Relatório tipo C");
    }
    
}
