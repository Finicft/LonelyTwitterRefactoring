package ca.ualberta.cs.lonelytweet;

import android.util.Log;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		return !(tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20);
	}

	@Override
	public String toString() {
		String string = getTweetDate() + " | " + getTweetBody();
		Log.i("ImportantLonelyTweet", string);
		return string;
	}

	String getTweetBody() {
		return tweetBody.toUpperCase();
	}
}