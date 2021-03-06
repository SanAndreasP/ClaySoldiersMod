/* ******************************************************************************************************************
   * Authors:   SanAndreasP
   * Copyright: SanAndreasP
   * License:   Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International
   *                http://creativecommons.org/licenses/by-nc-sa/4.0/
   *******************************************************************************************************************/
package de.sanandrew.mods.claysoldiers.client.renderer.soldier.layer;

import de.sanandrew.mods.claysoldiers.api.client.soldier.ISoldierRender;
import de.sanandrew.mods.claysoldiers.api.entity.soldier.ISoldier;
import de.sanandrew.mods.claysoldiers.api.entity.soldier.upgrade.EnumUpgradeType;
import de.sanandrew.mods.claysoldiers.client.model.accessory.ModelCrown;
import de.sanandrew.mods.claysoldiers.registry.upgrade.Upgrades;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityCreature;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerCrown
        implements LayerRenderer<EntityCreature>
{
    private final ModelCrown model;
    private final ISoldierRender<?, ?> renderer;

    public LayerCrown(ISoldierRender<?, ?> renderer) {
        this.renderer = renderer;
        this.model = new ModelCrown();
    }

    @Override
    public void doRenderLayer(EntityCreature creature, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if( !(creature instanceof ISoldier) ) {
            return;
        }

        ISoldier soldier = (ISoldier) creature;

        boolean hasDiamond = soldier.hasUpgrade(Upgrades.MC_DIAMOND, EnumUpgradeType.MISC) || soldier.hasUpgrade(Upgrades.MC_DIAMONDBLOCK, EnumUpgradeType.MISC);
        if( hasDiamond || soldier.hasUpgrade(Upgrades.MC_GOLDNUGGET, EnumUpgradeType.MISC) ) {
            GlStateManager.pushMatrix();
            this.renderer.getSoldierModel().bipedHead.postRender(scale);

            if( this.model.texture != null ) {
                if( hasDiamond ) {
                    GlStateManager.color(0.0F, 0.9F, 1.0F);
                } else {
                    GlStateManager.color(1.0F, 0.9F, 0.0F);
                }
                this.renderer.bindSoldierTexture(this.model.texture);
                this.model.render(scale);
                GlStateManager.color(1.0F, 1.0F, 1.0F);
            }

            GlStateManager.popMatrix();
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
}
