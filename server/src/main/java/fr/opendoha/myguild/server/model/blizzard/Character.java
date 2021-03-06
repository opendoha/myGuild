package fr.opendoha.myguild.server.model.blizzard;

import fr.opendoha.myguild.server.model.UserAccount;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Model for the characters
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "CHARACTERS")
@Data
public class Character extends AbstractBlizzardModel {

    @Column(name = "NAME")
    private String name;

    @Column(name = "LEVEL")
    private Integer level;

    @ManyToOne
    @JoinColumn(name = "USER_ACCOUNT_ID")
    private UserAccount userAccount;

    @ManyToOne
    @JoinColumn(name = "GUILD_ID")
    private Guild guild;

    @ManyToOne
    @JoinColumn(name = "REALM_ID")
    private Realm realm;

    @ManyToOne
    @JoinColumn(name = "PLAYABLE_CLASS_ID")
    private PlayableClass playableClass;

    @ManyToOne
    @JoinColumn(name = "PLAYABLE_RACE_ID")
    private PlayableRace playableRace;

    @ManyToOne
    @JoinColumn(name = "COVENANT_ID")
    private Covenant covenant;

    @Column(name = "RENOWN_LEVEL")
    private Integer renownLevel;

    @ManyToOne
    @JoinColumn(name = "GUILD_RANK_ID")
    private GuildRank guildRank;

    @ManyToOne
    @JoinColumn(name = "FACTION_ID")
    private Faction faction;

    @Column(name= "IS_FAVORITE")
    private boolean isFavorite = false;

    @Column(name = "AVERAGE_ITEM_LEVEL")
    private Integer averageItemLevel;

    @Column(name = "EQUIPPED_ITEM_LEVEL")
    private Integer equippedItemLevel;

    @Column(name = "LAST_LOGIN_TIMESTAMP")
    private Long lastLoginTimestamp;

    /**
     * Methode used to set is favorites to true
     */
    public void setIsFavoritesTrue(){
        this.isFavorite = true;
    }

    /**
     * Methode used to set is favorites to false
     */
    public void setIsFavoritesFalse(){
        this.isFavorite = false;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", id=" + id +
                '}';
    }
}
