package com.ffem.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Menu items has all required fields of Items Entity
 */
@Data
@Entity
@Table(name = "MENUITEMS")
@EqualsAndHashCode
@ToString(includeFieldNames = true)
public class MenuItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id",nullable = false)
    @JsonProperty("id")
    private long id;

    @JsonProperty("name")
    @Column( name = "name",nullable = false)
    private String name;


    @ManyToMany(mappedBy = "menuitem")
    private List<Mood> moodList = new ArrayList<>();

}
