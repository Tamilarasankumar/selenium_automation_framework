package com.enums;

public enum Severity {

	CRITICAL(2), MEDIUM(4), HIGH(6), LOW(8);

	public int getFixinghours() {

		return fixinghours;

	}

	public void setFixinghours(int fixinghours) {

		this.fixinghours = fixinghours;

	}

	private int fixinghours;

	private Severity(int hours) {

		fixinghours=hours;

	}

}