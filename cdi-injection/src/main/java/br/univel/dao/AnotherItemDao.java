package br.univel.dao;

import java.util.ArrayList;
import java.util.List;

import br.univel.model.Item;

public class AnotherItemDao implements ItemDao {

    @Override
    public List<Item> fetchItems() {
        List<Item> results = new ArrayList<Item>();
        results.add(new Item(99, 9));
        return results;
    }
}