package com.algaworks.respository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.algaworks.model.Caminhao;
import com.algaworks.model.Motorista;
import com.algaworks.model.Seguro;

public class Motoristas {

	private Map<String, Motorista> motoristas = new HashMap<>();

	public Motoristas() {
		Seguro seguro = new Seguro("Parcial - n�o cobre roubo", new BigDecimal("5000"));
		
		Caminhao caminhao = new Caminhao("Mercedres Atron", seguro);
		
		Motorista motoristaJoao = new Motorista("Joao", 40, caminhao);
		Motorista motoristaJose = new Motorista("Jos�", 25, null);

		motoristas.put("Jo�o", motoristaJoao);
		motoristas.put("Jos�", motoristaJose);
	}

	public Motorista porNome(String nome) {
		return motoristas.get(nome);
	}

}
