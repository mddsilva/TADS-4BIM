package br.univel.model;

public class Item {
	private int value;
	private int limit;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return super.toString()
				+ String.format(" [Value=%d, Limit=%d]", value, limit);
	}
}