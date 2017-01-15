package a4040e072.a1109;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;


//歡迎畫面
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隱藏狀態列
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);

        //播放聲音
        //R.raw.mm 音檔路徑 , 記得在res底下新增raw資料夾
        //play(int soundID, float leftVolume, float rightVolume, int priority, int loop, float rate) ,
        // 其中leftVolume和rightVolume表示左右音量，priority表示优先级,loop表示循环次数,rate表示速率，
        // 如速率最低0.5最高为2，1代表正常速度

        MediaPlayer mediaPlayer;
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.mm);
        mediaPlayer.start();


        //延遲2秒
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //跳到主畫面
                startActivity(new Intent().setClass(MainActivity2.this, MainActivity.class));
                finish();
            }
        }, 2000);
    }
}
