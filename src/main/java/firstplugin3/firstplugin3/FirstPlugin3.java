package firstplugin3.firstplugin3;

import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin3 extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[FirstPlugin3] Hello!");
        this.getCommand("mystats").setExecutor(new StartCommand());
        this.getCommand("mystats").setTabCompleter(new StartTab());
    }

    @Override
    public void onDisable() {
        System.out.println("[FirstPlugin3] Goodbye!");
    }
}