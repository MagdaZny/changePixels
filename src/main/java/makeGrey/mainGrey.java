package makeGrey;

import edu.duke.ImageResource;

import java.io.File;

public class mainGrey{

 public static void main(String[] args) {

     File f = new File("/Users/magdazielezny/Documents/zdj", "20161108_102231.jpg");

         ImageResource inImage = new ImageResource(f);
         ImageResource grey = GreyScaleConverter.makeGrey(inImage);
         ImageSaver.doSave(grey);
         grey.draw();
     }
 }



