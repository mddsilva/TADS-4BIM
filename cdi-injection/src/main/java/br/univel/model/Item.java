package br.univel.model;

public class Item {
	private int value;
	private int limit;

	@Override
	public String toString() {
		return super.toString()
				+ String.format(" [Value=%d, Limit=%d]", value, limit);
	}
}