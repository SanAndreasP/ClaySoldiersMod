package de.sanandrew.mods.claysoldiers.util.soldier;

import com.google.common.collect.Maps;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.sanandrew.mods.claysoldiers.util.CSM_Main;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Level;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author SanAndreasP
 * @version 1.0
 */
public final class ClaymanTeam
{
    public static final String DEFAULT_TEAM = "clay";

    private static final Map<String, ClaymanTeam> TEAMS_ = Maps.newHashMap();
    private static final List<String> TEAM_NAMES_ = new ArrayList<>();

    // NOTE: use http://www.colorpicker.com/ to pick a fitting color
    static {
        registerTeam(DEFAULT_TEAM, 0xA6A6A6,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/lightgray.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/lightgray.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/lightgray.png" }
        ).useTeamColorAsItemColor();
        registerTeam("white", 0xFFFFFF,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/white.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/white.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/white.png" }
        ).useTeamColorAsItemColor();
        registerTeam("gray", 0x5F5F5F,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/gray.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/gray.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/gray.png" }
        ).useTeamColorAsItemColor();
        registerTeam("black", 0x1A1A1A,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/black.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/black.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/black.png" }
        ).useTeamColorAsItemColor();
        registerTeam("brown", 0x703710,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/brown.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/brown.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/brown.png" }
        ).useTeamColorAsItemColor();
        registerTeam("red", 0xE02121,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/red.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/red.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/red.png" }
        ).useTeamColorAsItemColor();
        registerTeam("orange", 0xEC6C14,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/orange.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/orange.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/orange.png" }
        ).useTeamColorAsItemColor();
        registerTeam("yellow", 0xFFFF00,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/yellow.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/yellow.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/yellow.png" }
        ).useTeamColorAsItemColor();
        registerTeam("lime", 0x94ff00,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/lime.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/lime.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/lime.png" }
        ).useTeamColorAsItemColor();
        registerTeam("green", 0x24902D,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/green.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/green.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/green.png" }
        ).useTeamColorAsItemColor();
        registerTeam("cyan", 0x14ECEC,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/cyan.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/cyan.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/cyan.png" }
        ).useTeamColorAsItemColor();
        registerTeam("lightblue", 0x75AED7,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/lightblue.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/lightblue.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/lightblue.png" }
        ).useTeamColorAsItemColor();
        registerTeam("blue", 0x4343d7,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/blue.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/blue.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/blue.png" }
        ).useTeamColorAsItemColor();
        registerTeam("purple", 0x8E00FF,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/purple.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/purple.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/purple.png" }
        ).useTeamColorAsItemColor();
        registerTeam("magenta", 0xEC14DD,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/magenta.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/magenta.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/magenta.png" }
        ).useTeamColorAsItemColor();
        registerTeam("pink", 0xE69BD2,
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/pink.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/pink.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/pink.png" }
        ).useTeamColorAsItemColor();
        registerTeam("melon", 0xFFFFFF, CSM_Main.MOD_ID + ":doll_melon",
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers/melon.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_rare/melon.png" },
                     new String[] { CSM_Main.MOD_ID + ":textures/entity/soldiers_unique/melon.png" }
        );
    }

    private String name_;
    private ResourceLocation[] texturesDefault_;
    private ResourceLocation[] texturesRare_;
    private ResourceLocation[] texturesUnique_;
    private String icon_;
    private int iconColor_;
    private int teamColor_;

    @SideOnly(Side.CLIENT)
    private IIcon iconInstance_;

    private ClaymanTeam(String teamName, int teamColor, String iconTexture, String[] defTextures, String[] rareTextures, String[] uniqueTextures) {
        this.name_ = teamName;
        this.icon_ = iconTexture;
        this.teamColor_ = teamColor;
        this.iconColor_ = 0xFFFFFF;

        this.texturesDefault_ = new ResourceLocation[defTextures.length];
        for( int i = 0; i < defTextures.length; i++ ) {
            this.texturesDefault_[i] = new ResourceLocation(defTextures[i]);
        }

        if( rareTextures != null ) {
            this.texturesRare_ = new ResourceLocation[rareTextures.length];
            for( int i = 0; i < rareTextures.length; i++ ) {
                this.texturesRare_[i] = new ResourceLocation(rareTextures[i]);
            }
        }

        if( uniqueTextures != null ) {
            this.texturesUnique_ = new ResourceLocation[uniqueTextures.length];
            for( int i = 0; i < uniqueTextures.length; i++ ) {
                this.texturesUnique_[i] = new ResourceLocation(uniqueTextures[i]);
            }
        }
    }

    public ClaymanTeam useTeamColorAsItemColor() {
        this.iconColor_ = this.teamColor_;
        return this;
    }

    public String getTeamName() {
        return this.name_;
    }

    public ResourceLocation[] getDefaultTextures() {
        return this.texturesDefault_;
    }

    public ResourceLocation[] getRareTextures() {
        return this.texturesRare_;
    }

    public ResourceLocation[] getUniqueTextures() {
        return this.texturesUnique_;
    }

    public String getIconTexture() {
        return this.icon_;
    }

    public int getTeamColor() {
        return this.teamColor_;
    }

    public int getIconColor() {
        return this.iconColor_;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconInstance() {
        return this.iconInstance_;
    }

    public static ClaymanTeam registerTeam(String teamName, int teamColor, String[] defTextures, String[] rareTextures, String[] uniqueTextures) {
        return registerTeam(teamName, teamColor, CSM_Main.MOD_ID + ":doll_clay", defTextures, rareTextures, uniqueTextures);
    }

    public static ClaymanTeam registerTeam(String teamName, int teamColor, String iconTexture, String[] defTextures, String[] rareTextures, String[] uniqueTextures) {
        if( TEAMS_.containsKey(teamName) ) {
            FMLLog.log(CSM_Main.MOD_LOG, Level.WARN, "A mod has overridden the soldier team \"%s\"!", teamName);
        } else {
            TEAM_NAMES_.add(teamName);
        }
        ClaymanTeam inst = new ClaymanTeam(teamName, teamColor, iconTexture, defTextures, rareTextures, uniqueTextures);
        TEAMS_.put(teamName, inst);
        return inst;
    }

    public static ClaymanTeam getTeamFromName(String name) {
        return TEAMS_.get(name);
    }

    public static List<String> getTeamNames() {
        return new ArrayList<>(TEAM_NAMES_);
    }

    @SideOnly(Side.CLIENT)
    public static void registerIcons(IIconRegister iconRegister) {
        Map<String, IIcon> registeredIcons = Maps.newHashMap();
        for( ClaymanTeam team : TEAMS_.values() ) {
            if( registeredIcons.containsKey(team.getIconTexture()) ) {
                team.iconInstance_ = registeredIcons.get(team.getIconTexture());
            } else {
                team.iconInstance_ = iconRegister.registerIcon(team.getIconTexture());
                registeredIcons.put(team.getIconTexture(), team.iconInstance_);
            }
        }
    }
}