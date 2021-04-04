package com.ffem.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * MOOD has all the fields of mood Entity
 */
@Data
@Entity
@Table(name = "MOOD")
@EqualsAndHashCode
@ToString(includeFieldNames = true, exclude = {"MenuItems"})
public class Mood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id",nullable = false)
    @JsonProperty("id")
    private long id;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "menuitems_id")
    private List<MenuItems> menuItems;

    @JsonProperty("mood_type")
    @Column( name = "mood_type",nullable = true)
    private String moodType;
}
