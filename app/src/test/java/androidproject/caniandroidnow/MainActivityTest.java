package androidproject.caniandroidnow;

import android.widget.TextView;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest extends RobolectricTest {

  @Test
  public void testSomething() {

    MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);

    TextView textView = (TextView) mainActivity.findViewById(R.id.textView);
    Assert.assertThat(textView.getText().toString(), equalTo("Hello world!"));

  }
}

