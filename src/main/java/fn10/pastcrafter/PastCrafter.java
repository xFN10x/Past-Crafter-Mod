package fn10.pastcrafter;

import net.fabricmc.api.ModInitializer;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fn10.pastcrafter.reg.PastBlocks;

public class PastCrafter implements ModInitializer {
	public static final String MOD_ID = "past-crafter";
	public static final int version = 0;
	private static final Map<Integer, String> versionStrings = Map.of(0, "a1.0");

	public static String getVersionString() {
		return versionStrings.getOrDefault(version, "Unknown");
	}

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Past Crafter version " + version);

		PastBlocks.init();
	}
}