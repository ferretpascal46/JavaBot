package fr.com.paf.DiscordJavaBot;

import javax.annotation.Nonnull;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Application extends ListenerAdapter{
	@Override
	public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
		if (event.getMessage().getContentRaw().toLowerCase().contains("on peut sortir ?")) {
			event.getChannel().sendMessage("Non. #RestezChezVous").queue();
		}
		System.out.println(event.getMessage().getContentRaw().toLowerCase());
	}
}
