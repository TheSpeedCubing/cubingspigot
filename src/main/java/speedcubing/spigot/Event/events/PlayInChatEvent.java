package speedcubing.spigot.Event.events;

import net.minecraft.server.PacketPlayInChat;
import org.bukkit.entity.Player;

public class PlayInChatEvent {
    public PacketPlayInChat packet;
    public Player player;
    public boolean isCancelled = false;

    public PlayInChatEvent(Player player, PacketPlayInChat packet) {
        this.packet = packet;
        this.player = player;
    }

    public void setCancelled(boolean b) {
        isCancelled = b;
    }
}
