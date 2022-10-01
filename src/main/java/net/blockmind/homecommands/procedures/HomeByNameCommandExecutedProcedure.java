package net.blockmind.homecommands.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;

import net.blockmind.homecommands.network.BlockmindHomeCommandsModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class HomeByNameCommandExecutedProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level.dimension()) == (Level.OVERWORLD)) {
			if ((StringArgumentType.getString(arguments, "HomeName"))
					.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home1Name)) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								("tp " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home1));
				}
			} else if ((StringArgumentType.getString(arguments, "HomeName"))
					.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home2Name)) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								("tp " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home2));
				}
			} else if ((StringArgumentType.getString(arguments, "HomeName"))
					.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home3Name)) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								("tp " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home3));
				}
			} else if ((StringArgumentType.getString(arguments, "HomeName"))
					.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home4Name)) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								("tp " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home4));
				}
			} else if ((StringArgumentType.getString(arguments, "HomeName"))
					.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home5Name)) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								("tp " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home5));
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(
							new TextComponent(("No home found named " + StringArgumentType.getString(arguments, "HomeName") + ".")), (false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("You must be in surface dimension to use home command."), (false));
		}
	}
}
