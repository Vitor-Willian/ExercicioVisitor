public class RelC implements GenRelatorio {
    @Override
    public void aceitar(Visitor v) {
        v.visitRelatorioC(this);
    }
    
}
