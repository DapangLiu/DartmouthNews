package edu.dartmouth.cs.dartmouthnews;

import android.widget.TextView;
import java.util.Random;

class NewsHub {
	private String[] mNews = {
			"The library has purchased an 1866 edition of American Civil War photography.",
			"Employee resource networks provide support for underrepresented staff and faculty.",
			"Experts will highlight cutting-edge social, cognitive, and neuroscientific scholarship.",
			"In a week of orientation, first-year students find community.",
			"Three students make Team USA cut while balancing demanding training, academic schedules.",
	};


	// Randomly select News
	String getNews() {
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mNews.length);
		return mNews[randomNumber];
	}
}
