package at.htl.nvs.microproject.dao;

import at.htl.nvs.microproject.entities.Item;
import at.htl.nvs.microproject.entities.Section;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class DAO {
    @PersistenceContext
    EntityManager em;

    public List<Item> getAllItems() {
        return em.createNamedQuery("Item.getAll").getResultList();
    }

    public List<Section> getAllSections() {
        return em.createNamedQuery("Section.getAll").getResultList();
    }

    public Item getItemById(long id) {
        return (Item)em.createNamedQuery("Item.getById")
                .setParameter("id", id)
                .getSingleResult();
    }

    public Section getSectionById(long id) {
        return (Section)em.createNamedQuery("Section.getById")
                .setParameter("id", id)
                .getSingleResult();
    }

    public void delete(Item i) {
        em.remove(i);
    }

    public void delete(Section s) {
        em.remove(s);
    }

    public void add(Item i) {
        em.persist(i);
    }

    public void add(Section s) {
        em.persist(s);
    }

    public void update(Item i) {
        em.merge(i);
    }

    public void update(Section s) {
        em.merge(s);
    }
}
