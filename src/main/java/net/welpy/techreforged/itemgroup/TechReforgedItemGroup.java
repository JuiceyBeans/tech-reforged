
package net.welpy.techreforged.itemgroup;

import net.welpy.techreforged.item.CrushedIronItem;
import net.welpy.techreforged.TechReforgedModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@TechReforgedModElements.ModElement.Tag
public class TechReforgedItemGroup extends TechReforgedModElements.ModElement {
	public TechReforgedItemGroup(TechReforgedModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtech_reforged") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CrushedIronItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
