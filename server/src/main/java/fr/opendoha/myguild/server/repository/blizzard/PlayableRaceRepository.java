package fr.opendoha.myguild.server.repository.blizzard;

import java.util.List;

import fr.opendoha.myguild.server.model.blizzard.Faction;
import fr.opendoha.myguild.server.model.blizzard.PlayableRace;
import fr.opendoha.myguild.server.repository.AbstractRepository;

/**
 * Repository for PlayableRace
 */
public interface PlayableRaceRepository extends AbstractRepository<PlayableRace, Integer> {

    /**
     * Method to get playable races by faction
     */
    List<PlayableRace> findByFaction(Faction faction);

}
