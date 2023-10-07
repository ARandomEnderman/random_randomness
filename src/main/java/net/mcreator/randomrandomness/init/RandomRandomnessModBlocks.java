
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomrandomness.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.randomrandomness.block.ShitBlock;
import net.mcreator.randomrandomness.RandomRandomnessMod;

public class RandomRandomnessModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomRandomnessMod.MODID);
	public static final RegistryObject<Block> SHIT = REGISTRY.register("shit", () -> new ShitBlock());
}
