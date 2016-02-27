package vg.civcraft.mc.prisonpearl;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import vg.civcraft.mc.prisonpearl.misc.FakeLocation;

public class Summon {

	private UUID uuid;
	private Location returnLoc;
	private PrisonPearl pp;
	private boolean canSpeak = true;
	private boolean canDamage = true;
	private boolean canBreak = true;
	private int distance; // Nice little default.
	private int amountDamage; // Amount to damage the player per cycle.
	private boolean toBeReturned = false; // This is mainly so PlayerRespawn method knows if it is trying to respawn the player.
	private boolean justCreated = false; // This is mainly so PlayerRespawn method knows if it is trying to be sent to summoned player.
	
	public Summon(UUID uuid, Location returnLoc, PrisonPearl pp) {
		this.uuid = uuid;
		this.returnLoc = returnLoc;
		this.pp = pp;
		distance = PrisonPearlConfig.getSummonDamageRadius();
		amountDamage = PrisonPearlConfig.getSummonDamageAmount();
	}
	
	public Location getReturnLocation() {
		return returnLoc;
	}
	
	public Location getPearlLocation() {
		return pp.getLocation();
	}
	
	public UUID getUUID() {
		return uuid;
	}
	
	public void setCanSpeak(boolean canSpeak) {
		this.canSpeak = canSpeak;
	}
	
	public boolean getCanSpeak() {
		return canSpeak;
	}
	
	public void setCanDamage(boolean canDamage) {
		this.canDamage = canDamage;
	}
	
	public boolean getCanDamage() {
		return canDamage;
	}
	
	public void setCanBreak(boolean canBreak) {
		this.canBreak = canBreak;
	}
	
	public boolean getCanBreak() {
		return canBreak;
	}
	
	public void setMaxDistance(int distance) {
		this.distance = distance;
	}
	
	public int getMaxDistance() {
		return distance;
	}
	
	/**
	 * This method is useful in determining if the player is too far away from the pearl and needs
	 * to be damaged.
	 * Keep in mind this method will not damage the player, it is only used for notifying 
	 * that the player should be.
	 * @return Returns true if the player should be damaged, false otherwise.
	 */
	public boolean shouldDamage() {
		Player p;
		if ((p = Bukkit.getPlayer(uuid)) == null)
			return false;
		Location pearlLoc = pp.getLocation();
		if (pearlLoc instanceof FakeLocation) // Somehow the summoned player is not where he should be.
			return true;
		Location playerLoc = p.getLocation();
		if (!pearlLoc.getWorld().equals(playerLoc.getWorld()))
			return true;
		return pearlLoc.distance(playerLoc) <= distance;
	}
	
	public void setAmountDamage(int amountDamage) {
		this.amountDamage = amountDamage;
	}
	
	public int getAmountDamage() {
		return amountDamage;
	}
	
	public void setToBeReturned(boolean toBeReturned) {
		this.toBeReturned = toBeReturned;
	}
	
	public boolean isToBeReturned() {
		return toBeReturned;
	}
	
	public void setJustCreated(boolean justCreated) {
		this.justCreated = justCreated;
	}
	
	public boolean isJustCreated() {
		return justCreated;
	}
}