package com.ffem.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Menu item has all required fields of Item Entity
 */
@Data
@Entity
@Table(name = "MENUITEM")
@EqualsAndHashCode
@ToString(includeFieldNames = true)
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id",nullable = false)
    @JsonProperty("id")
    private long id;

    @JsonProperty("name")
    @Column( name = "name",nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(
            name = "mood_item",
            joinColumns = @JoinColumn(name = "menuitem_id"),
            inverseJoinColumns = @JoinColumn(name = "mood_id"))
    Set<Mood> moodItems;

}
