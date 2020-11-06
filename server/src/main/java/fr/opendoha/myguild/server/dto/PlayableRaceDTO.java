package fr.opendoha.myguild.server.dto;

import fr.opendoha.myguild.server.model.blizzard.PlayableRace;
import lombok.Data;

@Data
public class PlayableRaceDTO {

    private Integer index;
    private LocalizedStringDTO localizedStringDTO;

    /**
     * DTO Builder
     */
    public void build(final PlayableRace playableRace) {
        this.index = playableRace.getId();

        this.localizedStringDTO = new LocalizedStringDTO();
        this.localizedStringDTO.build(playableRace.getLocalizedModel());

    }
    
}