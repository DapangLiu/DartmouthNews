package edu.dartmouth.cs.dartmouthnews;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
	// Declare some Views
	private TextView mNewsTextView;
	private Button mNextNewsButton;
	private RelativeLayout mRelativeLayout;

	// Declare & Initiate the News Hub
	NewsHub mHub = new NewsHub();;

	// Declare & Initiate a Color Wheel
	ColorWheel mWheel = new ColorWheel();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Binding Views with corresponding variables
		mNewsTextView = (TextView) findViewById(R.id.text_news_content);
		mNextNewsButton = (Button) findViewById(R.id.button_next_news);
		mRelativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);

		mNextNewsButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				mNewsTextView.setText(mHub.getNews());
				int color = mWheel.getColor();
				mRelativeLayout.setBackgroundColor(color);
				mNextNewsButton.setTextColor(color);
			}
		});
	}
}
