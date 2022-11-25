import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColaboradorTest {
    @Test
    void deveRetornarExceededColaborador() {
        Colaborador colaborador = new Colaborador();
        colaborador.setAvaliacao("Exceeded");

        assertEquals("Exceeded", colaborador.getAvaliacao());
    }
    @Test
    void deveRetornarAchievedColaborador() {
        Colaborador colaborador = new Colaborador();
        colaborador.setAvaliacao("Achieved");

        assertEquals("Achieved", colaborador.getAvaliacao());
    }
    @Test
    void deveRetornarPartiallyAchievedColaborador() {
        Colaborador colaborador = new Colaborador();
        colaborador.setAvaliacao("Partially achieved");

        assertEquals("Partially achieved", colaborador.getAvaliacao());
    }
    @Test
    void deveRetornarNotAchievedColaborador() {
        Colaborador colaborador = new Colaborador();
        colaborador.setAvaliacao("Not achieved");

        assertEquals("Not achieved", colaborador.getAvaliacao());
    }

    @Test
    void deveRetornarPorcentagemExceedeColaborador() {
        Colaborador colaborador = new Colaborador();
        colaborador.setAvaliacao("Exceeded");

        assertEquals(1.25f, colaborador.getPorcentagem());
    }
    @Test
    void deveRetornarPorcentagemAchievedColaborador() {
        Colaborador colaborador = new Colaborador();
        colaborador.setAvaliacao("Achieved");

        assertEquals(1.0f, colaborador.getPorcentagem());
    }
    @Test
    void deveRetornarPorcentagemPartiallyAchievedColaborador() {
        Colaborador colaborador = new Colaborador();
        colaborador.setAvaliacao("Partially achieved");

        assertEquals(0.5f, colaborador.getPorcentagem());
    }
    @Test
    void deveRetornarPorcentagemNotAchievedColaborador() {
        Colaborador colaborador = new Colaborador();
        colaborador.setAvaliacao("Not achieved");

        assertEquals(0.0f, colaborador.getPorcentagem());
    }
}
