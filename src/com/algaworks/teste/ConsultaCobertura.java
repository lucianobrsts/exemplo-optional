package com.algaworks.teste;

import com.algaworks.model.Caminhao;
import com.algaworks.model.Motorista;
import com.algaworks.model.Seguro;
import com.algaworks.respository.Motoristas;

public class ConsultaCobertura {

	public static void main(String[] args) {
		Motoristas motoristas = new Motoristas();
		// Motorista motorista = motoristas.porNome("João");

		// Estrutura antes do Optional
		// String cobertura = motorista.getCaminhao().getSeguro().getCobertura();
//		String cobertura = "Sem cobertura";
//		if (motorista != null) {
//			Caminhao caminhao = motorista.getCaminhao();
//			if (caminhao != null) {
//				Seguro seguro = caminhao.getSeguro();
//				if (seguro != null) {
//					cobertura = seguro.getCobertura();
//				}
//			}
//		}
		
		String cobertura = motoristas.porNome("João")
				.flatMap(Motorista::getCaminhao)
				.flatMap(Caminhao::getSeguro)
				.map(Seguro::getCobertura)
				.orElse("Sem Cobertura");


		System.out.println("A cobertura é: " + cobertura);

	}

}
