package fr.opendoha.myguild.server.service;


import fr.opendoha.myguild.server.dto.UserAccountDTO;
import fr.opendoha.myguild.server.exception.UserAccountNotExistedException;
import fr.opendoha.myguild.server.exception.UserEmailAlreadyUsedException;
import fr.opendoha.myguild.server.exception.UserNickNameAlreadyUsedException;
import fr.opendoha.myguild.server.parameters.UserRegistrationParameter;

/**
 * Interface of the user service
 */
public interface IUserService {

    /**
     * Method to register a new user account
     * @param userRegistrationParameter Parameters of the new account
     * @throws UserEmailAlreadyUsedException    if the email is already used
     * @throws UserNickNameAlreadyUsedException if the nick name is already used
     */
    void registerNewUserAccount(UserRegistrationParameter userRegistrationParameter) throws
            UserEmailAlreadyUsedException, UserNickNameAlreadyUsedException;

    /**
     * Method to check if a account exist
     * @param blizzardId of the account
     * @return true if the account exist, false otherwise
     */
    Boolean checkUserAccountAlreadyExist(Integer blizzardId);

    /**
     * Method to get the account information
     * @param blizzardId of the account
     * @return DTO with the information
     * @throws UserAccountNotExistedException if the account doesn't exist
     */
    UserAccountDTO getAccountInfo(final Integer blizzardId) throws UserAccountNotExistedException;

}
