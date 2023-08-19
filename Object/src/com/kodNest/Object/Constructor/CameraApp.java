package com.kodNest.Object.Constructor;

public class CameraApp {

	public static void main(String[] args) {
          Camera c1=new Camera("Black","Sony",45000);
          Camera c2=new Camera("White","Cannon",35000);
                    
          c1.captureImage();
          c1.displayImage();
          
          c2.captureImage();
          c2.displayImage();
	}

}
