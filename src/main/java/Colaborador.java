public class Colaborador {

    IAvaliacao avaliacao;
    FeedbackAdapter persistencia;

    public Colaborador() {
        avaliacao = new FeedbackFinalDeAno();
        persistencia = new FeedbackAdapter(avaliacao);
    }

    public void setAvaliacao(String finalDeAno) {
        avaliacao.setAvaliacao(finalDeAno);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getPorcentagem() {
        return persistencia.getPorcentagem();
    }
}
