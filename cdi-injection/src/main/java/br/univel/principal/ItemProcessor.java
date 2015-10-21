package br.univel.principal;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.univel.dao.ItemDao;
import br.univel.model.Item;

@Named
@RequestScoped
public class ItemProcessor
{
	private ItemDao itemDao;

    public void execute() {
        List<Item> items = itemDao.fetchItems();
        for (Item item : items) {
            System.out.println("Found item " + item);
        }
    }
	
}