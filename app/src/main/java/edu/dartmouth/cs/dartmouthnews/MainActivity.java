package edu.dartmouth.cs.dartmouthnews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
  // Declare some Views
  private TextView mNewsTextView;
  private Button mNextNewsButton;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Binding Views with corresponding variables
    mNewsTextView = (TextView) findViewById(R.id.text_news_content);
    mNextNewsButton = (Button) findViewById(R.id.button_next_news);

    mNextNewsButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        // News Array
        String[] news = {
                "The library has purchased an 1866 edition of American Civil War photography.",
                "Employee resource networks provide support for underrepresented staff and faculty.",
                "Experts will highlight cutting-edge social, cognitive, and neuroscientific scholarship.",
                "In a week of orientation, first-year students find community.",
                "Three students make Team USA cut while balancing demanding training, academic schedules.",
        };

        // Randomly select News
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(news.length);
        String nextNews = news[randomNumber];
        // Update the News
        mNewsTextView.setText(nextNews);
      }
    });

  }
}
