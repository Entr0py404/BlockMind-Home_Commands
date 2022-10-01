package net.blockmind.homecommands.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.blockmind.homecommands.network.BlockmindHomeCommandsModVariables;

public class ListhomesCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home1Name).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						new TextComponent(("[Slot 1] " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home1Name)),
						(false));
		}
		if (!((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home2Name).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						new TextComponent(("[Slot 2] " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home2Name)),
						(false));
		}
		if (!((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home3Name).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						new TextComponent(("[Slot 3] " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home3Name)),
						(false));
		}
		if (!((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home4Name).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						new TextComponent(("[Slot 4] " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home4Name)),
						(false));
		}
		if (!((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home5Name).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						new TextComponent(("[Slot 5] " + (entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home5Name)),
						(false));
		}
		if (((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home1Name).equals("")
				&& ((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home2Name).equals("")
				&& ((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home3Name).equals("")
				&& ((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home4Name).equals("")
				&& ((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home5Name).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("No set homes in your list."), (false));
		}
	}
}
