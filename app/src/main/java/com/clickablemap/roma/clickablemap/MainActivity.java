package com.clickablemap.roma.clickablemap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageMap mImageMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageMap = (ImageMap) findViewById(R.id.map);
        mImageMap.setImageResource(R.drawable.europemap);

        mImageMap.addOnImageMapClickedHandler(new ImageMap.OnImageMapClickedHandler() {
            @Override
            public void onImageMapClicked(int id, ImageMap imageMap) {
                imageMap.mAreaList.get(0).getId();

                for(int i =0;i<imageMap.mAreaList.size();i++){
                    if((imageMap.mAreaList.get(i).getId() == id) || imageMap.mAreaList.get(9).getId() == id || imageMap.mAreaList.get(30).getId() == id){
                        showToast(imageMap.mAreaList.get(i).getName());
                    }
                }
            }

                @Override
                public void onBubbleClicked ( int id){

                }
            });
        }

    private void showToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
