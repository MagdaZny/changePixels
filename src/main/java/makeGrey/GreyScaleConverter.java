package makeGrey;

import edu.duke.DirectoryResource;
import edu.duke.ImageResource;
import edu.duke.Pixel;

import java.io.File;

public class GreyScaleConverter {

    public static ImageResource makeGrey(ImageResource inImage){

        ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());

        for(Pixel pixel: inImage.pixels()){

            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());

            int av = (inPixel.getBlue()+inPixel.getGreen()+inPixel.getRed())/3;
            pixel.setBlue(av);
            pixel.setGreen(av);
            pixel.setRed(av);
        }
        return outImage;
    }

    public void testGrey(){

        ImageResource ir = new ImageResource();
        ImageResource grey = makeGrey(ir);
        grey.draw();
    }

    public void selectAndConvert(){

        DirectoryResource dr = new DirectoryResource();

        for (File f: dr.selectedFiles()){
            ImageResource inImage = new ImageResource(f);
            ImageResource grey = makeGrey(inImage);
            grey.draw();
        }
    }


}
