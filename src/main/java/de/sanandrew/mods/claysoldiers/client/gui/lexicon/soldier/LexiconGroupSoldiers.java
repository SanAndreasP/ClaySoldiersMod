/* ******************************************************************************************************************
 * Authors:   SanAndreasP
 * Copyright: SanAndreasP
 * License:   Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International
 *                http://creativecommons.org/licenses/by-nc-sa/4.0/
 *******************************************************************************************************************/
package de.sanandrew.mods.claysoldiers.client.gui.lexicon.soldier;

import de.sanandrew.mods.claysoldiers.api.client.lexicon.ILexiconGroup;
import de.sanandrew.mods.claysoldiers.api.client.lexicon.ILexiconRegistry;
import de.sanandrew.mods.claysoldiers.client.gui.lexicon.LexiconGroup;
import de.sanandrew.mods.claysoldiers.client.gui.lexicon.crafting.LexiconRenderBrickDoll;
import de.sanandrew.mods.claysoldiers.client.gui.lexicon.crafting.LexiconRenderCraftingGrid;
import de.sanandrew.mods.claysoldiers.util.Resources;

public class LexiconGroupSoldiers
        extends LexiconGroup
{
    public static final String GRP_NAME = "soldiers";

    protected LexiconGroupSoldiers() {
        super(GRP_NAME, Resources.GUI_GROUPICON_SOLDIERS.resource);
    }

    public static void register(ILexiconRegistry registry) {
        registry.registerPageRender(new LexiconRenderCraftingGrid());
        registry.registerPageRender(new LexiconRenderBrickDoll());

        ILexiconGroup grp = new LexiconGroupSoldiers();
        registry.registerGroup(grp);

        grp.addEntry(new LexiconEntryBaseSoldier());
        grp.addEntry(new LexiconEntryDyeSoldier());
        grp.addEntry(new LexiconEntryGlassSoldier());
        grp.addEntry(new LexiconEntryMiscSoldier());
        grp.addEntry(new LexiconEntryWashSoldier());
        grp.addEntry(new LexiconEntryBrickDoll());
    }
}