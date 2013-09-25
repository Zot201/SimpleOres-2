Version 1.1.0
Core:
-Updated to Minecraft 1.6.4 and Forge 9.11.0.884.
-SimpleOres 2 now has an integrated localisation which will change the language of SimpleOres when you change the language of Minecraft (if there is a language file available for your language).
-Added a new Settings toggle to enable the old Localisation file if you wish.
-Added an update checker. It will let you know if there is a new version of SimpleOres available. It won't do any updating itself.
-Added a Settings toggle to turn off the update checker.
-Changed the recipes involving sticks (ie. tools) to use OreDictionary sticks rather than normal ones. This will make them compatible with other mods that add different wood sticks, etc.
-Tweaked spawn rates of copper and tin.
-Tweaked tin stats very slightly.
-[API] Split the SimpleOre class into SimpleOre and SimpleGemOre to allow support for dropping an item rather than the block itself.

Fusion Plugin:
Fixed it so that 5 items can be fused with no remaining energy.
[API] Added proper meta-data compatibility for Fusion Furnace recipes.
[API] Allowed the Fusion Furnace to use OreDictionary alternatives to items. This Furnace checks if there are any alternatives ingredients in the Dictionary, so no recipes will need to be modified.

Version 1.0.2
Core:
-Fusion Furnace is now an optional plugin. Added far better plugin support.
-Fixed a localisation bug (there were 2 sections for bow tooltips)
-Added coal blocks to the fuel list for Mythril and Onyx Furnaces.
-Fixed the fatal onyx door bug.
-I have re-done most of the textures, including alloy textures, to be a bit more consistent.
-The new Plugin API includes support for adding blocks, items, tools, armor and loot.

Fusion Furnace Plugin:
-Fusion Furnace now gives experience when you create a chunk.
-Added coal blocks to the fuel list for the Fusion Furnace.
-Small and medium chunks now craft into a large chunk. The large chunk can then be smelted into an ingot.
-Reduced smelting time by 25% (because you have to smelt it in a regular furnace again, which adds that 25% 	back on :P)
-Changed the enchantability of the alloys. They are now 6, 28 and 11 for bronze, thyrium and sinisite 	respectively.
-Other plugins can add recipes to the Fusion Furnace.
	
Version 1.0.1
-Fixed tin smelting recipe.
-Fixed fusion furnace GUI.

Version 1.0.0:
- Updated to 1.6.2
- Added the Fusion Furnace.
- Added 3 new alloys and their respective items and blocks.
- Replaced Silver with Tin.
- Added Copper, Tin, Mythril, Adamantium and Onyx bars, like Iron Bars, but with different blast resistances.
- Added Copper and Onyx doors.
- Added Tin, Adamantium and Onyx shears.
- Removed Silver bow, and added Sinisite and Thyrium bows, with their rods.
- Added 2 new achievements, and removed an old one.
- Added the Settings.cfg file. This is where spawn rate, spawn heigh, vein size and any other toggles can be configured.
- Improved localisation.lang file. Achievement names and descriptions can now be translated too.
- All items and blocks can now be moved to a single Creative Tab with one of the Settings toggles.
- Reduced the loot spawn rate, and total number of SimpleOres lootable items, so they don't overpower vanilla ones.
- Furnaces now have the right little icon.
- Tools can now be repaired properly.
- Tweaked a lot of balancing settings, such as ore spawn rates, armor and tool strengths, speeds and enchantability. The mod should (hopefully) be even more balanced now.
- Much neater code, and now open source. Most of it is commented to explain what it does. This was a large step for me, and has really improved my skill and understanding of modding.