/* ******************************************************************************************************************
 * Authors:   SanAndreasP
 * Copyright: SanAndreasP
 * License:   Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International
 *                http://creativecommons.org/licenses/by-nc-sa/4.0/
 *******************************************************************************************************************/
package de.sanandrew.mods.claysoldiers.client.gui.lexicon.soldier;

import de.sanandrew.mods.claysoldiers.api.CsmConstants;
import de.sanandrew.mods.claysoldiers.api.client.lexicon.ILexiconEntryCraftingGrid;
import de.sanandrew.mods.claysoldiers.api.misc.IDummyMultiRecipe;
import de.sanandrew.mods.claysoldiers.api.soldier.ITeam;
import de.sanandrew.mods.claysoldiers.client.gui.lexicon.crafting.LexiconRenderCraftingGrid;
import de.sanandrew.mods.claysoldiers.crafting.DyedSoldierRecipe;
import de.sanandrew.mods.claysoldiers.registry.team.TeamRegistry;
import de.sanandrew.mods.claysoldiers.util.CsmConfiguration;
import de.sanandrew.mods.sanlib.lib.util.MiscUtils;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreIngredient;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LexiconEntryDyeSoldier
        implements ILexiconEntryCraftingGrid
{
    private static final String ID = "dyeSoldier";
    private final ItemStack[] icons;
    private final ResourceLocation prevPic;
    private final IRecipe recipe;

    public LexiconEntryDyeSoldier() {
        this.icons = Arrays.stream(DyedSoldierRecipe.TEAMS).map(uuid -> TeamRegistry.INSTANCE.getNewTeamStack(1, uuid)).toArray(ItemStack[]::new);
        this.prevPic = new ResourceLocation(CsmConstants.ID, "textures/gui/lexicon/page_pics/soldiers/" + CsmConstants.ID + "_dyesoldier.png");
        this.recipe = new DummyShapelessRecipeDyedSoldiers();
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
        return this.icons[MiscUtils.RNG.randomInt(this.icons.length)];
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
    public IRecipe getRecipe() {
        return CsmConfiguration.enableDyedSoldierRecipe ? this.recipe : null;
    }

    private static final class DummyShapelessRecipeDyedSoldiers
            implements IDummyMultiRecipe
    {
        final List<IRecipe> recipes;

        DummyShapelessRecipeDyedSoldiers() {
            this.recipes = new ArrayList<>();

            List<ItemStack> allTeams = new ArrayList<>();
            for( ITeam team : TeamRegistry.INSTANCE.getTeams() ) {
                allTeams.add(TeamRegistry.INSTANCE.getNewTeamStack(1, team));
            }
            Ingredient allTeamsIngredient = Ingredient.fromStacks(allTeams.toArray(new ItemStack[0]));

            for( int cnt = 1; cnt <= 8; cnt++ ) {
                for( int i = 0, max = DyedSoldierRecipe.TEAMS.length; i < max; i++ ) {
                    NonNullList<Ingredient> ingredients = NonNullList.create();

                    Ingredient dye = new OreIngredient(DyedSoldierRecipe.DYES[i]);
                    ingredients.add(dye);

                    ingredients.add(allTeamsIngredient);
                    switch( cnt ) { // no breaks!
                        case 8: ingredients.add(allTeamsIngredient);
                        case 7: ingredients.add(allTeamsIngredient);
                        case 6: ingredients.add(allTeamsIngredient);
                        case 5: ingredients.add(allTeamsIngredient);
                        case 4: ingredients.add(allTeamsIngredient);
                        case 3: ingredients.add(allTeamsIngredient);
                        case 2: ingredients.add(allTeamsIngredient);
                    }

                    this.recipes.add(new ShapelessRecipes("", TeamRegistry.INSTANCE.getNewTeamStack(cnt, DyedSoldierRecipe.TEAMS[i]), ingredients));
                }
            }
        }

        @Override
        public int getRecipeWidth() {
            return 3;
        }

        @Override
        public int getRecipeHeight() {
            return 3;
        }

        @Override
        public List<IRecipe> getRecipes() {
            return this.recipes;
        }
    }
}