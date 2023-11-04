package net.graywolf857.learningmod.item.custom;

import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.HashMap;
import java.util.Map;

public class BlinkDagger extends Item {

    public BlinkDagger(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        // Get the player's yaw rotation in radians (horizontal rotation)
        float yaw = pPlayer.getYRot() * ((float) Math.PI / 180.0F);

        // Calculate the direction vector based on the yaw
        double xDirection = -Math.sin(yaw);
        double zDirection = Math.cos(yaw);

        // Define the teleportation distance (adjust as needed)
        double teleportDistance = 10.0;

        // Calculate the new position
        double newX = pPlayer.getX() + xDirection * teleportDistance;
        double newY = pPlayer.getY();  // Keep the same Y-coordinate
        double newZ = pPlayer.getZ() + zDirection * teleportDistance;

        // Teleport the player to the new position
        pPlayer.teleportTo(newX, newY, newZ);

        return super.use(pLevel, pPlayer, pUsedHand);
    }

}






