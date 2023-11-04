package net.graywolf857.learningmod.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.Blocks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;


public class TNTWand extends Item {
    public TNTWand(Properties pProperties) {
        super(pProperties);
    }



    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level world = pContext.getLevel();
        BlockPos pos = pContext.getClickedPos();
        Player player = pContext.getPlayer();
        ItemStack itemStack = pContext.getItemInHand();



        if(player != null && itemStack.getCount() >= 0){

            BlockState blockState = world.getBlockState(pos);


            world.setBlockAndUpdate(pos, Blocks.TNT.defaultBlockState());





        }




        return super.useOn(pContext);
    }



}
