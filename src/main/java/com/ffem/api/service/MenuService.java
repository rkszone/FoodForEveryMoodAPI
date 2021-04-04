package com.ffem.api.service;

import com.ffem.api.repository.IMenuRepository;
import com.ffem.api.repository.IMoodRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for activity
 */
@Data
@Service
@Slf4j
public class MenuService implements IMenuService {

    @Autowired
    private IMoodRepository moodRepository;

    @Autowired
    private IMenuRepository menuRepository;

    public MenuService(IMenuRepository menuRepository, IMoodRepository moodRepository) {
        this.menuRepository = menuRepository;
        this.moodRepository = moodRepository;
    }

}
