public class RelC implements Relatorio {
    @Override
    public void aceitar(Visitor v) {
        v.visitRelatorioC(this);
    }
    
}
