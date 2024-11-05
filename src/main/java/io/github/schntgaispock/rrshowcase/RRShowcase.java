package io.github.schntgaispock.rrshowcase;

import java.util.Random;

import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.Nonnull;

import org.bukkit.NamespacedKey;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.schntgaispock.rrshowcase.core.ItemSetup;

public class RRShowcase extends AbstractAddon {

    static RRShowcase instance;

    final Random random = ThreadLocalRandom.current();

    public RRShowcase() {
        super("SchnTgaiSpock", "RecipeRewriteShowcase", "master", "options.auto-update");
    }

    public static RRShowcase getInstance() {
        return instance;
    }

    public Random getRandom() {
        return this.random;
    }

    @Override
    public void enable() {
        instance = this;

        getLogger().info("#===============================#");
        getLogger().info("#    Recipe Rewrite Showcase    #");
        getLogger().info("#===============================#");

        ItemSetup.setup();

    }

    @Override
    protected void disable() {
        instance = null;
    }

    public static NamespacedKey key(@Nonnull String name) {
        return new NamespacedKey(RRShowcase.getInstance(), name);
    }
}
