package business;

import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


@Service
public class ProcessImage {
    private Image image = null;
    private String path;

    private void process() throws IOException {
        URL url = new URL(path);
        Image image = ImageIO.read(url);
        
    }

    public ProcessImage(String value) throws IOException {
        this.path=value;
        process();
    }

    public ProcessImage(){}
}
