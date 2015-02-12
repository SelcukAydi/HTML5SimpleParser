package com.html5parser.SimplestTreeParser;

public class Token {

	public enum TokenType {
		DOCTYPE, start_tag, end_tag, comment, character, end_of_file
	}

	private String value;
	private TokenType type;

	/**
	 * Create a new instance of a Token object.
	 */
	public Token() {

	}

	/**
	 * Create a new instance of a Token object.
	 * 
	 * @param _type
	 *            The token type (e.g. DOCTYPE, start_tag, end_tag, comment,
	 *            character, end_of_file).
	 * @param _value
	 *            The value of the token as a string.
	 */
	public Token(Token.TokenType _type, String _value) {
		this.setType(_type);
		this.setValue(_value);
	}

	public TokenType getType() {
		return type;
	}

	public void setType(TokenType type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
