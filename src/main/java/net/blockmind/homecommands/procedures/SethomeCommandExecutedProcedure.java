package net.blockmind.homecommands.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.blockmind.homecommands.network.BlockmindHomeCommandsModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SethomeCommandExecutedProcedure {
	public static void execute(double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		String location = "";
		if ((entity.level.dimension()) == (Level.OVERWORLD)) {
			if (!(StringArgumentType.getString(arguments, "HomeName"))
					.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home1Name)
					&& !(StringArgumentType.getString(arguments, "HomeName"))
							.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home2Name)
					&& !(StringArgumentType.getString(arguments, "HomeName"))
							.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home3Name)
					&& !(StringArgumentType.getString(arguments, "HomeName"))
							.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home4Name)
					&& !(StringArgumentType.getString(arguments, "HomeName"))
							.equals((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home5Name)) {
				location = x + " " + y + " " + z;
				if (DoubleArgumentType.getDouble(arguments, "HomeSlot") == 1) {
					if (((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home1).equals("")) {
						{
							String _setval = location;
							entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Home1 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = StringArgumentType.getString(arguments, "HomeName");
							entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Home1Name = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(
									Component
											.literal(
													("Home in slot 1 "
															+ (entity
																	.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY,
																			null)
																	.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home1Name
															+ " set.")),
									(false));
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Home slot 1 is already used."), (false));
					}
				} else if (DoubleArgumentType.getDouble(arguments, "HomeSlot") == 2) {
					if (((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home2).equals("")) {
						{
							String _setval = location;
							entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Home2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = StringArgumentType.getString(arguments, "HomeName");
							entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Home2Name = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(
									Component
											.literal(
													("Home in slot 2 "
															+ (entity
																	.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY,
																			null)
																	.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home2Name
															+ " set.")),
									(false));
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Home slot 2 is already used."), (false));
					}
				} else if (DoubleArgumentType.getDouble(arguments, "HomeSlot") == 3) {
					if (((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home3).equals("")) {
						{
							String _setval = location;
							entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Home3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = StringArgumentType.getString(arguments, "HomeName");
							entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Home3Name = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(
									Component
											.literal(
													("Home in slot 3 "
															+ (entity
																	.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY,
																			null)
																	.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home3Name
															+ " set.")),
									(false));
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Home slot 3 is already used."), (false));
					}
				} else if (DoubleArgumentType.getDouble(arguments, "HomeSlot") == 4) {
					if (((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home4).equals("")) {
						{
							String _setval = location;
							entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Home4 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = StringArgumentType.getString(arguments, "HomeName");
							entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Home4Name = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(
									Component
											.literal(
													("Home in slot 4 "
															+ (entity
																	.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY,
																			null)
																	.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home4Name
															+ " set.")),
									(false));
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Home slot 4 is already used."), (false));
					}
				} else if (DoubleArgumentType.getDouble(arguments, "HomeSlot") == 5) {
					if (((entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home5).equals("")) {
						{
							String _setval = location;
							entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Home5 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = StringArgumentType.getString(arguments, "HomeName");
							entity.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Home5Name = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(
									Component
											.literal(
													("Home in slot 5 "
															+ (entity
																	.getCapability(BlockmindHomeCommandsModVariables.PLAYER_VARIABLES_CAPABILITY,
																			null)
																	.orElse(new BlockmindHomeCommandsModVariables.PlayerVariables())).Home5Name
															+ " set.")),
									(false));
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Home slot 5 is already used."), (false));
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Home name already exists in your list."), (false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You must be in surface dimension to use sethome/homeset command."), (false));
		}
	}
}
