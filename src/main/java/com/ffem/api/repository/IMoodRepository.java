package com.ffem.api.repository;

import com.ffem.api.entities.Mood;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * IMoodRepository is responsible for Mood CRUD operations
 */
@Repository
public interface IMoodRepository extends PagingAndSortingRepository<Mood,Long> {
}
