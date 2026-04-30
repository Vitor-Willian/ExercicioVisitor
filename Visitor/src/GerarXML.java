public class GerarXML implements Visitor {
    @Override
    public void visitRelatorioA(RelA relatorio) {
        System.out.println("Gerando XML para Relatório tipo A");
    }

    @Override
    public void visitRelatorioB(RelB relatorio) {
        System.out.println("Gerando XML para Relatório tipo B");
    }

    @Override
    public void visitRelatorioC(RelC relatorio) {
        System.out.println("Gerando XML para Relatório tipo C");
    }
    
}
