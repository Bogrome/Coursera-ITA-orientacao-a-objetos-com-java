import static org.junit.Assert.*;

import org.junit.Test;

public class PacienteTest {

    @Test
    public void testCalcularIMC() {
	Paciente paciente = new Paciente(0, 0);
	ass
    }

    @Test
    public void testDiagnosticoBaixoPesoMuitoGrave() {
	Paciente paciente = new Paciente(0, 1);
	
	assertEquals("Baixo peso muito grave", paciente.diagnostico());

    }

}
