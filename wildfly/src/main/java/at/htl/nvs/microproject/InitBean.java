package at.htl.nvs.microproject;

import at.htl.nvs.microproject.dao.DAO;
import at.htl.nvs.microproject.entities.Item;
import at.htl.nvs.microproject.entities.Section;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Singleton
@Startup
public class InitBean {
    @Inject
    DAO dao;

    @PostConstruct
    public void init() {
        Item i1 = new Item("banane", 0.9);
        Item i2 = new Item("apfel", 0.8);
        Item i3 = new Item("cookies", 1.9);
        Item i4 = new Item("Schoki", 3.0);
        Item i5 = new Item("Chips", 0.9);

        dao.add(i1);
        dao.add(i2);
        dao.add(i3);
        dao.add(i4);
        dao.add(i5);

        List<Item> fruits = new ArrayList<>();
        fruits.add(i1);
        fruits.add(i2);
        Section s1 = new Section("obst", fruits);

        List<Item> sweets = new ArrayList<>();
        sweets.add(i3);
        sweets.add(i4);
        sweets.add(i5);
        Section s2 = new Section("sueßes", sweets);

        dao.add(s1);
        dao.add(s2);
    }
}
