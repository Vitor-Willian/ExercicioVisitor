public class RelA implements GenRelatorio {
    @Override
    public void aceitar(Visitor v) {
        v.visitRelatorioA(this);
    }
    
}
