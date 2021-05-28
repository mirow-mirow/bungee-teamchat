package org.mrw.teamchat.manager;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;

/**
 * JavaDoc this file!
 * Created: 28.05.2021
 *
 * @author notMirow (email.mirowyt@gmail.com)
 */
public class MessageManager {

    public String prefix = "§c[TeamChat] §7▪ ";

    public void sendMessage(ProxiedPlayer proxiedPlayer, String msg) {
        proxiedPlayer.sendMessage(this.getPrefix() + msg);
    }

    public void sendError(ProxiedPlayer proxiedPlayer, boolean unkown) {
        if (unkown) {
            proxiedPlayer.sendMessage(getPrefix() + "Unbekannter Fehler.");
        } else {
            proxiedPlayer.sendMessage(getPrefix() + "Dazu hast du keine Rechte.");
        }
    }

    public String getPrefix() {
        return prefix;
    }

    public void sendMessage(CommandSender sender) {
    }
}
