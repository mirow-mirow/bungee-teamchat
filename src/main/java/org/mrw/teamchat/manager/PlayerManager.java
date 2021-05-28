package org.mrw.teamchat.manager;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;

/**
 * JavaDoc this file!
 * Created: 28.05.2021
 *
 * @author notMirow (email.mirowyt@gmail.com)
 */
public class PlayerManager {


    public static boolean isPlayer(CommandSender sender) {
        if (sender instanceof ProxiedPlayer) {
            return true;
        }
        return false;
    }
}
