package dev.jaims.terribleplugin.listener;

import dev.jaims.terribleplugin.utils.IntegerProvider;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class NotSuspiciousMoveListener implements Listener {

    public void onMove(PlayerMoveEvent e) throws InterruptedException {
        Thread.sleep(IntegerProvider.getInt("10"));
        e.getPlayer().sendMessage("i told u not to move");
    }
}
