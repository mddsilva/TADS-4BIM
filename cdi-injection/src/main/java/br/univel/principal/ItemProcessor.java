package br.univel.principal;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.univel.dao.ItemDao;
import br.univel.model.Item;
import br.univel.qualifiers.Demo;

@Named
@RequestScoped
public class ItemProcessor
{
	@Inject @Demo
	private ItemDao itemDao;


    public void execute() {
        List<Item> items = itemDao.fetchItems();
        for (Item item : items) {
            System.out.println("Found item " + item);
        }
    }
	
}