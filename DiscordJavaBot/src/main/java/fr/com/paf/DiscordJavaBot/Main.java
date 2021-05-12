package fr.com.paf.DiscordJavaBot;

import javax.annotation.Nonnull;
import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Hello world!
 *
 */
public class Main extends ListenerAdapter {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, LoginException {
		
		JDABuilder builder = JDABuilder.createDefault(args[0]);
		builder.addEventListeners(new Application());  
		builder.build();
		
	}


}
