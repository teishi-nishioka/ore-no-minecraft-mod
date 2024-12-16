package com.example.taishimod;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static com.example.taishimod.ExampleMod.MODID;

public class ItemInit {

    //RegisterEvent イベントを使用する時は下の2行
    //基本形
    //public static final Item EXAMPLE_ITEM = new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC));

    //クリエイティブタブに
//    public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "taishimod");
//    // クリエイティブタブに追加するアイテム
//    public static final Item EXAMPLE_ITEM = new Item(new Item.Properties().tab(instance));
//
//    public static class ModCreativeTab extends CreativeModeTab {
//        private ModCreativeTab(int index, String label) {
//            super(index, label);
//        }
//
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(EXAMPLE_ITEM);
//        }
//    }
    public static final Item EXAMPLE_ITEM =
            new Item(new Item.Properties().stacksTo(128)
                    .tab(CreativeModeTab.TAB_MISC).food(
                    new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationMod(1)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 1.0F)
                            .alwaysEat()
                            .meat()
                            .fast()
                            .build())
            );

//    public static final Item EXAMPLE_ITEM_FUEL = new FuelItem(new Item.Properties());
}
