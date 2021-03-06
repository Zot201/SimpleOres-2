package SimpleOres.core;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import SimpleOres.core.api.SimpleArmor;

public class Armor
{
	public static ProxyCommon proxy;
	
	/**
	 * Linking to the classes for easier reference.
	 */
	public static SimpleOres mod;
	public static Achievements achievements;
	public static Armor armor;
	public static Blocks blocks;
	public static Config config;
	public static Items items;
	public static Recipes recipes;
	public static Tools tools;
	
	/**
	 * Creating the armor items.
	 */
	public static Item copperHelm;
	public static Item copperChest;
	public static Item copperLegs;
	public static Item copperBoots;
	public static Item tinHelm;
	public static Item tinChest;
	public static Item tinLegs;
	public static Item tinBoots;
	public static Item mythrilHelm;
	public static Item mythrilChest;
	public static Item mythrilLegs;
	public static Item mythrilBoots;
	public static Item adamantiumHelm;
	public static Item adamantiumChest;
	public static Item adamantiumLegs;
	public static Item adamantiumBoots;
	public static Item onyxHelm;
	public static Item onyxChest;
	public static Item onyxLegs;
	public static Item onyxBoots;
	
	/**
	 * The method that gives the armor items their properties and names. This is called by the main SimpleOres class.
	 */
	public static void doArmor()
	{
        //Armour Details
        copperHelm = new SimpleArmor(config.copperHelmID, mod.armorCopper, mod.rendererCopper, 0, "copper", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("copperHelm");
		copperChest = new SimpleArmor(config.copperChestID, mod.armorCopper, mod.rendererCopper, 1, "copper", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("copperChest");
		copperLegs = new SimpleArmor(config.copperLegsID, mod.armorCopper, mod.rendererCopper, 2, "copper", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("copperLegs");
		copperBoots = new SimpleArmor(config.copperBootsID, mod.armorCopper, mod.rendererCopper, 3, "copper", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("copperBoots");
        tinHelm = new SimpleArmor(config.tinHelmID, mod.armorTin, mod.rendererTin, 0, "tin", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("tinHelm");
		tinChest = new SimpleArmor(config.tinChestID, mod.armorTin, mod.rendererTin, 1, "tin", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("tinChest");
		tinLegs = new SimpleArmor(config.tinLegsID, mod.armorTin, mod.rendererTin, 2, "tin", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("tinLegs");
		tinBoots = new SimpleArmor(config.tinBootsID, mod.armorTin, mod.rendererTin, 3, "tin", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("tinBoots");
		mythrilHelm = new SimpleArmor(config.mythrilHelmID, mod.armorMythril, mod.rendererMythril, 0, "mythril", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("mythrilHelm");
		mythrilChest = new SimpleArmor(config.mythrilChestID, mod.armorMythril, mod.rendererMythril, 1, "mythril", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("mythrilChest");
		mythrilLegs = new SimpleArmor(config.mythrilLegsID, mod.armorMythril, mod.rendererMythril, 2, "mythril", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("mythrilLegs");
		mythrilBoots = new SimpleArmor(config.mythrilBootsID, mod.armorMythril, mod.rendererMythril, 3, "mythril", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("mythrilBoots");
		adamantiumHelm = new SimpleArmor(config.adamantiumHelmID, mod.armorAdamantium, mod.rendererAdamantium, 0, "adamantium", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("adamantiumHelm");
		adamantiumChest = new SimpleArmor(config.adamantiumChestID, mod.armorAdamantium, mod.rendererAdamantium, 1, "adamantium", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("adamantiumChest");
		adamantiumLegs = new SimpleArmor(config.adamantiumLegsID, mod.armorAdamantium, mod.rendererAdamantium, 2, "adamantium", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("adamantiumLegs");
		adamantiumBoots = new SimpleArmor(config.adamantiumBootsID, mod.armorAdamantium, mod.rendererAdamantium, 3, "adamantium", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("adamantiumBoots");
		onyxHelm = new SimpleArmor(config.onyxHelmID, mod.armorOnyx, mod.rendererOnyx, 0, "onyx", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("onyxHelm");
		onyxChest = new SimpleArmor(config.onyxChestID, mod.armorOnyx, mod.rendererOnyx, 1, "onyx", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("onyxChest");
		onyxLegs = new SimpleArmor(config.onyxLegsID, mod.armorOnyx, mod.rendererOnyx, 2, "onyx", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("onyxLegs");
		onyxBoots = new SimpleArmor(config.onyxBootsID, mod.armorOnyx, mod.rendererOnyx, 3, "onyx", "simpleores", SimpleOres.tabSimpleCombat).setUnlocalizedName("onyxBoots");
	}
}
