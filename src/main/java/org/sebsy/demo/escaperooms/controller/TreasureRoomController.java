package org.sebsy.demo.escaperooms.controller;

import org.sebsy.demo.escaperooms.bll.TreasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Profile("treasure")
public class TreasureRoomController {

    @Autowired
    private TreasureService tresorService;

    public String fin() {
        return tresorService.ouvrir();
    }

    public void setTresorService(TreasureService tresorService) {
        this.tresorService = tresorService;
    }
}
