package com.creepgaming.nof3.proxy;

import com.creepgaming.nof3.client.ClientEventHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void init(FMLInitializationEvent e) {
		MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
		super.init(e);
	}
}
