package com.algaworks.teste;

import com.algaworks.model.Caminhao;
import com.algaworks.model.Motorista;
import com.algaworks.model.Seguro;
import com.algaworks.respository.Motoristas;

public class ConsultaCobertura {

	public static void main(String[] args) {
		Motoristas motoristas = new Motoristas();
		//Motorista motorista = motoristas.porNome("João");

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

		//System.out.println("A cobertura é: " + cobertura);

	}

}
