package nirmal.developer.picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        Picasso.get().load("http://mywordsnthoughts.com/myworld/wp-content/uploads/2019/08/Keerthy_Suresh.jpeg").into(imageView);
    }
}
