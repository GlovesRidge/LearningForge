package io.github.glovesridge.learningforge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;

@Mod(LearningForge.MODID)
public class LearningForge {

	public static final String MODID = "learningforge";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public LearningForge() {
		LOGGER.debug("Hello from Learning Forge!");
	}
	
}
