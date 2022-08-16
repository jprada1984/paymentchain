package com.paymentchain.transaction.entity;

import lombok.Getter;

public enum Status {
	PENDIENTE("01"), LIQUIDADO("02"), RECHAZADO("03"), CANCELADO("04");

	@Getter
	private String code;

	private Status(String code) {
		this.code = code;
	}

}
