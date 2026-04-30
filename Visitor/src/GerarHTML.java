public class GerarHTML implements Visitor {
    @Override
    public void visitRelatorioA(RelA relatorio) {
        System.out.println("Gerando HTML para Relatório tipo A");
    }

    @Override
    public void visitRelatorioB(RelB relatorio) {
        System.out.println("Gerando HTML para Relatório tipo B");
    }

    @Override
    public void visitRelatorioC(RelC relatorio) {
        System.out.println("Gerando HTML para Relatório tipo C");
    }
    
}
