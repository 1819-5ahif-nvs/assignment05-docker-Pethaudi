package at.htl.nvs.microproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Section.getAll", query = "select i from Section i"),
        @NamedQuery(name = "Section.getById", query = "select i from Section i where i.id = :id")
})
public class Section implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany
    private List<Item> items;

    public Section(String name, List<Item> items) {
        this.name = name;
        this.items = items;
    }

    public Section() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
