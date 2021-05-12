package fr.com.paf.DiscordJavaBot;


import com.merakianalytics.orianna.types.common.Region;
import com.merakianalytics.orianna.types.core.summoner.Summoner;

public class RiotConnexion {
	
	
	public static void main(String[] args) {

		Summoner summoneru = Summoner.named("Paaf").withRegion(Region.EUROPE_WEST).get();
		System.out.println(summoneru);

		//List<Summoner> summoners = Summoners.named("FatalElement", "Kalturi").withRegion(Region.NORTH_AMERICA).get();
		//summoners = Summoners.withIds(22508641L, 21359666L).withRegion(Region.NORTH_AMERICA).get();
		//summoners = Summoners.withAccountIds(36321079L, 34718348L).withRegion(Region.NORTH_AMERICA).get();
	}
}
