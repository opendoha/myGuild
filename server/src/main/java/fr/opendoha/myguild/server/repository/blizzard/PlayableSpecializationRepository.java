package fr.opendoha.myguild.server.repository.blizzard;

import java.util.List;

import fr.opendoha.myguild.server.model.blizzard.PlayableSpecialization;
import fr.opendoha.myguild.server.repository.AbstractRepository;

/**
 * Repository for PlayableSpecialization
 */
public interface PlayableSpecializationRepository extends AbstractRepository<PlayableSpecialization, Integer> {

    /**
     * Method to find a playable specialization by is updated
     */
    List<PlayableSpecialization> findByIsUpdatedTrue();

}
