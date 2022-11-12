package net.blockmind.homecommands.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

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
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
										_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
										_ent.getDisplayName(), _ent.level.getServer(), _ent),
								("tp " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home1));
					}
				}
			} else if ((StringArgumentType.getString(arguments, "HomeName"))
					.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home2Name)) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
										_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
										_ent.getDisplayName(), _ent.level.getServer(), _ent),
								("tp " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home2));
					}
				}
			} else if ((StringArgumentType.getString(arguments, "HomeName"))
					.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home3Name)) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
										_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
										_ent.getDisplayName(), _ent.level.getServer(), _ent),
								("tp " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home3));
					}
				}
			} else if ((StringArgumentType.getString(arguments, "HomeName"))
					.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home4Name)) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
										_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
										_ent.getDisplayName(), _ent.level.getServer(), _ent),
								("tp " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home4));
					}
				}
			} else if ((StringArgumentType.getString(arguments, "HomeName"))
					.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home5Name)) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
										_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
										_ent.getDisplayName(), _ent.level.getServer(), _ent),
								("tp " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home5));
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(
							Component.literal(("No home found named " + StringArgumentType.getString(arguments, "HomeName") + ".")), (false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You must be in surface dimension to use home command."), (false));
		}
	}
}
