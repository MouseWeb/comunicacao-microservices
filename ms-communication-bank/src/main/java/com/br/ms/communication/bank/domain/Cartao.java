package com.br.ms.communication.bank.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cartao")
/* Anotações do lombok
 -- @Data = Cria todos os getter e setter
 -- @AllArgsConstructor = Cria um construtor com todos os argumentos
 -- @NoArgsConstructor = Cria um construtor sem nenhum argumento
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cartao {

	@Id
	@GeneratedValue
	private Long id;
	private Integer nroCartao;
	private Integer codigoSegurancaCartao;
	private BigDecimal valorCredito;

}
