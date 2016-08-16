package me.plasmarob.HPWandCraft;

import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

public class WizardPlayer {
	Player player;
	ConcurrentHashMap<Player,WizardPlayer> wizardPlayers = new ConcurrentHashMap<Player,WizardPlayer>();
	
	public WizardPlayer(Player player) {
		this.player = player;
		wizardPlayers.put(player, this);
	}
	
	
	
}
