package com.algaworks.respository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.algaworks.model.Caminhao;
import com.algaworks.model.Motorista;
import com.algaworks.model.Seguro;

public class Motoristas {

	private Map<String, Optional<Motorista>> motoristas = new HashMap<>();

	public Motoristas() {
		Seguro seguro = new Seguro("Parcial - n�o cobre roubo", new BigDecimal("5000"));

		Caminhao caminhao = new Caminhao("Mercedes Atron", Optional.ofNullable(seguro));
		Optional<Motorista> motoristaJoao = Optional.of(new Motorista("Joao", 40, Optional.ofNullable(caminhao)));
		Optional<Motorista> motoristaJose = Optional.of(new Motorista("Jos�", 25, Optional.ofNullable(null)));

		motoristas.put("Jo�o", motoristaJoao);
		motoristas.put("Jos�", motoristaJose);
	}

	public Optional<Motorista> porNome(String nome) {
		return motoristas.get(nome);
	}

}
