package com.example.example_mod.test;

import net.minecraft.block.Blocks;
import net.minecraft.test.GameTest;
import net.minecraft.test.TestContext;
import net.minecraft.util.math.BlockPos;

public class ExampleModTests {
	@GameTest()
	public void exampleStructureTest (TestContext context) {
		context.setBlockState(new BlockPos(0, 2, 0), Blocks.DIAMOND_BLOCK.getDefaultState());
		context.addInstantFinalTask(() -> context.checkBlock(new BlockPos(0,2,0), block -> block == Blocks.DIAMOND_BLOCK, "Expect block to be a Diamond Block"));
	}
}
