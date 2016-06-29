package com.cebin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AutoridadeTest {

    

    @Test
    public void testAutoridadeInformal() {
	Autoridade autoridade = new Autoridade("Daniele", "Cebin", new Informal());
	assertEquals("Daniele", autoridade.getTratamento());

    }

    @Test
    public void testAutoridadeComTitulo() {
	Autoridade autoridade = new Autoridade("Daniele", "Cebin", new ComTitulo("Professora"));
	assertEquals("Professora Daniele Cebin", autoridade.getTratamento());

    }

    @Test
    public void testAutoridadeRespeitoso() {
	Autoridade autoridade = new Autoridade("Daniele", "Cebin", new Respeitoso("F"));
	assertEquals("Sra. Cebin", autoridade.getTratamento());

    }

    
}
