package net.glowstone.client;

import net.glowstone.entity.GlowHumanEntity;
import net.glowstone.entity.meta.profile.PlayerProfile;
import org.bukkit.Location;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.MainHand;
import org.bukkit.inventory.Merchant;

public class GlowClientEntity extends GlowHumanEntity {
    /**
     * Creates a human within the specified world and with the specified name.
     *
     * @param location The location.
     * @param profile  The human's profile with name and UUID information.
     */
    public GlowClientEntity(Location location, PlayerProfile profile) {
        super(location, profile);
    }

    @Override
    public MainHand getMainHand() {
        return null;
    }

    @Override
    public InventoryView openMerchant(Villager trader, boolean force) {
        return null;
    }

    @Override
    public InventoryView openMerchant(Merchant merchant, boolean force) {
        return null;
    }

    @Override
    public boolean isHandRaised() {
        return false;
    }

    @Override
    public boolean shouldSave() {
        return false;
    }
}
