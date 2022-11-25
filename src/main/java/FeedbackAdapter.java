public class FeedbackAdapter extends FeedbackPorcentagem {

    private IAvaliacao avaliacaoFinalDeAno;

    public FeedbackAdapter(IAvaliacao avaliacaoFinalDeAno) {
        this.avaliacaoFinalDeAno = avaliacaoFinalDeAno;
    }

    public String recuperarAvaliacao() {
        if (this.getPorcentagem() >= 1.25f)
            avaliacaoFinalDeAno.setAvaliacao("Exceeded");
        else
        if (this.getPorcentagem() >= 1.0f)
            avaliacaoFinalDeAno.setAvaliacao("Achieved");
        else
        if (this.getPorcentagem() >= 0.5f)
            avaliacaoFinalDeAno.setAvaliacao("Partially achieved");
        else
            avaliacaoFinalDeAno.setAvaliacao("Not achieved");
        return avaliacaoFinalDeAno.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoFinalDeAno.getAvaliacao().equals("Exceeded"))
            this.setPorcentagem(1.25f);
        else
        if (avaliacaoFinalDeAno.getAvaliacao().equals("Achieved"))
            this.setPorcentagem(1.0f);
        else
        if (avaliacaoFinalDeAno.getAvaliacao().equals("Partially achieved"))
            this.setPorcentagem(0.5f);
        else
            this.setPorcentagem(0.0f);
    }
}
