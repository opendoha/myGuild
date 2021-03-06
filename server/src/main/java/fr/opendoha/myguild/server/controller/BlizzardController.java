package fr.opendoha.myguild.server.controller;

import fr.opendoha.myguild.server.dto.StaticDataDTO;
import fr.opendoha.myguild.server.service.BlizzardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Controller used to manage blizzard data
 */
@RestController
@RequestMapping("blizzard")
public class BlizzardController extends MotherController {

    protected final BlizzardService blizzardService;

    /**
     * Constructor
     */
    @Autowired
    public BlizzardController(final BlizzardService blizzardService) {
        super();
        this.blizzardService = blizzardService;
    }

    /**
     * Method used to fetch all static data (playable class, playable race, etc...)
     */
    @GetMapping("/fetchStaticData")
    public void fetchStaticData() throws IOException {
        this.blizzardService.fetchStaticData();
    }

    /**
     * Method used to get all static data (playable class, playable race, etc...)
     */
    @GetMapping("/getStaticData")
    public StaticDataDTO getStaticData() {
        return this.blizzardService.getStaticData();
    }

}
