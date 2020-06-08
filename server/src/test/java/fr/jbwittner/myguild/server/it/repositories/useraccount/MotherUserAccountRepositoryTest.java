package fr.jbwittner.myguild.server.it.repositories.useraccount;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.jbwittner.myguild.server.it.AbstractMotherTest;
import fr.jbwittner.myguild.server.model.UserAccount;
import fr.jbwittner.myguild.server.repository.UserAccountRepository;
import fr.jbwittner.myguild.server.tools.exceptions.DataInitialisationException;


/**
 * Class to prepare test of user account repository
 */
public class MotherUserAccountRepositoryTest extends AbstractMotherTest {

    static final Integer MIN_ACCOUNT_TYPE = 25;
    static final Integer MAX_ACCOUNT_TYPE = 50;

    final protected List<UserAccount> userAccountList = new ArrayList<>();

    protected UserAccount randomUserAccount;

    @Autowired
    protected UserAccountRepository userAccountRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public void initDataBeforeEach() throws DataInitialisationException{

        final Integer numberUserAccount = this.factory.getRandomInteger(MIN_ACCOUNT_TYPE, MAX_ACCOUNT_TYPE);

        UserAccount userAccount;

        for (int i = 0; i < numberUserAccount; i++) {
            userAccount = this.factory.createUserAccount();
            this.userAccountList.add(userAccount);
            this.userAccountRepository.save(userAccount);
        }

        this.randomUserAccount = this.userAccountList.get(this.factory.getRandomInteger(0, numberUserAccount));

        this.userAccountRepository.flush();

        this.checkDataCount(this.userAccountRepository.count());

    }

}