package module.zzz.com.mytoast;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;

import module.zzz.com.mytoasty.Toasty;

import static android.graphics.Typeface.BOLD_ITALIC;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Success
     */
    private Button mBtnSuccess;
    /**
     * Warning
     */
    private Button mBtnWarning;
    /**
     * Error
     */
    private Button mBtnError;
    /**
     * Info
     */
    private Button mBtnInfo;

    /**
     * Normal
     */
    private Button mBtnNormal;
    /**
     * NormalIconNull
     */
    private Button mBtnNormalIconNull;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        initView();
    }

    private void initView() {
        mBtnSuccess=(Button) findViewById( R.id.btnSuccess );
        mBtnSuccess.setOnClickListener( this );
        mBtnWarning=(Button) findViewById( R.id.btnWarning );
        mBtnWarning.setOnClickListener( this );
        mBtnError=(Button) findViewById( R.id.btnError );
        mBtnError.setOnClickListener( this );
        mBtnInfo=(Button) findViewById( R.id.btnInfo );
        mBtnInfo.setOnClickListener( this );
        mBtnNormal=(Button) findViewById( R.id.btnNormal );
        mBtnNormal.setOnClickListener( this );
        mBtnNormalIconNull=(Button) findViewById( R.id.btnNormalIconNull );
        mBtnNormalIconNull.setOnClickListener( this );

    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btnSuccess:
                Toasty.success( MainActivity.this, "点击Success", Toasty.LENGTH_SHORT, true ).show();
                break;
            case R.id.btnWarning:
                Toasty.warning( MainActivity.this, "点击Warning", Toasty.LENGTH_SHORT, true ).show();
                break;
            case R.id.btnError:
                Toasty.error( MainActivity.this, "点击Error", Toasty.LENGTH_SHORT, true ).show();
                break;
            case R.id.btnInfo:
                Toasty.info( MainActivity.this, "点击Info", Toasty.LENGTH_SHORT, true ).show();
                break;
            case R.id.btnNormal:
                Drawable icon=getResources().getDrawable( R.drawable.ic_pets_white_48dp );
                Toasty.normal( MainActivity.this, "点击自定义图片的normal", icon ).show();
                break;
            case R.id.btnNormalIconNull:
                Toasty.normal( MainActivity.this, "点击不带图片的normal" ).show();
                break;
        }
    }

}
