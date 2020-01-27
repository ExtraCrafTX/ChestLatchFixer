package com.extracraftx.minecraft.chestlatchfixer.mixin;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.block.entity.ChestBlockEntityRenderer;

@Mixin(ChestBlockEntityRenderer.class)
public class ChestBlockEntityRendererMixin{

    @Shadow @Final @Mutable ModelPart field_20819;
    @Shadow @Final @Mutable ModelPart field_20822;
    @Shadow @Final @Mutable ModelPart field_21481;

    @Inject(method = "<init>", at = @At("RETURN"))
    private void onInit(CallbackInfo info){
        field_20819 = new ModelPart(64, 64, 0, 0);
        field_20819.addCuboid(7.0F, -1.0F, 14.0F, 2.0F, 4.0F, 1.0F, 0.0F);
        field_20819.pivotY = 9.0f;
        field_20819.pivotZ = 1.0f;
        
        field_20822 = new ModelPart(64, 64, 0, 0);
        field_20822.addCuboid(15.0F, -1.0F, 14.0F, 1.0F, 4.0F, 1.0F, 0.0F);
        field_20822.pivotY = 9.0f;
        field_20822.pivotZ = 1.0f;
        
        field_21481 = new ModelPart(64, 64, 0, 0);
        field_21481.addCuboid(0.0F, -1.0F, 14.0F, 1.0F, 4.0F, 1.0F, 0.0F);
        field_21481.pivotY = 9.0f;
        field_21481.pivotZ = 1.0f;
    }

}