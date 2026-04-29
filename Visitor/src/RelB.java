public class RelB implements Relatorio {
    @Override
    public void aceitar(Visitor v) {
        v.visitRelatorioB(this);
    }
    
}
