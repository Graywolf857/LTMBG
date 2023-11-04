package net.graywolf857.learningmod.item.custom;

import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class BlinkDagger extends Item {
    public BlinkDagger(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

        Direction direction = pPlayer.getDirection();

        pPlayer.teleportTo(pPlayer.getX() + 10, pPlayer.getY(), pPlayer.getZ());

        return super.use(pLevel, pPlayer, pUsedHand);
    }
}




