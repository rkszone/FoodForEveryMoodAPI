package com.ffem.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * MOOD has all the fields of mood Entity
 */
@Data
@Entity
@Table(name = "MOOD")
@EqualsAndHashCode
@ToString(includeFieldNames = true, exclude = {"MenuItem"})
public class Mood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id",nullable = false)
    @JsonProperty("id")
    private long id;

    @JsonProperty("mood_type")
    @Column( name = "mood_type",nullable = true)
    private String moodType;

    @ManyToMany(mappedBy = "moodItems")
    Set<MenuItem> items;


}
