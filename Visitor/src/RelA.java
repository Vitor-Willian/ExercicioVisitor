public class RelA implements Relatorio {
    @Override
    public void aceitar(Visitor v) {
        v.visitRelatorioA(this);
    }
    
}
