package com.creepgaming.nof3.client;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientEventHandler {

	
	@SubscribeEvent(priority=EventPriority.HIGHEST)
	public void onDebugRender(RenderGameOverlayEvent event){
		
		if (event.getType() != null && event.getType().equals(ElementType.DEBUG)){
			
			event.setCanceled(true);
		}
		
		
	}
	
}
