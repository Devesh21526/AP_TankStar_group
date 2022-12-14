package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Tanks {
    Texture tankimg;
    int health=100;

}
class tanks1 extends Tanks {
    public tanks1(){
        tankimg=new Texture("Helios.png");
    }
    int speed=20;
    int power=1500;
}
class tank2 extends Tanks{
    public tank2(){
        tankimg=new Texture("tank1.png");
    }

}
class tank3 extends Tanks{
    public tank3(){
        tankimg=new Texture("tank2.png");
    }

}
class tankem extends Tanks{
    public tankem(){
        tankimg=new Texture("enemy.png");
    }
}


