package makeGrey;

import edu.duke.ImageResource;

public class ImageSaver {

    public static void doSave(ImageResource image){

            String fName = image.getFileName();
            String newName = "grey - " + fName;
            image.setFileName(newName);
            image.save();
    }
}
