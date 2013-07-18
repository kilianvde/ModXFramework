package kilian.ModXFramework;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModXStaticBlock extends Block {

	public ModXStaticBlock(int blockID,Material material)
	{
		super(blockID,material);
		setCreativeTab(CreativeTabs.tabBlock);
	}
}
