package com.butClickCounter;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;

public class MainActivity extends Activity
{
	private Button btn;
	private int curNum;
	
	

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		btn = (Button)findViewById(R.id.button1);
//		btn.setOnClickListener(ocl);
		btn.setOnLongClickListener(olcl);
		btn.setOnTouchListener(otl);
		System.out.println("fgjb");
	}

//	private OnClickListener ocl= new OnClickListener(){
//
//		@Override
//		public void onClick(View p1)
//		{
//			curNum++;
//			btn.setText(Integer.toString(curNum));
//
//		}
//	};

	private OnLongClickListener olcl = new OnLongClickListener(){

		@Override
		public boolean onLongClick(View p1)
		{
			// TODO: Implement this method
			curNum = 0;
			btn.setText(R.string.but_init);
			return false;
		}
	
	};
	
	private OnTouchListener otl = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			if (p2.getAction()==MotionEvent.ACTION_DOWN)
			{
				curNum++;
				btn.setText(Integer.toString(curNum));	
			}
			// TODO: Implement this method
			return false;
		}

		
		
		
	};
}
