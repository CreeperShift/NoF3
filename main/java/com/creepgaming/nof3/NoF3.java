package com.creepgaming.nof3;


import org.apache.logging.log4j.Logger;

import com.creepgaming.nof3.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NoF3.MODID, name = NoF3.MODNAME, version = NoF3.VERSION, useMetadata = true)
public class NoF3 {

	


		    public static final String MODID = "nof3";
		    public static final String MODNAME = "NoF3";
		    public static final String VERSION = "1.0.0";

		    @SidedProxy(clientSide = "com.creepgaming.nof3.proxy.ClientProxy", serverSide = "com.creepgaming.nof3.proxy.ServerProxy")
		    public static CommonProxy proxy;

		    @Mod.Instance
		    public static NoF3 instance;

		    public static Logger logger;

		    @Mod.EventHandler
		    public void preInit(FMLPreInitializationEvent event) {
		        logger = event.getModLog();
		        proxy.preInit(event);
		    }

		    @Mod.EventHandler
		    public void init(FMLInitializationEvent e) {
		        proxy.init(e);
		        
		        
		    }

		    @Mod.EventHandler
		    public void postInit(FMLPostInitializationEvent e) {
		        proxy.postInit(e);
		    }
		
		
		
		

	

}
