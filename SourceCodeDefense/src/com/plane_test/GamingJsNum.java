package com.plane_test;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class GamingJsNum {
	 //����
 	Bitmap score1;
 	Bitmap score2;
 	Bitmap score3;
 	Bitmap score4;
 	Bitmap score5;
 	Bitmap score6;
 	Bitmap score7;
 	Bitmap score8;
 	Bitmap score9;
 	Bitmap score10;
	Bitmap score11;
	
	public GamingJsNum(Bitmap score1, Bitmap score2, Bitmap score3,
			Bitmap score4, Bitmap score5, Bitmap score6, Bitmap score7,
			Bitmap score8, Bitmap score9, Bitmap score10, Bitmap score11)
	{
		this.score1=score1;
		this.score2=score2;
		this.score3=score3;
		this.score4=score4;
		this.score5=score5;
		this.score6=score6;
		this.score7=score7;
		this.score8=score8;
		this.score9=score9;
		this.score10=score10;
		this.score11=score11;
	
	}
	                                             //��ʼ     ͼƬ    
	public void draw(Canvas canvas, Paint paint,int qx,int qy,int mark,int k){
		 if(mark<=99999999)   
			{   
			
				int x7=mark/1000000%10;
				int x6=mark/100000%10;
				int x5=mark/10000%10;
				int x4=mark/1000%10;
				int x3=mark/100%10;
				int x2=mark/10%10;
				int x1 =mark%10;
				
	

				if(999999<=mark)
				{
				   if(x7==0){canvas.drawBitmap(score1,+qx,qy, paint);}
				   else if(x7==1){canvas.drawBitmap(score2,qx,qy, paint);}
				   else if(x7==2){canvas.drawBitmap(score3,qx,qy, paint);}
				   else if(x7==3){canvas.drawBitmap(score4,qx,qy, paint);}
				   else if(x7==4){canvas.drawBitmap(score5,qx,qy, paint);}
				   else if(x7==5){canvas.drawBitmap(score6,qx,qy, paint);}
				   else if(x7==6){canvas.drawBitmap(score7,qx,qy, paint);}
				   else if(x7==7){canvas.drawBitmap(score8,qx,qy, paint);}
				   else if(x7==8){canvas.drawBitmap(score9,qx,qy, paint);}
				   else if(x7==9){canvas.drawBitmap(score10,qx,qy, paint);}
				}
				if(99999<=mark)
				{
				   if(x6==0){canvas.drawBitmap(score1,k*1+qx,qy, paint);}
				   else if(x6==1){canvas.drawBitmap(score2,k*1+qx,qy,paint);}
				   else if(x6==2){canvas.drawBitmap(score3,k*1+qx,qy, paint);}
				   else if(x6==3){canvas.drawBitmap(score4,k*1+qx,qy, paint);}
				   else if(x6==4){canvas.drawBitmap(score5,k*1+qx,qy ,paint);}
				   else if(x6==5){canvas.drawBitmap(score6,k*1+qx,qy, paint);}
				   else if(x6==6){canvas.drawBitmap(score7,k*1+qx,qy, paint);}
				   else if(x6==7){canvas.drawBitmap(score8,k*1+qx,qy ,paint);}
				   else if(x6==8){canvas.drawBitmap(score9,k*1+qx,qy ,paint);}
				   else if(x6==9){canvas.drawBitmap(score10,k*1+qx,qy, paint);}
				}
				if(9999<=mark)
				{
				   if(x5==0){canvas.drawBitmap(score1,k*2+qx,qy, paint);}
				   else if(x5==1){canvas.drawBitmap(score2,k*2+qx,qy, paint);}
				   else if(x5==2){canvas.drawBitmap(score3,k*2+qx,qy, paint);}
				   else if(x5==3){canvas.drawBitmap(score4,k*2+qx,qy, paint);}
				   else if(x5==4){canvas.drawBitmap(score5,k*2+qx,qy, paint);}
				   else if(x5==5){canvas.drawBitmap(score6,k*2+qx,qy, paint);}
				   else if(x5==6){canvas.drawBitmap(score7,k*2+qx,qy, paint);}
				   else if(x5==7){canvas.drawBitmap(score8,k*2+qx,qy, paint);}
				   else if(x5==8){canvas.drawBitmap(score9,k*2+qx,qy, paint);}
				   else if(x5==9){canvas.drawBitmap(score10,k*2+qx,qy, paint);}
				}
				if(999<=mark)
				{
				   if(x4==0){canvas.drawBitmap(score1,k*3+qx,qy, paint);}
				   else if(x4==1){canvas.drawBitmap(score2,k*3+qx,qy, paint);}
				   else if(x4==2){canvas.drawBitmap(score3,k*3+qx,qy, paint);}
				   else if(x4==3){canvas.drawBitmap(score4,k*3+qx,qy, paint);}
				   else if(x4==4){canvas.drawBitmap(score5,k*3+qx,qy, paint);}
				   else if(x4==5){canvas.drawBitmap(score6,k*3+qx,qy, paint);}
				   else if(x4==6){canvas.drawBitmap(score7,k*3+qx,qy ,paint);}
				   else if(x4==7){canvas.drawBitmap(score8,k*3+qx,qy ,paint);}
				   else if(x4==8){canvas.drawBitmap(score9,k*3+qx,qy ,paint);}
				   else if(x4==9){canvas.drawBitmap(score10,k*3+qx,qy, paint);}
				}
				if(99<=mark)
				{
				   if(x3==0){canvas.drawBitmap(score1,k*4+qx,qy, paint);}
				   else if(x3==1){canvas.drawBitmap(score2,k*4+qx,qy,paint);}
				   else if(x3==2){canvas.drawBitmap(score3,k*4+qx,qy, paint);}
				   else if(x3==3){canvas.drawBitmap(score4,k*4+qx,qy ,paint);}
				   else if(x3==4){canvas.drawBitmap(score5,k*4+qx,qy ,paint);}
				   else if(x3==5){canvas.drawBitmap(score6,k*4+qx,qy ,paint);}
				   else if(x3==6){canvas.drawBitmap(score7,k*4+qx,qy ,paint);}
				   else if(x3==7){canvas.drawBitmap(score8,k*4+qx,qy ,paint);}
				   else if(x3==8){canvas.drawBitmap(score9,k*4+qx,qy ,paint);}
				   else if(x3==9){canvas.drawBitmap(score10,k*4+qx,qy, paint);}
				}
				if(9<=mark)
				{
				   if(x2==0){canvas.drawBitmap(score1,k*5+qx,qy, paint);}
				   else if(x2==1){canvas.drawBitmap(score2,k*5+qx,qy, paint);}
				   else if(x2==2){canvas.drawBitmap(score3,k*5+qx,qy ,paint);}
				   else if(x2==3){canvas.drawBitmap(score4,k*5+qx,qy, paint);}
				   else if(x2==4){canvas.drawBitmap(score5,k*5+qx,qy, paint);}
				   else if(x2==5){canvas.drawBitmap(score6,k*5+qx,qy, paint);}
				   else if(x2==6){canvas.drawBitmap(score7,k*5+qx,qy, paint);}
				   else if(x2==7){canvas.drawBitmap(score8,k*5+qx,qy, paint);}
				   else if(x2==8){canvas.drawBitmap(score9,k*5+qx,qy, paint);}
				   else if(x2==9){canvas.drawBitmap(score10,k*5+qx,qy, paint);}
				}
				 if(0<=mark) {  
					 if(x1==0){canvas.drawBitmap(score1,k*6+qx,qy, paint);}
					   else if(x1==1){canvas.drawBitmap(score2,k*6+qx,qy, paint);}
					   else if(x1==2){canvas.drawBitmap(score3,k*6+qx,qy ,paint);}
					   else if(x1==3){canvas.drawBitmap(score4,k*6+qx,qy, paint);}
					   else if(x1==4){canvas.drawBitmap(score5,k*6+qx,qy, paint);}
					   else if(x1==5){canvas.drawBitmap(score6,k*6+qx,qy, paint);}
					   else if(x1==6){canvas.drawBitmap(score7,k*6+qx,qy, paint);}
					   else if(x1==7){canvas.drawBitmap(score8,k*6+qx,qy, paint);}
					   else if(x1==8){canvas.drawBitmap(score9,k*6+qx,qy, paint);}
					   else if(x1==9){canvas.drawBitmap(score10,k*6+qx,qy, paint);}
				  }
		       
	
}
	}
}