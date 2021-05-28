package org.mrw.teamchat.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import org.mrw.teamchat.TeamChat;
import org.mrw.teamchat.manager.MessageManager;
import org.mrw.teamchat.manager.PlayerManager;

/**
 * JavaDoc this file!
 * Created: 28.05.2021
 *
 * @author notMirow (email.mirowyt@gmail.com)
 */
public class TeamChatCommand extends Command {

    private MessageManager manager = TeamChat.getInstance().getMessageManager();

    public TeamChatCommand(String name) {
        super(name);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (PlayerManager.isPlayer(sender)) {
            if (args.length >= 1) {

            } else manager.sendMessage((ProxiedPlayer) sender, "Nutze /teamchat <Nachricht>");
            for (ProxiedPlayer p : TeamChat.getInstance().getProxy().getPlayers()) {
                if (p.hasPermission("teamchat.teamchat")) {
                    String msg = "";
                    for (int i = 0; i < args.length; i++)
                        msg = msg + args[i] + " ";
                        manager.sendMessage((ProxiedPlayer) sender, msg);
                        continue;
                }
            }
        }

    }
}
