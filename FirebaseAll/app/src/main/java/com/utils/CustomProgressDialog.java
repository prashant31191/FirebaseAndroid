package com.utils;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.firebaseall.R;


@SuppressLint("ResourceAsColor")
public class CustomProgressDialog extends Dialog
{
	//AnimationDrawable frameAnimation;
	//ImageView imgProgress;
	LinearLayout llMainBg;
	ProgressBar mProgressBar;

	public CustomProgressDialog(final Context context)
	{
		super(context);
		 getWindow().setLayout(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
		//getWindow().setBackgroundDrawableResource(R.drawable.prograss_bg); //temp removed

		getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.progressbar);
		
		
		
		llMainBg = (LinearLayout)findViewById(R.id.llMainBg);
		
		/*imgProgress=(ImageView)findViewById(R.id.imgProgress);
		imgProgress.setBackgroundResource(R.drawable.progress);
		// Typecasting the Animation Drawable
		frameAnimation = (AnimationDrawable) imgProgress.getBackground();     
		frameAnimation.start();*/
		
		
		setCancelable(false);
		
		mProgressBar = (ProgressBar)findViewById(R.id.progressBar);
		//mProgressBar.getIndeterminateDrawable().setColorFilter(new LightingColorFilter(0xFF000000, 0xFFAD9400));
		mProgressBar.getIndeterminateDrawable().setColorFilter(new LightingColorFilter(0xFF000000, 0xFF3D9AE8));

		setOnKeyListener(new OnKeyListener() {

		@Override
		public boolean onKey(DialogInterface arg0, int keyCode,
							 KeyEvent event) {
			// TODO Auto-generated method stub
			if (keyCode == KeyEvent.KEYCODE_BACK) {
				dismiss();

				((Activity) context).finish();
			}
			return true;
		}
	});
		
		
	/*	llMainBg.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				System.out.println("===llMainBg=====");
				return false;
			}
		});*/
		
		/*ImageView im  = new  ImageView(context);
		MaterialProgressDrawable materialProgressDrawable =  new MaterialProgressDrawable(context, llMainBg);
		materialProgressDrawable.updateSizes(0);
		materialProgressDrawable.showArrow(true);
		materialProgressDrawable.setArrowScale(0.7f);
		materialProgressDrawable.setStartEndTrim(0.5f, 90.f);
		materialProgressDrawable.setProgressRotation(150);
		materialProgressDrawable.setBackgroundColor(0xff00cc);
		materialProgressDrawable.setColorSchemeColors(0x00FF88);
		materialProgressDrawable.start();
		im.setImageDrawable(materialProgressDrawable);
		llMainBg.addView(im);*/


		/*dialog.setOnKeyListener(new Dialog.OnKeyListener() {

			@Override
			public boolean onKey(DialogInterface arg0, int keyCode,
								 KeyEvent event) {
				// TODO Auto-generated method stub
				if (keyCode == KeyEvent.KEYCODE_BACK) {
					finish();
					dialog.dismiss();
				}
				return true;
			}
		});

*/
	}

	public void setMessage(String message) 
	{
	}
}