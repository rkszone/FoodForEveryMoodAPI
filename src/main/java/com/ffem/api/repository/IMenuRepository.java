package com.ffem.api.repository;

import com.ffem.api.entities.MenuItems;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * IMenuRepository is responsible for Menu CRUD operations
 */
@Repository
public interface IMenuRepository extends PagingAndSortingRepository<MenuItems,Long> {
}
