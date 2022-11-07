package com.gl.javafsd.dsa.balancedbrackets;

public class BracketPair {
	
	private Character openChar;
	private Character closedChar;
	
	public BracketPair(Character openChar, Character closeChar) {
		
		this.openChar = openChar;
		this.closedChar = closeChar;
	}
	public Character getOpenChar() {
		return openChar;
	}
	public void setOpenChar(Character openChar) {
		this.openChar = openChar;
	}
	public Character getClosedChar() {
		return closedChar;
	}
	public void setClosedChar(Character closedChar) {
		this.closedChar = closedChar;
	}
	

}
