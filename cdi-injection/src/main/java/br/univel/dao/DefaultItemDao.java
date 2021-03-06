package br.univel.dao;

import java.util.ArrayList;
import java.util.List;

import br.univel.model.Item;
import br.univel.qualifiers.Demo;

@Demo
public class DefaultItemDao implements ItemDao {

    @Override
    public List<Item> fetchItems() {
        List<Item> results = new ArrayList<Item>();
        results.add(new Item(34, 7));
        results.add(new Item(4, 37));
        results.add(new Item(24, 19));
        results.add(new Item(89, 32));
        return results;
    }
}