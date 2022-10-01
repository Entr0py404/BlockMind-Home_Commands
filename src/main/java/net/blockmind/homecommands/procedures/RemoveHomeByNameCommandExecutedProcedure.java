package net.blockmind.homecommands.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;

import net.blockmind.homecommands.network.BlockmindHomeCommandsModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class RemoveHomeByNameCommandExecutedProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "HomeName"))
				.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home1Name)) {
			{
				String _setval = "";
				entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Home1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "";
				entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Home1Name = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Home in slot 1 removed."), (false));
		} else if ((StringArgumentType.getString(arguments, "HomeName"))
				.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home2Name)) {
			{
				String _setval = "";
				entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Home2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "";
				entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Home2Name = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Home in slot 2 removed."), (false));
		} else if ((StringArgumentType.getString(arguments, "HomeName"))
				.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home3Name)) {
			{
				String _setval = "";
				entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Home3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "";
				entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Home3Name = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Home in slot 3 removed."), (false));
		} else if ((StringArgumentType.getString(arguments, "HomeName"))
				.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home4)) {
			{
				String _setval = "";
				entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Home4 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "";
				entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Home4Name = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Home in slot 4 removed."), (false));
		} else if ((StringArgumentType.getString(arguments, "HomeName"))
				.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home5Name)) {
			{
				String _setval = "";
				entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Home5 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "";
				entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Home5Name = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Home in slot 5 removed."), (false));
		}
	}
}
