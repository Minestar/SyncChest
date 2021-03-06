package de.minestar.syncchest.commands;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import de.minestar.syncchest.core.Core;
import de.minestar.syncchest.library.AbstractCommand;
import de.minestar.syncchest.library.AbstractSuperCommand;

public class SyncChestCommand extends AbstractSuperCommand {

    public SyncChestCommand(String syntax, String arguments, String node, AbstractCommand... subCommands) {
        super(Core.NAME, syntax, arguments, node, false, subCommands);
    }

    public void execute(String[] args, Player player) {
        // Do nothing
    }

    @Override
    public void execute(String[] args, ConsoleCommandSender console) {
        // Do nothing
    }
}