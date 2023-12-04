package f3f5.fallingblockfix;

import org.bukkit.plugin.Plugin;
import org.bukkit.event.Listener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FallingBlockFix extends JavaPlugin {
    
    public void onEnable() {
        this.saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents((Listener) new FallingListener(this), (Plugin) this);
    }
}
