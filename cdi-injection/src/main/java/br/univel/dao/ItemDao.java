package br.univel.dao;

import java.util.List;

import br.univel.model.Item;

public interface ItemDao
{
	 List<Item> fetchItems();
}