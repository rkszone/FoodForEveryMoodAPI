package com.ffem.api.controller;

import com.ffem.api.exception.FFEMException;
import com.ffem.api.service.IMenuService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;


/**
 * Order Controller has all activity resources
 */
@Data
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("order")
public class OrderController {

    private IMenuService menuService;

    OrderController(IMenuService activityService) {
        this.menuService = menuService;
    }

    /**
     * Get Menu
     * @param mood mood
     * @param timeOfDay timeOfday
     * @return List of menu items
     * @throws FFEMException when something went wrong;
     */
    @GetMapping("/getmenu")
    public String getMenu(@RequestParam(value = "mood", required = false) String mood,
                          @RequestParam(value = "timeOfDay",required = false) String timeOfDay) throws FFEMException {
        if(mood != null && timeOfDay != null){
            return "there nothing"+mood+timeOfDay;
        } else {
            return "there nothing";
        }

    }
}
