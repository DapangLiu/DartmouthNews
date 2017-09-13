package edu.dartmouth.cs.dartmouthnews;

import android.graphics.Color;

import java.util.Random;

class ColorWheel {
	private String[] mColors = {
			"#E91E63",
			"#9C27B0",
			"#2196F3",
			"#009688",
			"#FF9800",
			"#9E9E9E",
			"#9E9E9E",
			"#795548"
	};

	int getColor() {
		// Randomly select Color
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mColors.length);
		return Color.parseColor(mColors[randomNumber]);
	}
}
