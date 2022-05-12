package speedcubing.spigot.Event.events;

import org.bukkit.entity.Player;
import java.util.List;

public class TabCompleteCommandEvent {

    public List<String> completions;
    public Player player;
    public String message;

    public TabCompleteCommandEvent(Player player,String message,List<String> completions) {
        this.player = player;
        this.message = message;
        this.completions = completions;
    }
}
