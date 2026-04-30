public class RelB implements GenRelatorio {
    @Override
    public void aceitar(Visitor v) {
        v.visitRelatorioB(this);
    }
    
}
