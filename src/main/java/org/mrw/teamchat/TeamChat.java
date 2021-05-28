package org.mrw.teamchat;

import net.md_5.bungee.api.plugin.Plugin;
import org.mrw.teamchat.commands.TeamChatCommand;
import org.mrw.teamchat.manager.MessageManager;

public final class TeamChat extends Plugin {


    private static TeamChat instance;
    private static MessageManager manager;


    @Override
    public void onEnable() {
        instance = this;
        manager = new MessageManager();
        getProxy().broadcast(manager.prefix + "Plugin wurde erfolgreich gestartet.");
        getProxy().getPluginManager().registerCommand(this, new TeamChatCommand("teamchat"));
        getProxy().getPluginManager().registerCommand(this, new TeamChatCommand("tc"));
        getProxy().getPluginManager().registerCommand(this, new TeamChatCommand("staffchat"));
        getProxy().getPluginManager().registerCommand(this, new TeamChatCommand("sc"));
    }

    @Override
    public void onDisable() {
        getProxy().broadcast(manager.prefix + "Plugin wurde erfolgreich runtergefahren.");
    }

    public static TeamChat getInstance() {
        return instance;
    }

    public MessageManager getMessageManager() {
        return manager;
    }
}
