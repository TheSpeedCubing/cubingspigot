package cubing.lib.bukkit.Event.events;

import net.minecraft.server.PacketPlayInUseEntity;
import org.bukkit.entity.Player;

public class PlayInUseEntityEvent {
    public PacketPlayInUseEntity packet;
    public Player player;
    public boolean isCancelled = false;

    public PlayInUseEntityEvent(Player player, PacketPlayInUseEntity packet) {
        this.packet = packet;
        this.player = player;
    }

    public void setCancelled(boolean b) {
        isCancelled = b;
    }
}
