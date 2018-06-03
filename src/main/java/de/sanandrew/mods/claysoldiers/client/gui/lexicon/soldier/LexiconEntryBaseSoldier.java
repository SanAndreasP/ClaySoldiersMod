/* ******************************************************************************************************************
 * Authors:   SanAndreasP
 * Copyright: SanAndreasP
 * License:   Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International
 *                http://creativecommons.org/licenses/by-nc-sa/4.0/
 *******************************************************************************************************************/
package de.sanandrew.mods.claysoldiers.client.gui.lexicon.soldier;

import de.sanandrew.mods.claysoldiers.api.CsmConstants;
import de.sanandrew.mods.claysoldiers.api.client.lexicon.ILexiconEntryCraftingGrid;
import de.sanandrew.mods.claysoldiers.client.gui.lexicon.crafting.LexiconRenderCraftingGrid;
import de.sanandrew.mods.claysoldiers.registry.team.TeamRegistry;
import de.sanandrew.mods.claysoldiers.registry.team.Teams;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class LexiconEntryBaseSoldier
        implements ILexiconEntryCraftingGrid
{
    private static final String ID = "baseSoldier";
    private final ItemStack icon;
    private final ResourceLocation prevPic;

    public LexiconEntryBaseSoldier() {
        this.icon = TeamRegistry.INSTANCE.getNewTeamStack(1, Teams.SOLDIER_CLAY);
        this.prevPic = new ResourceLocation(CsmConstants.ID, "textures/gui/lexicon/page_pics/soldiers/" + CsmConstants.ID + "_basesoldier.png");
    }

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public String getGroupId() {
        return LexiconGroupSoldiers.GRP_NAME;
    }

    @Override
    public String getPageRenderId() {
        return LexiconRenderCraftingGrid.ID;
    }

    @Nonnull
    @Override
    public ItemStack getEntryIcon() {
        return this.icon;
    }

    @Override
    public ResourceLocation getPicture() {
        return this.prevPic;
    }

    @Override
    public boolean divideAfter() {
        return false;
    }

    @Override
    public ItemStack getRecipeResult() {
        return this.icon;
    }
}