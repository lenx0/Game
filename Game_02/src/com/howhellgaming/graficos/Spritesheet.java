package com.howhellgaming.graficos;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Spritesheet {

    private BufferedImage spritesheet;

    public Spritesheet(String path){
        try {
            spritesheet = ImageIO.read(new File("C:/Users/Thiago/Documents/Projetos/ws-eclipse/GameDevelopment-JAVA-master/Game_02/res/spritesheet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getSprite(int x, int y, int width, int height){
        return spritesheet.getSubimage(x,y,width,height);

    }
}
