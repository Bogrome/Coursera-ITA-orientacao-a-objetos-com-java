package com.cebin;

public class Respeitoso implements FormatadorNome {

    private String sexo;

    public Respeitoso(String sexo) {
	this.sexo = sexo;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
	if (sexo == "F") {
	    return "Sra. " + sobrenome;
	} else {
	    return "Sr. " + sobrenome;
	}

    }

}
