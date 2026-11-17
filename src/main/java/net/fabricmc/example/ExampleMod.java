package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;

public class ExampleMod implements ModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("[Legacy Sodium] Development bootstrap loaded for Minecraft 1.8.9.");
		System.out.println("[Legacy Sodium] Rendering optimizations are not implemented in this build yet.");
	}
}
