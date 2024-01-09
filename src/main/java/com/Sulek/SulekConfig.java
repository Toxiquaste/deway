package com.Sulek;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("Sulek")
public interface SulekConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Sam Sulek says",
		description = "Sam Sulek says"
	)
	default String greeting()
	{
		return "I don't care if Arnold says it's for babies.. I'm gonna drink the milk.";
	}
}
