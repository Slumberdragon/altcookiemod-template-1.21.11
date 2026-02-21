package namename.modid.item;

import namename.modid.effects.ModEffects;
import namename.modid.effects.KaboomEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import static net.minecraft.world.item.Items.registerItem;


public class ModFoodComponents {


    /// SPEED COOKIE cute cookie

    public static final Consumable SPEED_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            // The duration is in ticks, 20 ticks = 1 second
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 10 * 20, 10), 1.0f))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 10 * 20, 3), 1.0f))
            .build();
    public static final FoodProperties SPEED_FOOD_COMPONENT = new FoodProperties.Builder()
            .alwaysEdible()
            .build();

    public static final Item CUTECOOKIE = registerItem(
            "cutecookie",
            Item::new,
            new Item.Properties().food(SPEED_FOOD_COMPONENT, SPEED_FOOD_CONSUMABLE_COMPONENT)
    );


    /// HASTE COOKIE dirt cookie

    public static final Consumable HASTE_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            // The duration is in ticks, 20 ticks = 1 second
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HASTE, 10 * 20, 3), 1.0f))
            .build();
    public static final FoodProperties HASTE_FOOD_COMPONENT = new FoodProperties.Builder()
            .alwaysEdible()
            .build();

    public static final Item DIRTCOOKIE = registerItem(
            "dirtcookie",
            Item::new,
            new Item.Properties().food(HASTE_FOOD_COMPONENT, HASTE_FOOD_CONSUMABLE_COMPONENT)
    );


    /// LUCK COOKIE creeper cookie

    public static final Consumable LUCK_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            // The duration is in ticks, 20 ticks = 1 second
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.LUCK, 10 * 20, 10), 1.0f))
            .build();
    public static final FoodProperties LUCK_FOOD_COMPONENT = new FoodProperties.Builder()
            .alwaysEdible()
            .build();

    public static final Item CREEPERCOOKIE = registerItem(
            "creepercookie",
            Item::new,
            new Item.Properties().food(LUCK_FOOD_COMPONENT, LUCK_FOOD_CONSUMABLE_COMPONENT)
    );


    /// JUMP BOOST COOKIE snow cookie

    public static final Consumable JUMP_BOOST_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            // The duration is in ticks, 20 ticks = 1 second
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 10 * 20, 3), 1.0f))
            .build();
    public static final FoodProperties JUMP_BOOST_FOOD_COMPONENT = new FoodProperties.Builder()
            .alwaysEdible()
            .build();

    public static final Item SNOWCOOKIE = registerItem(
            "snowcookie",
            Item::new,
            new Item.Properties().food(JUMP_BOOST_FOOD_COMPONENT, JUMP_BOOST_FOOD_CONSUMABLE_COMPONENT)
    );



    /// KABOOM COOKIE charged creeper cookie

    public static final Consumable KABOOM_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.KABOOM, 10 * 20, 1), 1.0f))
            .build();

    public static final FoodProperties KABOOM_FOOD_COMPONENT = new FoodProperties.Builder()
            .alwaysEdible()
            .build();
    public static final Item CHARGED_CREEPERCOOKIE = registerItem(
            "charged_creepercookie",
            Item::new,
            new Item.Properties().food(KABOOM_FOOD_COMPONENT, KABOOM_FOOD_CONSUMABLE_COMPONENT)
    );

}

