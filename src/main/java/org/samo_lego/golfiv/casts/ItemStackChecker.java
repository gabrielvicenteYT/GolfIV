package org.samo_lego.golfiv.casts;

/**
 * Checks iItemStacks.
 */
public interface ItemStackChecker {
    /**
     * Checks the ItemStack and makes it legal.
     * Removes all enchantments if they are incompatible or
     * have too high level.
     *
     * @return true if item was illegal, otherwise false.
     */
    boolean makeLegal();
}
