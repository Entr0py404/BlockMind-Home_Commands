package net.blockmind.homecommands.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.blockmind.homecommands.BlockmindHomeCommandsMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockmindHomeCommandsModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		BlockmindHomeCommandsMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer,
				PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.Home1 = original.Home1;
			clone.Home2 = original.Home2;
			clone.Home3 = original.Home3;
			clone.Home4 = original.Home4;
			clone.Home5 = original.Home5;
			clone.Home1Name = original.Home1Name;
			clone.Home2Name = original.Home2Name;
			clone.Home3Name = original.Home3Name;
			clone.Home4Name = original.Home4Name;
			clone.Home5Name = original.Home5Name;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("blockmind_home_commands", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public String Home1 = "";
		public String Home2 = "";
		public String Home3 = "";
		public String Home4 = "";
		public String Home5 = "";
		public String Home1Name = "";
		public String Home2Name = "";
		public String Home3Name = "";
		public String Home4Name = "";
		public String Home5Name = "";

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				BlockmindHomeCommandsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putString("Home1", Home1);
			nbt.putString("Home2", Home2);
			nbt.putString("Home3", Home3);
			nbt.putString("Home4", Home4);
			nbt.putString("Home5", Home5);
			nbt.putString("Home1Name", Home1Name);
			nbt.putString("Home2Name", Home2Name);
			nbt.putString("Home3Name", Home3Name);
			nbt.putString("Home4Name", Home4Name);
			nbt.putString("Home5Name", Home5Name);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			Home1 = nbt.getString("Home1");
			Home2 = nbt.getString("Home2");
			Home3 = nbt.getString("Home3");
			Home4 = nbt.getString("Home4");
			Home5 = nbt.getString("Home5");
			Home1Name = nbt.getString("Home1Name");
			Home2Name = nbt.getString("Home2Name");
			Home3Name = nbt.getString("Home3Name");
			Home4Name = nbt.getString("Home4Name");
			Home5Name = nbt.getString("Home5Name");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.Home1 = message.data.Home1;
					variables.Home2 = message.data.Home2;
					variables.Home3 = message.data.Home3;
					variables.Home4 = message.data.Home4;
					variables.Home5 = message.data.Home5;
					variables.Home1Name = message.data.Home1Name;
					variables.Home2Name = message.data.Home2Name;
					variables.Home3Name = message.data.Home3Name;
					variables.Home4Name = message.data.Home4Name;
					variables.Home5Name = message.data.Home5Name;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
